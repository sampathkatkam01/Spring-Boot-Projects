package in.sampath.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sampath.entity.person;
import in.sampath.entity.personPK;

public interface personRepo extends JpaRepository<person, personPK> {

}
