package in.sampath.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sampath.entity.Passport;
import in.sampath.entity.person;
import in.sampath.repo.passportRepo;
import in.sampath.repo.personRepo;

@Service
public class personService {

	@Autowired
	private personRepo personrepo;
	@Autowired
	private passportRepo passrepo;

	
	public void getpassport() {
		passrepo.findById(1);
	}
	public void getperson() {
		
		Optional<person> byId = personrepo.findById(1);
		}
	public void saveperson() {
		person p = new person();

		p.setName("Sampath");
		p.setGender("Male");
		
		System.out.println("person Record inserted");

		Passport pp = new Passport();

		pp.setPassportNum("ASERF34Df");
		pp.setIssuedDate(LocalDate.now().of(2024, 01, 15));
		pp.setExpDate(LocalDate.now().plusYears(10));

		p.setPassport(pp);
		pp.setPerson(p);
		
		System.out.println("Passport Record Inserted ");
		
		personrepo.save(p);
		//passrepo.save(pp);

	}

}
