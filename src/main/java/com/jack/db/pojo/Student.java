package com.jack.db.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Student {
    private int studentId;          // 学生ID

    private String name;             // 学生姓名

    private Date birthDate;     // 出生日期

    private String gender;           // 性别

    private String major;            // 专业

    private Date enrollmentDate; // 入学日期

    private String email;            // 邮箱

    private String phoneNumber;      // 联系电话


}