package in.sampath.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sampath.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
