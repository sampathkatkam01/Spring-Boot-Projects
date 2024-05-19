package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myapptest {

	public static void main(String[] args) {

		//starting IOC container
		@SuppressWarnings("resource")
		ApplicationContext cntst = new ClassPathXmlApplicationContext("springbeans.xml");
		
		RestaurantService rs1=cntst.getBean(RestaurantService.class);
		
		rs1.processpayments(1200.00);
		
		@SuppressWarnings("unused")
		RestaurantService rs2=(RestaurantService) cntst.getBean("rst");
		
		
			
		
		
		
		
	}
}
