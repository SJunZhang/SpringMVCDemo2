package com.zhang.springmvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BusinessExceptionHandler {
	
	@ExceptionHandler(BusinessException.class)
	public String businessExceptionHandler(){
		return "error/404";
	}
	

}
