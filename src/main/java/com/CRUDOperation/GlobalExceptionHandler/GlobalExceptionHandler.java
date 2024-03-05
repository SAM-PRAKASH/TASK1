package com.CRUDOperation.GlobalExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.CRUDOperation.CustomExceptionHandler.CustomException1;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ArithmeticException.class)
	public  String arithmeticExceptionHandler() {
		return "Faileed";
	}
	
	@ExceptionHandler(CustomException1.class)
	public  ResponseEntity<Object> customException11() {
        return new ResponseEntity<>("User not found",HttpStatus.BAD_REQUEST);
	}
}