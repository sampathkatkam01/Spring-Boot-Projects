package in.sampath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sampath.service.StuService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(Application.class, args);
		
		StuService bean = context.getBean(StuService.class);
		
		//bean.saveAllstudents();
		
		//bean.DeleteById();
		
		//bean.getAllstudents();
		
		//bean.getAllStuSort();
		
		//bean.getAllstuPagination();
		
		bean.getAllbyfilter();
		
	}

}
