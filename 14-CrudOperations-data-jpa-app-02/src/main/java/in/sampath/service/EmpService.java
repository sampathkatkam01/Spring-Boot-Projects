package in.sampath.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import in.sampath.Entity.Employee;
import in.sampath.Repository.EmpRepository;

@Service
public class EmpService {

	private EmpRepository emprepo;

	public EmpService(EmpRepository emprepo) {
		this.emprepo = emprepo;
	}

	public void HqlcustumQueries() {
		
		//List<Employee> emp = emprepo.getAllempsHQL();
		
	List<Employee> emp = emprepo.getAllemps();

	emp.forEach(e->System.out.println(e));
//		Employee emp = emprepo.getEmpById(207);
//		System.out.println(emp);
	}
	
	
	public void callFindByMethod() {
		// List<Employee> emps = emprepo.findByEname("virat");

		// List<Employee> emps = emprepo.findByEsalary(741852.00);

		// List<Employee> emps = emprepo.findByEsalaryGreaterThanEqual(1000.00);

		// List<Employee> emps = emprepo.findByEsalaryIsLessThan(10000.0);

		List<Employee> emps = emprepo.findByEnameIsEndingWith("t");

		if (emps.isEmpty()) {
			System.out.println("No Record found....");

		} else {
			emps.forEach(e -> System.out.println(e));
		}

	}

	public void getempById(Integer eid) {
		Optional<Employee> findbyid = emprepo.findById(eid);
		if (findbyid.isPresent()) {
			Employee employe = findbyid.get();
			System.out.println(employe);
		} else {
			System.out.println("Record not found");
		}
	}

	public void getempsById(List<Integer> eids) {
		Iterable<Employee> emps = emprepo.findAllById(eids);
		emps.forEach(e -> System.out.println(e));
	}

	public void getAllempsdetails() {
		Iterable<Employee> findall = emprepo.findAll();
		findall.forEach(System.out::println);
	}

	public void saveALLEmployees() {
		Employee e1 = new Employee(206, "srinu", 963258.0);
		Employee e2 = new Employee(207, "praveeen", 741852.00);
		Employee e3 = new Employee(208, "virat", 788578.020);
		Employee e4 = new Employee(209, "hari", 3698.0020);
		Employee e5 = new Employee(210, "sumanth", 8526.020);
		List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5);
		emprepo.saveAll(list);
		System.out.println("All the records saved......");
	}

	public void deletebyid(Integer eid) {
		emprepo.deleteById(eid);
		System.out.println("Record deleted....");
	}

	public void deleteAllById(List<Integer> eids) {
		emprepo.deleteAllById(eids);
		System.out.println("Records deleted................");
	}

	public void deleteAll() {
		emprepo.deleteAll();
		System.out.println("All the records deleted.....");
	}

	public void count() {

		long count = emprepo.count();
		System.out.println("Total records are :" + count);
	}

}
