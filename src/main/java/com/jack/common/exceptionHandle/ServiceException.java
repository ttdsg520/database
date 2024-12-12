package com.jack.common.exceptionHandle;

/**
 * 自定义业务异常模块
 */
public class ServiceException extends RuntimeException {

    public ServiceException(String message) {
        super(message);
    }


}
