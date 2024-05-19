package in.sampath.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.sampath.user.User;
import jakarta.validation.Valid;

@Controller
public class controller {
	
	@GetMapping("/user")
	public String form(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}

	@PostMapping("/user")
	public String Handle(@Valid User user, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			return "index";
		}else {
			model.addAttribute("msg", user.getName()+",Your details saved");
			System.out.println(user);
			return "index";
		}
		
	}
}
