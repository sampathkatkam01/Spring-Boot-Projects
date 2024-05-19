package in.sampath.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/welcome")
	public String getdata(@RequestParam("name") String name) {
		String message=name+",Welcome to RestApi";
		return message;
	}
	
	@GetMapping("/msg")
	public ResponseEntity<String > getmsg(){
		String msg="Hi , Welcome to application";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	@GetMapping(value = "/msg1" ,produces = "text/plain")
	public ResponseEntity<String > getmsg1(){
		String msg="Hello , Welcome to application";
		return new ResponseEntity<>(msg,HttpStatus.EARLY_HINTS);
	}
	
	@PostMapping("/date")
	public String localDate() {
		LocalDate date = LocalDate.now();
		LocalDateTime dt= LocalDateTime.now();
		return String.valueOf(dt);
	}
	
	@GetMapping("/greet/{name}")
	public String getmsg(@PathVariable("name") String name) {
		String msg=name+",Good Morning !";
		return msg;
	}

}
