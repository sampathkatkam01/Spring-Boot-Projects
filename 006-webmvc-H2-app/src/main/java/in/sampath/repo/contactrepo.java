package in.sampath.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import in.sampath.entity.Contact;

public interface contactrepo extends JpaRepository<Contact, Integer>{

}
