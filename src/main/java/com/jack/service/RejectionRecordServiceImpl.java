package com.jack.service;

import com.jack.controller.dto.ReExaminationDTO;
import com.jack.controller.dto.RejectionRecordDTO;
import com.jack.db.mapper.ReExaminationMapper;
import com.jack.db.mapper.RejectionRecordMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: jack-su
 * @date: 2024/11/30 08:26:25
 * <p>
 * description:
 */

@Service
public class RejectionRecordServiceImpl implements RejectionRecordService {


    @Resource
    private ReExaminationMapper reExaminationMapper;

    @Resource
    private RejectionRecordMapper rejectionRecordMapper;


    @Override
    public Map preliminaryExamination(int id, int status, String remark) {


        HashMap map = new HashMap();


        if (status == 0) {
            // 通过
            map.put("status", 0);
            reExaminationMapper.updateStatus(id, 0);
        } else if (status == 1) {
            // 未通过
            map.put("reason", remark);
            reExaminationMapper.updateStatus(id, 1);
            //插入记录表
            ReExaminationDTO dto = reExaminationMapper.selectById(id);


            rejectionRecordMapper.insertRejectionRecord(RejectionRecordDTO.builder()
                    .reviewExamFormId(dto.getId())
                    .studentName(dto.getName())
                    .studentPhone(dto.getPhone())
                    .rejectionReason(1)
                    .reason(remark)
                    .createdAt(new Date())
                    .build());
        }

        return map;
    }
}
