package com.jack.service;

import com.jack.controller.dto.MentorDTO;
import com.jack.controller.dto.StudentDTO;
import com.jack.db.mapper.MentorMapper;
import com.jack.db.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: jack-su
 * @date: 2024/11/30 09:49:55
 * <p>
 * description:
 */


@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;


    @Resource
    private MentorMapper mentorMapper;


    @Override
    public int generateStudentInfo(StudentDTO dto) {


        studentMapper.generateStudentInfo(dto);


        return 1;
    }


    @Override
    public List<MentorDTO> getTeacherListByMajorId(String userId) {

        StudentDTO studentDTO = studentMapper.selectByUserId(userId);

        //当前学生所在专业下的导师列表
        List<MentorDTO> list = mentorMapper.selectMentorListByMajorId(studentDTO.getMajorId());
        if (list == null || list.size() == 0) {
            return new ArrayList<>();
        }

        return list;
    }


    /**
     * 申请导师
     *
     * @param userId
     * @param mentorId
     */
    @Override
    public void applyToMentorIdByMajorId(String userId, String mentorId) {

        StudentDTO studentDTO = studentMapper.selectByUserId(userId);

        //todo 申请导师逻辑
        Integer majorId = studentDTO.getMajorId();




    }
}
