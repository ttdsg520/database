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
 * @date: 2024/11/30 10:14:07
 * <p>
 * description:
 */


@Service
public class MentorServiceImpl implements MentorService {

    @Resource
    private MentorMapper mentorMapper;

    @Resource
    private StudentMapper studentMapper;


    @Override
    public List<StudentDTO> getStudentListByMajorId(int userId) {

        MentorDTO mentorDTO = mentorMapper.selectByUserId(userId);
        List<StudentDTO> list = studentMapper.selectStudentListByMajorId(mentorDTO.getMajorId());

        if (list == null || list.size() == 0) {
            return new ArrayList<>();
        }

        return list;
    }

    @Override
    public List<StudentDTO> getStudentListByMentorId(int userId) {

        MentorDTO mentorDTO = mentorMapper.selectByUserId(userId);

        List<StudentDTO> list = studentMapper.selectStudentListByMentorId(mentorDTO.getMentorId());

        if (list == null || list.size() == 0) {
            return new ArrayList<>();
        }

        return list;
    }
}
