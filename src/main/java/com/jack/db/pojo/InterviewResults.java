package com.jack.db.pojo;

import lombok.Data;

@Data
public class InterviewResults {

    private Integer id; // 主键
    private Integer reviewExamFormId; // 复试表ID (关联主表的ID)
    private String interviewTimeAndLocation; // 复试时间和地点
    private String evaluation; // 复试小组对考生复试表现的综合评价
    private String interviewLeaderSignature; // 复试组长签字
    private Double listeningSpeakingScore; // 外语听力及口语
    private Double professionalKnowledgeScore; // 专业知识测试
    private Double comprehensiveQualityScore; // 综合素质面试
    private Double totalScore; // 复试总成绩
    private String interviewMemberSignatures; // 复试组成员签字
    private String proposedMentorSignature; // 拟录取导师签字
}
