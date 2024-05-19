package in.ashokit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import servicejdbc.ServiceBook;

public class testapp {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext cnst = new ClassPathXmlApplicationContext("spring.xml");
		
		ServiceBook Bookserive = cnst.getBean(ServiceBook.class);
		
		Bookserive.saveBook();
		
		
	}
}
