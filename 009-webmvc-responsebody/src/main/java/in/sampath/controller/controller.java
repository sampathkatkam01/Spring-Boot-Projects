package in.sampath.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

	@GetMapping("/welcome/{name}")
	public String getmsg(@PathVariable("name") String name, Model model) {
		model.addAttribute("msg", name+"welcome to my application");
		return "index";
	}
	
	@GetMapping("/msg")
	@ResponseBody
	public String msg(@RequestParam("name") String name) {
		return name +",Sampath Katkam";
	}
}
