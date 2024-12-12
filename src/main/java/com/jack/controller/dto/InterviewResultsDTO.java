package com.jack.controller.dto;

import lombok.Data;
import java.math.BigDecimal;

/**
 * @author: jack-su
 * @date: 2024/11/30 08:00:01
 * <p>
 * description: 复试结果表实体类
 */
@Data
public class InterviewResultsDTO {

    private Integer reviewExamFormId;  // 复试表ID (关联主表的ID)
    private String interviewTimeAndLocation;  // 复试时间和地点
    private String evaluation;  // 复试小组对考生复试表现的综合评价（外语水平，专业知识，综合素质，培养潜质等方面）
    private String interviewLeaderSignature;  // 复试组长签字
    private BigDecimal listeningSpeakingScore;  // 外语听力及口语
    private BigDecimal professionalKnowledgeScore;  // 专业知识测试
    private BigDecimal comprehensiveQualityScore;  // 综合素质面试
    private BigDecimal totalScore;  // 复试总成绩
    private String interviewMemberSignatures;  // 复试组成员签字
    private String proposedMentorSignature;  // 拟录取导师签字

}
