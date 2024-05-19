package in.sampath.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class contoller2 {
	
	@ExceptionHandler(value=Exception.class)
	public String get(Exception e) {
		
	return "exception";
	}

}
