package in.sampath.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sampath.service.Bookserviceimpl;

public class testap {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext cnst = new ClassPathXmlApplicationContext("spring.xml");
		
		Bookserviceimpl BSI = cnst.getBean(Bookserviceimpl.class);
		
		BSI.updateBook();
	}

}
