package in.sampath.Repo;

import org.springframework.data.repository.CrudRepository;

import in.sampath.entity.Employee;


public interface EmpRepository extends CrudRepository<Employee, Integer>{
	
	

}
