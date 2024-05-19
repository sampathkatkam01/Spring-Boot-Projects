package in.sampath.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.sampath.entity.Enquiry;

public interface EnquiryRepo extends JpaRepository<Enquiry, Integer> {

	@Query(value = "select count(*) from Enquiry where counsellorid=:id", nativeQuery = true)
	public Long getTotalEnquiries(Integer id);

	@Query(value = "select count(*) from Enquiry where counsellorid=:id and status=:status", nativeQuery = true)
	public Long getEnquiries(Integer id, String status);

}
