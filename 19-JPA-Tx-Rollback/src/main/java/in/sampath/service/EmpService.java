package in.sampath.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sampath.entity.Address;
import in.sampath.entity.Emp;
import in.sampath.repo.AddressRepo;
import in.sampath.repo.EmpRepo;
import jakarta.transaction.Transactional;

@Service
public class EmpService {
	@Autowired
	private EmpRepo emprepo;

	@Autowired
	private AddressRepo addrrepo;

	@Transactional(rollbackOn = Exception.class)
	public void save() {

		Emp e = new Emp();

		e.setEname("samapth");
		e.setEsalary(78000.50);

		Emp savedEmployee = emprepo.save(e);

		System.out.println(savedEmployee);
		System.out.println("Record inserted in emptable");
		
		//int i=10/0;

		Address adr = new Address();

		adr.setCity("Hyd");
		adr.setState("TamilNadu");
		adr.setCountry("India");
		adr.setEid(savedEmployee.getEid());

		addrrepo.save(adr);
		System.out.println("Record inserted in Addresstable");

	}

}
