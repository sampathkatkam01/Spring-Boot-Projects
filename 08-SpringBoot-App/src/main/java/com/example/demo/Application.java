package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/")
	@ResponseBody
	public String getmessage() {
		return "SampathKatkam";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
