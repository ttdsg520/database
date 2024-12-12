package com.jack.db.mapper;

import com.jack.controller.dto.MentorDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: jack-su
 * @date: 2024/11/30 10:14:30
 * <p>
 * description:
 */

@Mapper
public interface MentorMapper
{
    List<MentorDTO> selectMentorListByMajorId(Integer majorId);


    MentorDTO selectByUserId(int userId);


}
