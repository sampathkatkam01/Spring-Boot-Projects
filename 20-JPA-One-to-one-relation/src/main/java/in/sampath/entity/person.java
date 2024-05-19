package in.sampath.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "person_tbl")
public class person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer PersonId;
	
	private String Name;
	
	private String Gender;
	
	@OneToOne(mappedBy = "person",cascade = CascadeType.ALL)
	private Passport passport;

	public Integer getPersonId() {
		return PersonId;
	}

	public void setPersonId(Integer personId) {
		PersonId = personId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	

}
