package in.sampath.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
	@GetMapping("/")
	public String get(Model model) {
		int i=1/0;
		model.addAttribute("msg", "welcome to app");
		return "index";
	}
	@GetMapping("/greet")
	public String greet(Model model) {
//		int r=1/000;
		model.addAttribute("msg", "Welcome to application");
		return "index";
	}
	
	//Controller based exception
//	@ExceptionHandler(value = Exception.class)
//	public String exphandle(Exception e) {
//		
//		//logic for storing exception in  log file
//		return "exception";
//	}

}
