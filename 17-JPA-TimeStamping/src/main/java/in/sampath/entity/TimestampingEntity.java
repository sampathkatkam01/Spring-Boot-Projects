package in.sampath.entity;

import java.time.LocalDate; 
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TimestampingEntity {
	@Id
	private Integer pid;
	private String pname;
	private Double pprice;
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDateTime Cd;

	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDate Ud;

	public LocalDateTime getCd() {
		return Cd;
	}

	public void setCd(LocalDateTime cd) {
		Cd = cd;
	}

	public LocalDate getUd() {
		return Ud;
	}

	public void setUd(LocalDate ud) {
		Ud = ud;
	}

	public TimestampingEntity() {
		// TODO Auto-generated constructor stub
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPprice() {
		return pprice;
	}

	public void setPprice(Double pprice) {
		this.pprice = pprice;
	}

	public TimestampingEntity(Integer pid, String pname, Double pprice, LocalDateTime cd, LocalDate ud) {
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		Cd = cd;
		Ud = ud;
	}

	@Override
	public String toString() {
		return "TimestampingEntity [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", Cd=" + Cd + ", Ud="
				+ Ud + "]";
	}

}
