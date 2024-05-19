package in.sampath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import in.sampath.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context 
		                    = SpringApplication.run(Application.class, args);

		EmpService empservice = context.getBean(EmpService.class);

//		empservice.saveALLEmployees();

//		empservice.getempById(207);

//		List<Integer> ids = Arrays.asList(201,202,203,204,205);

//		empservice.getempsById(Arrays.asList(201,202,203,204,205));

//		empservice.getAllempsdetails();

//		empservice.deletebyid(203);

//		empservice.deleteAllById(Arrays.asList(205,206,207,208));

//		empservice.deleteAll();

//		empservice.count();

//		empservice.callFindByMethod();
		
		
		empservice.HqlcustumQueries();

	}
}