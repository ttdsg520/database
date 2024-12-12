package com.jack.common.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: jack-su
 * @date: 2024/10/22 13:26:33
 * <p>
 * description: 响应实体返回对象 ，用于封装返回的数据
 */


@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Response<T> implements Serializable {

    private String code;
    private String info;
    private T data;
}
