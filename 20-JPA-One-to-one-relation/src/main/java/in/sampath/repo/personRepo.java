package in.sampath.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sampath.entity.person;

public interface personRepo extends JpaRepository<person, Integer>{

}
