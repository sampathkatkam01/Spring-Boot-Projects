package in.sampath;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {
	
	@GetMapping("/welcome")
	@ResponseBody
	public String getmsg() {
		return "welcome to my page";
	}

}
