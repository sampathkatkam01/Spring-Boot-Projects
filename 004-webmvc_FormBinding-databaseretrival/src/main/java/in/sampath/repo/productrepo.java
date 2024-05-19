package in.sampath.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sampath.entity.productsdata;

public interface productrepo extends JpaRepository<productsdata, Integer> {

}
