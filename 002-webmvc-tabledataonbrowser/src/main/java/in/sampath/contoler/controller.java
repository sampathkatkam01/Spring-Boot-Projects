package in.sampath.contoler;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.sampath.entiry.product;
import in.sampath.service.service;

@Controller
public class controller {
	@Autowired
	private service service;

	@GetMapping("/productdata")
	public ModelAndView getdata() {
		ModelAndView mav = new ModelAndView();
		List<product> products = service.getAllProducts();
		mav.addObject("productdata", products);
		mav.setViewName("index");
		return mav;
	}

}
