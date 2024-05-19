package in.sampath.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sampath.entity.TimestampingEntity;

public interface productRepo extends JpaRepository<TimestampingEntity, Integer> {

}
