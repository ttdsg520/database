package com.jack.service;

import com.jack.controller.dto.MentorDTO;
import com.jack.controller.dto.StudentDTO;

import java.util.List;

/**
 * @author: jack-su
 * @date: 2024/11/30 09:49:47
 * <p>
 * description:
 */

public interface StudentService {


    /**
     * 生成学生信息
     *
     * @return
     */
    int generateStudentInfo(StudentDTO dto);


    /**
     * 查看专业下的导师列表
     *
     * @param userId
     * @return
     */
    List<MentorDTO> getTeacherListByMajorId(String userId);


    void applyToMentorIdByMajorId(String userId, String mentorId);



}
