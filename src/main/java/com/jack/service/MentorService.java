package com.jack.service;

import com.jack.controller.dto.StudentDTO;

import java.util.List;

/**
 * @author: 
 * @date: 2024/11/30 10:14:00
 * <p>
 * description:
 */

public interface MentorService {


    List<StudentDTO> getStudentListByMajorId(int userId);


    List<StudentDTO> getStudentListByMentorId(int userId);

}
