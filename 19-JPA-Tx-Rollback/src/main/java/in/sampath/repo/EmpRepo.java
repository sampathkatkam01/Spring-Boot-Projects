package in.sampath.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sampath.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer> {

}
