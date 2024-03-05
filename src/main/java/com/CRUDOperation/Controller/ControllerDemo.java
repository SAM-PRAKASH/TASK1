package com.CRUDOperation.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ControllerDemo {

	@GetMapping(value="/getEmp")
	public String getMethodName() {
		return "HELLO ALL";
	}
	
	
}
