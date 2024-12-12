package com.jack.service;

import com.jack.controller.dto.InterviewResultsDTO;
import com.jack.db.mapper.InterviewResultsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: jack-su
 * @date: 2024/11/30 09:24:22
 * <p>
 * description:
 */


@Service
public class InterviewResultsServiceImpl implements InterviewResultsService {


    @Resource
    private InterviewResultsMapper interviewResultsMapper;


    @Override
    public void reExaminationPass(InterviewResultsDTO dto) {


        interviewResultsMapper.insert(dto);

    }
}
