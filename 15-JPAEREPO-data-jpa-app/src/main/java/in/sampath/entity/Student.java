package in.sampath.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private Integer sid;
	private String sname;
	private Double smarks;
	private String Sgrade;
	private String sbacklog;
	
	public Student() {
		
	}
	
	
	public Student(Integer sid, String sname, Double smarks, String sgrade, String sbacklog) {
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
		Sgrade = sgrade;
		this.sbacklog = sbacklog;
	}


	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Double getSmarks() {
		return smarks;
	}
	public void setSmarks(Double smarks) {
		this.smarks = smarks;
	}
	public String getSgrade() {
		return Sgrade;
	}
	public void setSgrade(String sgrade) {
		Sgrade = sgrade;
	}
	public String getSbacklog() {
		return sbacklog;
	}
	public void setSbacklog(String sbacklog) {
		this.sbacklog = sbacklog;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + ", Sgrade=" + Sgrade + ", sbacklog="
				+ sbacklog + "]";
	}
	
	
	
	
}
