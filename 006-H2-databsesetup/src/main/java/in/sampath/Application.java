package in.sampath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sampath.service.service;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cnst = SpringApplication.run(Application.class, args);
		service bean = cnst.getBean(service.class);
		//bean.save();
		bean.findbyid();
	}

}
