package in.sampath.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {

	@GetMapping("/welcome")
	public ModelAndView getewelcomemsg() {
		String msgtxt="Good morning";
		ModelAndView mav =new ModelAndView();
		mav.addObject("msg", msgtxt);
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping("/msg")
	public String getmsg(Model model) {
		String msgtext="My name is sampath";
		model.addAttribute("msg", msgtext);
		return "index";
	}
	
	
}
