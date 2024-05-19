package in.sampath.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class contoler {

	@GetMapping("/welcome1")
	public ModelAndView getmsg2() {
		ModelAndView mav= new ModelAndView();
		mav.addObject("msg1", "Welcome to the main page of my application");
		mav.setViewName("index");
		
		return mav;
	}
	
	@GetMapping("/welcome")
	public ModelAndView getmsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "SampathKatkam");
		mav.setViewName("index");
		return mav;

	}

}
