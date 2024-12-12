package com.jack.db.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author: jack-su
 * @date: 2024/11/30 08:00:01
 * <p>
 * description: 实体类对应于不通过记录表（rejection_record）
 */
@Data
public class RejectionRecord {

    private Integer id; // 主键
    private Integer reviewExamFormId; // 学生id
    private String studentName; // 学生名字
    private String studentPhone; // 学生手机号
    private Integer rejectionReason; // 不通过的原因 (0: 申请不通过, 1: 复试不通过)
    private String reason; // 备注
    private Date createdAt; // 创建时间
}
