package com.jack.common.exceptionHandle;

/**
 */
public enum ResultCodeInfo {

    SUCCESS(Code.SUCCESS, "操作成功"),
    ERROR(Code.ERROR, "操作失败"),
    SYS_EXCEPTION(Code.SYS_EXCEPTION, "系统异常"),
    SERVICE_EXCEPTION(Code.SERVICE_EXCEPTION, "服务内部错误"),
    PARAM_ERROR(Code.PARAM_ERROR, "参数错误"),
    NO_AUTHORITY_OPERATE(Code.NO_AUTHORITY_OPERATE, "无权操作"),
    REQUEST_TYPE_ERROR(Code.REQUEST_TYPE_ERROR, "请求错误"),
    IDENTITY_VERIFY_ERROR(Code.IDENTITY_VERIFY_ERROR, "身份校验失败"),
    IO_UPLOAD_ERROR(Code.IO_UPLOAD_ERROR, "文件上传失败"),
    IO_DELETE_ERROR(Code.IO_DELETE_ERROR, "文件删除失败"),
    IMAGE_CODE_ERROR(Code.IMAGE_CODE_ERROR, "图片验证码错误"),
    SMS_CODE_ERROR(Code.SMS_CODE_ERROR, "短信验证码错误"),
    PAGE_ERROR(Code.JWT_EXPIRE, "分页参数有误"),
    ACCOUNT_OR_PWD_ERROR(Code.ACCOUNT_OR_PWD_ERROR, "用户名或密码错误"),
    JWT_EXPIRE(Code.JWT_EXPIRE, "登录已失效, 请重新登录"),

    // 业务错误码
    BALANCE_NOT_ENOUGH(Code.BALANCE_NOT_ENOUGH, "账户余额不足"),
    ;

    private Integer code;

    private String result;

    ResultCodeInfo(Code code, String result) {
        this.code = code.getValue();
        this.result = result;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getResult() {
        return this.result;
    }
}
