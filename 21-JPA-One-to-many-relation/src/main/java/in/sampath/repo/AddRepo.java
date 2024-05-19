package in.sampath.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sampath.entity.Address;

public interface AddRepo extends JpaRepository<Address, Integer> {

}
