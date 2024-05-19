package in.sampath.Repository;
 
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import in.sampath.Entity.Employee;


public interface EmpRepository extends CrudRepository<Employee, Integer> {
	
	
	    public List<Employee> findByEname(String ename);

		public List<Employee> findByEsalary(Double esalary);
		
		public List<Employee> findByEnameIsEndingWith(String ename);
		
		public List<Employee> findByEsalaryIsLessThan(Double esalary);
		
		public List<Employee> findByEsalaryGreaterThanEqual(Double salary);
		
		@Query("from Employee")
		public List<Employee> getAllempsHQL();
		
		@Query("from Employee where eid=:eid")
		public Employee getEmpById(Integer eid);
		
		@Query(value="select * from Employee",nativeQuery = true)
		public List<Employee> getAllemps();
	
	
}
