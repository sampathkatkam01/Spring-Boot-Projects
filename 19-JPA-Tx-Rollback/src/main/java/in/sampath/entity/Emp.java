package in.sampath.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Emp_tbl")
public class Emp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Eid;
	private String Ename;
	private Double Esalary;

	public Integer getEid() {
		return Eid;
	}

	public void setEid(Integer eid) {
		Eid = eid;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public Double getEsalary() {
		return Esalary;
	}

	public void setEsalary(Double esalary) {
		Esalary = esalary;
	}

	@Override
	public String toString() {
		return "Emp [Eid=" + Eid + ", Ename=" + Ename + ", Esalary=" + Esalary + "]";
	}
	

}
