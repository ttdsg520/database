package com.jack.controller.student;

import com.jack.common.exceptionHandle.ReturnBody;
import com.jack.controller.dto.MentorDTO;
import com.jack.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:
 * @date: 2024/11/30 10:08:21
 * <p>
 * description:
 */


@RequestMapping("/student")
@RestController
public class StudentController {

    @Resource
    private StudentService studentService;


    /**
     * 根据学生查询导师列表
     *
     * @param userId 学生id
     * @return
     */
    @RequestMapping("/getTeacherListByMajorId")
    public String getTeacherListByMajorId(String userId) {
        List<MentorDTO> teacherListByMajorId = studentService.getTeacherListByMajorId(userId);
        return ReturnBody.success(teacherListByMajorId);
    }


    /**
     * 学生向导师发起申请
     *
     * @param userId   学生id
     * @param mentorId 导师id
     * @return
     */
    public String applyToMentor(String userId, String mentorId) {

        studentService.applyToMentorIdByMajorId(userId, mentorId);


        return ReturnBody.success();
    }


    //学生查询自己的申请记录


}
