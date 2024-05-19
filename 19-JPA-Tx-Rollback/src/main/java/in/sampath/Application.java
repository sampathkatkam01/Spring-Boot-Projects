package in.sampath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sampath.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext contxt 
		= SpringApplication.run(Application.class, args);

		
		EmpService empService = contxt.getBean(EmpService.class);
		
		empService.save();
	}

}
