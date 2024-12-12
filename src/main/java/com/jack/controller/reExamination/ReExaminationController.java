package com.jack.controller.reExamination;

import com.jack.common.exceptionHandle.ReturnBody;
import com.jack.controller.dto.InterviewResultsDTO;
import com.jack.controller.dto.ReExaminationDTO;
import com.jack.service.RejectionRecordService;
import com.jack.service.reExamination.ReExaminationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: jack-su
 * @date: 2024/11/30 07:18:28
 * <p>
 * description:  复试管理   复试申请   复试通过  复试结果
 */

@RequestMapping("/reExamination")
@RestController
public class ReExaminationController {

    @Resource
    private ReExaminationService reExaminationService;


    @Resource
    private RejectionRecordService rejectionRecordService;

    /**
     * 填写申请表
     *
     * @return
     */
    @PostMapping("/fillOutTheApplicationForm")
    public String fillOutTheApplicationForm(ReExaminationDTO reExaminationDTO) {

        int i = reExaminationService.FillOutTheApplicationForm(reExaminationDTO);


        return ReturnBody.success(i);

    }


    /**
     * 初审
     *
     * @return
     */
    @PostMapping("/preliminaryExamination")
    public String preliminaryExamination(int id, int status, String remark) {

        return ReturnBody.success(rejectionRecordService.preliminaryExamination(id, status, remark));

    }


    /**
     * 复试申请通过，开始复试
     *
     * @return
     */
    @PostMapping("/reExaminationPass")
    public String reExaminationPass(int status, InterviewResultsDTO dto) {

        reExaminationService.reExaminationPass(status, dto);

        return ReturnBody.success();

    }





}
