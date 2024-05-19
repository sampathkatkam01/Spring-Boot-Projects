package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MYtestclass {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext cnst = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		Engineservice ES1=cnst.getBean(Engineservice.class);
		
		ES1.processpayment(14);	
	}

}
