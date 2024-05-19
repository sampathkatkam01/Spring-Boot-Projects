
package in.sampath.service;

import org.springframework.stereotype.Service;

import in.sampath.Repo.EmpRepository;
import in.sampath.entity.Employee;

@Service
public class EmpService {

	private EmpRepository empRepo;

	public EmpService(EmpRepository empRepo) {
		this.empRepo = empRepo;
	}

	public void saveEmployee() {
		
		System.out.println("Implimentaiton class :"+empRepo.getClass().getName());
        //Creating entity
		Employee e = new Employee();
		e.setEid(05);
		e.setEname("Rudra");
		e.setEsalary(73500.0);
		//Inserting record based on given obj
		empRepo.save(e);
		
		System.out.println("Record saved sucessfully...................");
	}

}
