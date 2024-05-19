package in.sampath.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class entity {
	@Id
	private Integer pid;
	private String pname;
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
	@Override
	public String toString() {
		return "entity [pid=" + pid + ", pname=" + pname + "]";
	}
	
	public entity() {
		// TODO Auto-generated constructor stub
	}
	public entity(Integer pid, String pname) {
		
		this.pid = pid;
		this.pname = pname;
	}
	
	

}
