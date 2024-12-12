package com.jack.controller.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author: jack-su
 * @date: 2024/11/30 07:30:01
 * <p>
 * description:
 */

@Data
@Getter
@Setter
public class ReExaminationDTO {

    private Integer id; // 主键
    private String interviewSubjectName; // 面试科目名称 (corrected the naming convention)
    private String admissionTicketNumber; // 准考证号
    private String name; // 姓名
    private Integer gender; // 性别 0:男 1:女
    private Integer candidateCategory; // 考生类别 0:应届生 / 1:往届生 / 2:同等学力
    private Integer studentType; // 考生类型 1:定向生 / 2:非定向考生
    private String undergraduateSchool; // 本科毕业学校
    private String graduationDate; // 本科毕业时间
    private String undergraduateMajor; // 毕业专业
    private String phone; // 考生手机号码
    private String emergencyContactPhone; // 紧急联系人手机
    private String preferredMentor1; // 导师优先意向1
    private String preferredMentor2; // 导师优先意向2
    private String preferredMentor3; // 导师优先意向3
    private String proposedResearchDirection; // 拟报研究方向
    private String acceptDirectionAdjustment; // 是否接受方向调整
    private String adjustmentPriority1; // 方向调整优先顺序1
    private String adjustmentPriority2; // 方向调整优先顺序2
    private String adjustmentPriority3; // 方向调整优先顺序3
    private String adjustmentPriority4; // 方向调整优先顺序4
    private String signature; // 考生签名
    private Integer status; // 复试结果状态 0:通过 1:未通过 2:确认导师
    private Date createdAt; // 创建时间
}
