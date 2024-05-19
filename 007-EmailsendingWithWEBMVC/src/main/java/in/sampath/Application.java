package in.sampath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sampath.service.Service;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cnst 
		= SpringApplication.run(Application.class, args);
		Service bean = cnst.getBean(Service.class);
		bean.registerUser(null);
	}

}
