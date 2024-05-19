package in.sampath.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sampath.entiry.product;

@Repository
public interface Repo extends JpaRepository<product, Integer>{

}
