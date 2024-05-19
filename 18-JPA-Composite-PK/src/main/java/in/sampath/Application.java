package in.sampath;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sampath.service.personservice;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext contst 
		= SpringApplication.run(Application.class, args);
	
		personservice bean = contst.getBean(personservice.class);
		
		bean.saveperson();
		bean.getperson();
		
	}

	
}
