package in.sampath.Controller;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.sampath.entity.User;
import in.sampath.service.Service;

@Controller
public class LoginController {
	
	private Service service;
	
	private PasswordEncoder pswd;

  @GetMapping("/login")
  public String showLoginForm() {
    return "login"; // login.html template
  }

  @PostMapping("/login")
  public String login(@RequestParam String email, @RequestParam String password, Model model) {
    User user = service.getUserByEmail(email);
    if (user != null) {
      // Validate password using PasswordEncoder (secure approach)
      if (pswd.matches(password, user.getPassword())){
        // Login successful! (Implement session management or redirect to dashboard)
        model.addAttribute("message", "Login successful!");
        return "dashboard"; // Replace with appropriate logic (e.g., redirect to dashboard)
      } else {
        model.addAttribute("error", "Invalid password!");
        return "login"; // Login failed, show login form again with error message
      }
    } else {
      model.addAttribute("error", "Invalid email or password!");
      return "login"; // Login failed, show login form again with error message (avoid revealing if email exists)
    }
  }
}
