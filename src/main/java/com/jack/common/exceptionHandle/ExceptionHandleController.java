package com.jack.common.exceptionHandle;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestController
@ControllerAdvice
public class ExceptionHandleController {


	@ExceptionHandler(NoHandlerFoundException.class)
	public String noHandlerFoundException(){
		return ReturnBody.error(ResultCodeInfo.REQUEST_TYPE_ERROR);
	}

	@ExceptionHandler(ServiceException.class)
	public String serviceException(ServiceException e){
		System.err.println("业务模块异常: "+ e.getMessage());
		e.printStackTrace();
		String message = e.getMessage();
		if (CommUtil.checkNull(message)) {
			try {
				JSONObject jsonObject = JSONObject.parseObject(message);
				return ReturnBody.error(jsonObject.getInteger("code"), jsonObject.getString("result"));
			}catch (Exception ex){
				return ReturnBody.error(Code.SYS_EXCEPTION, message);
			}
		}else {
			return ReturnBody.error(ResultCodeInfo.SYS_EXCEPTION);
		}
	}


	@ExceptionHandler(Exception.class)
	public String allException(Exception e){
		e.printStackTrace();
		return ReturnBody.error(ResultCodeInfo.SYS_EXCEPTION);
	}

}
