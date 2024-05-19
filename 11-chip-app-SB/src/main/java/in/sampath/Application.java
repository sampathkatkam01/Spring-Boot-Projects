package in.sampath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sampath.beans.Robot;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cnst = SpringApplication.run(Application.class, args);
		
		Robot b1 = cnst.getBean(Robot.class);
		
		b1.dowork();
	}

}
