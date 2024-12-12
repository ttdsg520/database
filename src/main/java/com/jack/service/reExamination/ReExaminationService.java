package com.jack.service.reExamination;

import com.jack.controller.dto.InterviewResultsDTO;
import com.jack.controller.dto.ReExaminationDTO;

import java.util.Map;

/**
 * @author: jack-su
 * @date: 2024/11/30 07:19:58
 * <p>
 * description:
 */

public interface ReExaminationService {


    /**
     * 填写申请表
     *
     * @param examinationDTO
     * @return
     */
    int FillOutTheApplicationForm(ReExaminationDTO examinationDTO);


    /**
     * 复试结果
     * 补充复试结果
     *
     * @param status
     * @param dto
     */
    void reExaminationPass(int status, InterviewResultsDTO dto);

}
