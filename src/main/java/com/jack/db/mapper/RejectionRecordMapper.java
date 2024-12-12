package com.jack.db.mapper;

import com.jack.controller.dto.RejectionRecordDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author:
 * @date: 2024/11/30 08:26:45
 * <p>
 * description:
 */

@Mapper
public interface RejectionRecordMapper {


    void insertRejectionRecord(RejectionRecordDTO dto);


}
