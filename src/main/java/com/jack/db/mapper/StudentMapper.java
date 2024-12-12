package com.jack.db.mapper;

import com.jack.controller.dto.StudentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: jack-su
 * @date: 2024/11/30 09:50:58
 * <p>
 * description:
 */
@Mapper
public interface StudentMapper {
    void generateStudentInfo(StudentDTO dto);


    StudentDTO selectByUserId(String userId);


    List<StudentDTO> selectStudentListByMajorId(Integer majorId);

    List<StudentDTO> selectStudentListByMentorId(String mentorId);

}
