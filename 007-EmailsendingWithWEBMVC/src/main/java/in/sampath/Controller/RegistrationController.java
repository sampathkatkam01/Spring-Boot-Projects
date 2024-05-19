package in.sampath.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.sampath.entity.User;

@Controller
public class RegistrationController {

  @Autowired
  private in.sampath.service.Service userService;

  @GetMapping("/register")
  public String showRegistrationForm(Model model) {
    model.addAttribute("user", new User());
    return "register"; // register.html template
  }

  @PostMapping("/register")
  public String registerUser(@ModelAttribute User user, Model model) {
    userService.registerUser(user);
    model.addAttribute("message", "Registration successful!");
    return "register";
  }
}
