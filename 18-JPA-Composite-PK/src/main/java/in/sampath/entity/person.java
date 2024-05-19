package in.sampath.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class person {
	private String Pname;
	private String email;
	private String Gender;
	@EmbeddedId
	private personPK personpk;

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public personPK getPersonpk() {
		return personpk;
	}

	public void setPersonpk(personPK personpk) {
		this.personpk = personpk;
	}

	@Override
	public String toString() {
		return "person [Pname=" + Pname + ", email=" + email + ", Gender=" + Gender + ", personpk=" + personpk + "]";
	}

}
