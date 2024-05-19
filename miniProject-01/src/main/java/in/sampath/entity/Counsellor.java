package in.sampath.entity;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Counsellor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer counsellorid;

	private String name;

	private String email;

	private String password;

	
	private Long phonenumber;

	@CreationTimestamp
	private LocalDate createddate;

	@UpdateTimestamp
	private LocalDate updateddate;

	@OneToMany(mappedBy = "counsellor", cascade = CascadeType.ALL)
	private List<Enquiry> enquiries;

	public Integer getCounsellorid() {
		return counsellorid;
	}

	public void setCounsellorid(Integer counsellorid) {
		this.counsellorid = counsellorid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public LocalDate getCreateddate() {
		return createddate;
	}

	public void setCreateddate(LocalDate createddate) {
		this.createddate = createddate;
	}

	public LocalDate getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(LocalDate updateddate) {
		this.updateddate = updateddate;
	}

	public List<Enquiry> getEnquiries() {
		return enquiries;
	}

	public void setEnquiries(List<Enquiry> enquiries) {
		this.enquiries = enquiries;
	}

	@Override
	public String toString() {
		return "Counsellor [counsellorid=" + counsellorid + ", name=" + name + ", email=" + email + ", password="
				+ password + ", phonenumber=" + phonenumber + ", createddate=" + createddate + ", updateddate="
				+ updateddate + ", enquiries=" + enquiries + "]";
	}

	
	
	

}
