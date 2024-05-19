package in.sampath.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sampath.entiry.product;
import in.sampath.repo.Repo;

@Service
public class service {
	@Autowired
	private Repo repo;
	
	public List<product> getAllProducts() {
        return repo.findAll();
    }

	public void findall() {
		List<product> all = repo.findAll();
		all.forEach(System.out::println);
	}

	public void delete() {
		repo.deleteById(6);
	}

	public void saveall() {
		product e = new product();
		e.setName("sampath");
		e.setEmail("samapthkatkam9@gmail.com");
		e.setCity("Hyderabad");
		
		product e1 = new product();
		e1.setName("Srinu");
		e1.setEmail("srinu234@gmail.com");
		e1.setCity("Hyderabad");

		product e2 = new product();
		e2.setName("satya");
		e2.setEmail("satyakarre23@gmail.com");
		e2.setCity("chennai");
		
		product e3 =new product("Ravi","raviaktkam52@gmail.com","Yadadri");
		product e4 =new product("Hari","haridesh32@gmail.com","Bhongir");
		product e5 =new product("praveen","praveen23@gmail.com","Bombaipally");
		product e6=new product("Adhitya","adhitya23@gmail.com","Kushaiguda");


		List<product> asList = Arrays.asList(e6);
		repo.saveAll(asList);
		System.out.println("Records saved..............!!");
	}
}
