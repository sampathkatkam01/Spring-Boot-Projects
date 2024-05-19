package in.sampath.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import in.sampath.service.quoteService;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	private quoteService qs;

	@GetMapping("/")
	public String getquote(Model model) {
		qs.getquote();
		return "index";

	}
}
