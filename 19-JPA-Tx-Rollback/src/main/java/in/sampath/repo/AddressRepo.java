package in.sampath.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sampath.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
