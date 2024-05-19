package in.sampath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sampath.service.Empservice;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cnst = SpringApplication.run(Application.class, args);

		Empservice bean = cnst.getBean(Empservice.class);

//		bean.saveemp();
		//bean.getemp();
//		bean.getaddress();
		bean.deleteemp();

	}

}
