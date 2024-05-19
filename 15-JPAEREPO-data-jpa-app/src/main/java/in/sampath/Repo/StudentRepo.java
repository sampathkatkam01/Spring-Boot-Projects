package in.sampath.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sampath.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
	

}
