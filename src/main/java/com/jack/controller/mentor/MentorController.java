package com.jack.controller.mentor;

import com.jack.common.exceptionHandle.ReturnBody;
import com.jack.controller.dto.StudentDTO;
import com.jack.service.MentorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: jack-su
 * @date: 2024/11/30 10:22:33
 * <p>
 * description:
 */

@RequestMapping("/mentor")
@RestController
public class MentorController {

    @Resource
    private MentorService mentorService;


    //查询当前通过本专业复试的学生列表,未选择导师的学生
    @PostMapping("/getStudentListByMajorId")
    public String getStudentListByMajorId(int userId) {

        List<StudentDTO> studentDTOS = mentorService.getStudentListByMajorId(userId);


        return ReturnBody.success(studentDTOS);

    }

    //导师查询自己的学生列表 已选择导师的学生
    @PostMapping("/getStudentListByMentorId")
    public String getStudentListByMentorId(int userId) {

        List<StudentDTO> studentDTOS = mentorService.getStudentListByMentorId(userId);

        return ReturnBody.success(studentDTOS);
    }


    //导师查询自己的学生的申请记录


    //导师审核学生的申请记录


    //导师查询自己的申请记录


}
