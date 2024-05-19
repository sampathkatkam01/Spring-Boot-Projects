package in.sampath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sampath.service.productService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cnst
		= SpringApplication.run(Application.class, args);
		
		productService productService = cnst.getBean(productService.class);
		
		//productService.getproduct();
		//productService.save();
		productService.getProductsSpec("sam",1000.0, 50000.0);
	}

}
