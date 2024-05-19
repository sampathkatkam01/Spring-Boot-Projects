package in.sampath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sampath.service.personService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cntxt =
				SpringApplication.run(Application.class, args);
		
		personService bean = cntxt.getBean(personService.class);
		
		bean.saveperson();
		bean.getperson();
		bean.getpassport();
	}

}
