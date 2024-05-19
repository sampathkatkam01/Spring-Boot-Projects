package in.sampath.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import in.sampath.dto.Dashboard;
import in.sampath.entity.Counsellor;
import in.sampath.service.CounselorService;
import in.sampath.service.EnquiryService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class CounselorController {

	@Autowired
	private CounselorService counservice;

	@Autowired
	private EnquiryService enqservice;
//register mapping
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("counsellor", new Counsellor());
		return "register";
	}
	@PostMapping("/register")
	public String handleregister(Model model , Counsellor coun) {
		boolean status = counservice.saveCounsellor(coun);
		if(status) {
			model.addAttribute("smsg", coun.getName()+",your registration  saved");
		}else {
			model.addAttribute("emsg", "failed to save");
		}
		return "register";
	}
	
	
	
//Login mapping
	@GetMapping("/")
	public String login(Model model) {
		model.addAttribute("counsellor", new Counsellor());
		return "index";
	}
	@PostMapping("/login")
	public String handlelogin(Model model,HttpServletRequest request, Counsellor counsellor) {
		Counsellor c = counservice.getCounsellor(counsellor.getEmail(), counsellor.getPassword());
		if (c == null) {
			model.addAttribute("emsg", "Invalid Credentials..");
			return "index";
		} else {
			//setting session in counsellorId
			HttpSession session = request.getSession(true);
			session.setAttribute("cid", c.getCounsellorid());
			
			Dashboard dInfo = enqservice.getDashboardInfo(c.getCounsellorid());
			model.addAttribute("dashboard", dInfo);
			return "dashboard";
		}
	}
	
	@GetMapping("/dashboard")
	public String  dashboardhandle(HttpServletRequest req,Model model) {
		
		HttpSession session = req.getSession(false);
		Integer cid = (Integer)session.getAttribute("cid");
		
		Dashboard dInfo = enqservice.getDashboardInfo(cid);
		model.addAttribute("dashboard", dInfo);
		return "dashboard";
	}
	
//Logout mapping	
	@GetMapping("/logout")
	public String logout(HttpServletRequest req, Model model) {
		
		
		HttpSession session = req.getSession(false);
		session.invalidate();
		return "redirect:/";
	}
}
