package in.sampath.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Enquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;

	private String stuname;

	private Long stuphono;

	private String class_mode;

	private String course;

	private String status;

	@CreationTimestamp
	private LocalDate createddate;

	@UpdateTimestamp
	private LocalDate updateddate;

	@ManyToOne
	@JoinColumn(name = "counsellorid")
	private Counsellor counsellor;

	
	
	
	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public Long getStuphono() {
		return stuphono;
	}

	public void setStuphono(Long stuphono) {
		this.stuphono = stuphono;
	}

	public String getClass_mode() {
		return class_mode;
	}

	public void setClass_mode(String class_mode) {
		this.class_mode = class_mode;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Counsellor getCounsellor() {
		return counsellor;
	}

	public void setCounsellor(Counsellor counsellor) {
		this.counsellor = counsellor;
	}

	@Override
	public String toString() {
		return "Enquiry [eid=" + eid + ", stuname=" + stuname + ", stuphono=" + stuphono + ", class_mode=" + class_mode
				+ ", course=" + course + ", status=" + status + ", createddate=" + createddate + ", updateddate="
				+ updateddate + ", counsellor=" + counsellor + "]";
	}

	
	

	

	

	

}
