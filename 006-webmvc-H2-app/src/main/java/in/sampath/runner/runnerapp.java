package in.sampath.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.sampath.entity.Contact;
import in.sampath.repo.contactrepo;
@Component
public class runnerapp implements ApplicationRunner{

	@Autowired
	private contactrepo repo;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Contact c1=new Contact();
		c1.setName("samapth");
		c1.setPhono(7894562784l);
		
		Contact c2=new Contact();
		c2.setName("Ravi");
		c2.setPhono(7418529337l);
		
		repo.saveAll(Arrays.asList(c1,c2));
	}
}
