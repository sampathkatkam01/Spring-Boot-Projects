package pwd.in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class textapp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		pwdencryption pwd1 = context.getBean(pwdencryption.class);

	
		String encodepassword = pwd1.encodepassword("sampathkatkam@1233");
		
		System.out.println(pwd1.hashCode());
		System.out.println(encodepassword);
		
		
		
		

	}

}
