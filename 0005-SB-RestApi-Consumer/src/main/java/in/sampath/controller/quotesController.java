package in.sampath.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import in.sampath.entity.Product;
import in.sampath.service.QuoteService;

@Controller
public class quotesController {

	@Autowired
	private QuoteService qs;

	@GetMapping("/product")
	public String getproduct(@RequestParam("pid") String pid, Model model) {
		Product product = qs.getProduct(pid);
		model.addAttribute("p", product);
		return "index";
	}

	@GetMapping("/")
	public String index(@ModelAttribute("p") Product p, Model model) {
		qs.getProducts();
		return "index";
	}

}
