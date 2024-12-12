package com.jack.db.mapper;

import com.jack.controller.dto.ReExaminationDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author:
 * @date: 2024/11/30 07:21:02
 * <p>
 * description:
 */

@Mapper
public interface ReExaminationMapper {


    int insert(ReExaminationDTO examinationDTO);


    void updateStatus(int id, int status);


    ReExaminationDTO selectById(int id);


}
