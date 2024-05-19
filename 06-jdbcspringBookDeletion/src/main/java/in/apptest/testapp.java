package in.apptest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sampath.service.DeleteService;

public class testapp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		DeleteService st = context.getBean(DeleteService.class);

		st.deletebook();

	}

}
