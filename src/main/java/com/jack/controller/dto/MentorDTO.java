package com.jack.controller.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class MentorDTO {


    private String mentorName; // 导师名字
    private String mentorId; // 导师ID (唯一标识)
    private String collegeId; // 关联学院ID
    private Integer majorId; // 关联专业ID
    private String email; // 导师邮箱
    private String phone; // 导师电话
    private Timestamp createdAt; // 创建时间
    private Timestamp updatedAt; // 更新时间
}
