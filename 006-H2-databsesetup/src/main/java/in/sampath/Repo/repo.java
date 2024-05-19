package in.sampath.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sampath.entity.entity;

public interface repo extends JpaRepository<entity, Integer> {

}
