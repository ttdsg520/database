package com.jack.common.exceptionHandle;

import lombok.Data;

@Data
public class MsException extends RuntimeException {
    private String msg;
    private int code = 500;

    public MsException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public MsException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public MsException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public MsException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

}