package in.sampath.Repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sampath.entity.ExcelEntity;

public interface ExcelRepo extends JpaRepository<ExcelEntity, Serializable> {

}
