package in.sampath.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sampath.binding.bindingdata;

@RestController
public class controller2 {

	@GetMapping(value = "/customers", produces = "application/json")
	public ResponseEntity<List<bindingdata>> getlist() {
		ArrayList<bindingdata> list = new ArrayList<bindingdata>();
		bindingdata e1 = new bindingdata(101, "sampathKatkam", "samapthkatkam78@gmail.com");
		list.add(e1);
		bindingdata e2 = new bindingdata(104, "srinivas", "srinivas@gmail.com");
		list.add(e2);
		bindingdata e3 = new bindingdata(105, "hari", "hari@gmail.com");
		list.add(e3);
		bindingdata e4 = new bindingdata(107, "suryakumar", "surya@gmail.com");
		list.add(e4);
		List<bindingdata> list1 = Arrays.asList(e1, e2, e3, e4);
		return new ResponseEntity<>(list1, HttpStatus.OK);
	}

	@GetMapping(value = "/customer", produces = "application/json")
	public ResponseEntity<bindingdata> getmsg() {
		bindingdata bd = new bindingdata(101, "sampath", "sampathkatkam9@gmail.com");
		return new ResponseEntity<>(bd, HttpStatus.OK);
	}

	@PostMapping(value = "/customer",produces = "application/json", consumes = "application/json")
	public ResponseEntity<String> createrecord(@RequestBody bindingdata db) {

		System.out.println(db);

		return new ResponseEntity<>("Record saved", HttpStatus.CREATED);

	}
	
	@DeleteMapping(value = "/customer/{id}",produces = "text/plain", consumes = "application/json")
	public ResponseEntity<String> deletecustomer(@PathVariable("id")  Integer id){
		//TODO db 
		
		return new ResponseEntity<>("Record Deleted",HttpStatus.OK);
	}
	

}
