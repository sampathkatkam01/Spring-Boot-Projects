package in.sampath.ProductRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.sampath.Entity.productEntity;

@RepositoryRestResource(path = "product")
public interface RestDataRepo extends JpaRepository<productEntity, Integer> {

}
