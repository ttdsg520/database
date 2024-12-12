package com.jack.db.mapper;

import com.jack.controller.dto.InterviewResultsDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author:
 * @date: 2024/11/30 09:25:13
 * <p>
 * description:
 */

@Mapper
public interface InterviewResultsMapper {


    void insert(InterviewResultsDTO dto);


}
