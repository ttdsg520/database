package com.jack.service.reExamination;

import com.jack.common.UUIDUtil;
import com.jack.controller.dto.InterviewResultsDTO;
import com.jack.controller.dto.ReExaminationDTO;
import com.jack.controller.dto.RejectionRecordDTO;
import com.jack.controller.dto.StudentDTO;
import com.jack.db.mapper.ReExaminationMapper;
import com.jack.db.mapper.RejectionRecordMapper;
import com.jack.db.mapper.StudentMapper;
import com.jack.service.InterviewResultsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author: jack-su
 * @date: 2024/11/30 07:20:07
 * <p>
 * description:
 */

@Service
public class ReExaminationServiceImpl implements ReExaminationService {


    @Resource
    private ReExaminationMapper reExaminationMapper;

    @Resource
    private InterviewResultsService interviewResultsService;

    @Resource
    private RejectionRecordMapper rejectionRecordMapper;

    @Resource
    private StudentMapper studentMapper;

    /**
     * 填写申请表
     *
     * @param examinationDTO
     * @return
     */
    @Override
    public int FillOutTheApplicationForm(ReExaminationDTO examinationDTO) {


        examinationDTO.setStatus(-1);
        examinationDTO.setCreatedAt(new Date());

        int rows = reExaminationMapper.insert(examinationDTO);

        if (rows != 1) {

            throw new RuntimeException("填写申请表失败");
        }

        return rows;
    }


    @Transactional
    @Override
    public void reExaminationPass(int status, InterviewResultsDTO dto) {


        if (status == 2) {

            reExaminationMapper.updateStatus(dto.getReviewExamFormId(), status);

            interviewResultsService.reExaminationPass(dto);
        } else if (status == 3) {

            reExaminationMapper.updateStatus(dto.getReviewExamFormId(), status);

            //插入记录表
            ReExaminationDTO reExaminationDTO = reExaminationMapper.selectById(dto.getReviewExamFormId());
            rejectionRecordMapper.insertRejectionRecord(RejectionRecordDTO.builder()
                    .reviewExamFormId(reExaminationDTO.getId())
                    .studentName(reExaminationDTO.getName())
                    .studentPhone(reExaminationDTO.getPhone())
                    .rejectionReason(1)
                    .reason("复试未通过")
                    .createdAt(new Date())
                    .build());


            //补充复试表
            interviewResultsService.reExaminationPass(dto);




            //生成学生信息
            studentMapper.generateStudentInfo(StudentDTO.builder()
                    .studentName(reExaminationDTO.getName())
                    .studentId(UUIDUtil.generate6DigitUUID())  // 生成学号六位数
                    .collegeId("10010")
                    .majorId(101)
                    .retestId(reExaminationDTO.getId())
                    .status("0")
                    .createTime(new Date()).build());


        }


    }
}
