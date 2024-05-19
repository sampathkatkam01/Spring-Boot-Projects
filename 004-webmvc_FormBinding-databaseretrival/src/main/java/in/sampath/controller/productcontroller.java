package in.sampath.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import in.sampath.entity.productsdata;
import in.sampath.service.productService;

@Controller
public class productcontroller {

	@Autowired
	private productService pservice;

	// form loading GET
	@GetMapping("/")
	public ModelAndView loadform() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("pobj", new productsdata());
		mav.setViewName("index");
		return mav;
	}

	// save products POST
	@PostMapping("/products")
	public ModelAndView saveproducst(productsdata p) {
		ModelAndView mav = new ModelAndView();
		boolean saveproducts = pservice.saveproducts(p);
		if (saveproducts) {
			mav.addObject("sucessmsg", "Products details saved....");
		} else {
			mav.addObject("errormsg", "products details not saved !!!!!");
		}
		mav.addObject("pobj", new productsdata());
		mav.setViewName("index");
		return mav;

	}

	// get products GET
	@GetMapping("/data")
	public ModelAndView getproducts() {
		List<productsdata> listofproducts = pservice.getAllproducts();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("data");
		mav.addObject("plist", listofproducts);
		return mav;
	}
	
	
	//edit products GET
	
	public ModelAndView editproducts() {
		ModelAndView mav=new ModelAndView();
		
		return mav;
	}

}
