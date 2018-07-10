package com.mayiedu.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author Administrator
 *
 */
@ControllerAdvice(basePackages="com.mayiedu.controller")
public class ErrorAOP {
	
	
	@ResponseBody  //因为拦截的方法是返回json格式，那么你拦截处理后也要返回json串格式
	@ExceptionHandler(RuntimeException.class)
	public String exceptionHandler() {
		return "error";
	}
}
