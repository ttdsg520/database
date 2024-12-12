package com.jack.service;

import java.util.Map;

/**
 * @author: jack-su
 * @date: 2024/11/30 08:26:17
 * <p>
 * description:
 */

public interface RejectionRecordService {


    /**
     * 复试初审
     * 研究生管理秘书
     * 初步审核复试申请表
     *
     * @param id
     * @param status
     * @return
     */
    Map preliminaryExamination(int id, int status, String remark);


}
