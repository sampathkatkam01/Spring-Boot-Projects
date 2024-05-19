package in.sampath.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sampath.entity.Employee;

public interface empRepo extends JpaRepository<Employee, Integer>{

}
