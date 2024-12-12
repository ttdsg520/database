package com.jack.controller.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author: jack-su
 * @date: 2024/11/30 08:30:01
 * <p>
 * description: 学生表实体类
 */
@Data
@Builder
public class StudentDTO {

    private String studentName;  // 学生名字
    private String studentId;  // 学生ID (唯一标识)
    private String collegeId;  // 学院ID
    private Integer majorId;  // 专业ID
    private Integer retestId;  // 复试ID
    private Integer mentorId;  // 导师ID
    private String status;  // 选择状态 ：  0：未选择导师 / 1:已选择导师
    private Date createTime;  // 创建时间

}
