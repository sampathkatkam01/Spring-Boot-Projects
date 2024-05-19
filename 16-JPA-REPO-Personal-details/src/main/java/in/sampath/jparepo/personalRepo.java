package in.sampath.jparepo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sampath.Entity.PersonalEntity;

public interface personalRepo extends JpaRepository<PersonalEntity, String> {

}
