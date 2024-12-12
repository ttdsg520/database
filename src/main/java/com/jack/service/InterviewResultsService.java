package com.jack.service;

import com.jack.controller.dto.InterviewResultsDTO;

/**
 * @author: jack-su
 * @date: 2024/11/30 09:24:17
 * <p>
 * description:
 */

public interface InterviewResultsService {


    /**
     * 复试结果
     * 补充复试结果
     *
     * @param dto
     */
    void reExaminationPass(InterviewResultsDTO dto);

}
