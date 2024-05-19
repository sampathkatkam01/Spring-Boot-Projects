package in.sampath.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.sampath.entity.Enquiry;
import in.sampath.service.EnquiryService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class enquiryController {

	@Autowired
	private EnquiryService enqservice;

	// add enq-page
	@GetMapping("/addenq")
	public String addEnquiry(Enquiry enq, Model model) {
		model.addAttribute("enq", new Enquiry());
		return "addenq";
	}

	// save-enq
	@PostMapping("/addenq")
	public String saveEnquiry(Model model, HttpServletRequest req, Enquiry enq) {

		HttpSession session = req.getSession(false);
		Integer cid = (Integer) session.getAttribute("cid");

		boolean status = enqservice.addEnquiry(enq, cid);
		if (status) {
			model.addAttribute("smsg", "Enquiry saved");
		} else {
			model.addAttribute("emsg", "Enquiry not saved");
		}
		model.addAttribute("enq", new Enquiry());
		return "addenq";
	}

	// view -enq
	@GetMapping("/enquires")
	public String getEnquiries(Model model, HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		Integer cid = (Integer) session.getAttribute("cid");

		List<Enquiry> list = enqservice.getEnquiries(new Enquiry(), cid);
		model.addAttribute("enqs", list);

		model.addAttribute("enq", new Enquiry());

		return "viewenquires";

	}

	// filter-enq
	@PostMapping("/filter")
	public String getfilters(@ModelAttribute("enq") Model model, HttpServletRequest req, Enquiry enq) {
		HttpSession session = req.getSession(false);
		Integer cid = (Integer) session.getAttribute("cid");

		List<Enquiry> list = enqservice.getEnquiries(enq, cid);
		model.addAttribute("enqs", list);

		return "viewenquires";
	}

	// edit and update
	@GetMapping("/edit")
	public String editEnquiry(@RequestParam("enqid") Model model, Integer enqid) {
		Enquiry enquiry = enqservice.getEnquiry(enqid);
		model.addAttribute("enq", enquiry);
		return "addenq";

	}

}
