package in.sampath.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sampath.entity.Passport;

public interface passportRepo extends JpaRepository<Passport, Integer> {

}
