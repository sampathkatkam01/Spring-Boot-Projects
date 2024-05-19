package in.sampath.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sampath.entity.Address;
import in.sampath.entity.Employee;
import in.sampath.repo.AddRepo;
import in.sampath.repo.empRepo;

@Service
public class Empservice {
	@Autowired
	private empRepo emprepo;
	@Autowired
	private AddRepo addrepo;

	
	public void deleteemp() {
		emprepo.deleteById(1);
	}
	public void getemp() {

		Optional<Employee> byId = emprepo.findById(1);

		if (byId.isPresent()) {
			Employee employee = byId.get();
			// List<Address> addlist = employee.getAddlist();
			System.out.println(employee);
		}
	}

	public void getaddress() {
		addrepo.findById(1);
	}

	public void saveemp() {

		Employee emp = new Employee();

		emp.setEname("sampath");
		emp.setEsalary(4785.22);

		Address a1 = new Address();

		a1.setCity("Hyderabad");
		a1.setCountry("India");
		a1.setState("Telangana");
		a1.setType("Permanant");
		a1.setEmp(emp);

		Address a2 = new Address();

		a2.setCity("chennai");
		a2.setCountry("India");
		a2.setState("Tamilnadu");
		a2.setType("office");
		a2.setEmp(emp);

		List<Address> asList = Arrays.asList(a1, a2);

		emp.setAddlist(asList);

		emprepo.save(emp);

	}

}
