package in.sampath.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.sampath.DTO.LoginDto;
import in.sampath.DTO.RegisterDto;
import in.sampath.DTO.ResetPwdDto;
import in.sampath.DTO.UserDto;
import in.sampath.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userservice;

	@GetMapping("/register")
	public String registerPage(Model model) {

		model.addAttribute("registerDto", new RegisterDto());

		// Map<Integer, String> countriesMap = userservice.getCountries();

		model.addAttribute("countires", userservice.getCountries());
		return "registerView";
	}

	@GetMapping("/states/{cid}")
	@ResponseBody
	public Map<Integer, String> getStates(@PathVariable("cid") Integer cid) {
		return userservice.getStates(cid);
	}

	// getmaping to cities
	@GetMapping("/cities/{sid}")
	@ResponseBody
	public Map<Integer, String> getCities(@PathVariable("sid") Integer sid) {
		return userservice.getCities(sid);
	}

	@PostMapping("/register")
	public String register(RegisterDto regDto, Model model) {

		UserDto user = userservice.getUser(regDto.getEmail());

		if (user != null) {
			model.addAttribute("emsg", "Duplicate Email address");
			return "registerView";
		}

		boolean registerUser = userservice.registerUser(regDto);
		if (registerUser) {
			model.addAttribute("smsg", regDto.getName() + ",Registred Succeddfully");
		} else {
			model.addAttribute("esmg", "User Registration Faild...");
		}

		return "registerView";
	}

	@GetMapping("/")
	public String loginPage(Model model) {
		model.addAttribute("loginDto", new LoginDto());
		return "index";
	}

	@PostMapping("/login")
	public String login(LoginDto loginDto, Model model) {
		UserDto userLogin = userservice.getUserLogin(loginDto);
		if (userLogin == null) {
			model.addAttribute("emsg", "Invalid Credentials..");
			return "index";
		}

		if ("yes".equals(userLogin.getUpdatedpwd())) {
			// If password already updated go to dashboard page
			return "redirect:dashboard";
		} else {
			// If password not updated go to resetpassword page
			ResetPwdDto resetPwdDto = new ResetPwdDto();
			resetPwdDto.setEmail(userLogin.getEmail());
			model.addAttribute("resetPwdDto", resetPwdDto);
			return "resetpwdView";
		}
	}

	@PostMapping("/resetpwd")
	public String resetPwd(ResetPwdDto pwdDto, Model model) {

		if (!(pwdDto.getNewpwd().equals(pwdDto.getConfirmpwd()))) {
			model.addAttribute("emsg", "New Password and Confirm Password should match");
			return "resetpwdView";
		}
		UserDto user = userservice.getUser(pwdDto.getEmail());

		if (user.getPassword().equals(pwdDto.getOldPwd())) {
			boolean resetPwd = userservice.resetPwd(pwdDto);
			if (resetPwd) {
				return "redirect:dashboard";
			} else {
				model.addAttribute("emsg", "Password Updataiton Failed");
				return "resetpwdView";
			}
		} else {
			model.addAttribute("emsg", "Provided Wrong Old Password");
			return "resetpwdView";
		}
	}

	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		String quotes = userservice.getQuote();
		model.addAttribute("quote", quotes);
		return "dashboardView";
	}

	@GetMapping("/logout")
	public String logout() {
		return "redirect:/";
	}

}
