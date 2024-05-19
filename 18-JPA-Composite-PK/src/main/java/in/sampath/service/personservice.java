package in.sampath.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sampath.entity.person;
import in.sampath.entity.personPK;
import in.sampath.repo.personRepo;

@Service
public class personservice {

	@Autowired
	private personRepo personrepo;

	public void getperson() {

		personPK pk = new personPK();
		pk.setPersonId(101);
		pk.setPassportNum("hihbjahb232kj");

		Optional<person> byId = personrepo.findById(pk);

		if (byId.isPresent()) {
			
			person person = byId.get();

			System.out.println(person);
		}
	}

	public void saveperson() {

		personPK pks = new personPK();
		pks.setPersonId(101);
		pks.setPassportNum("hihbjahb232kj");

		person per = new person();
		per.setEmail("sampathkatkam784@gmail.com");
		per.setGender("Male");
		per.setPname("Sampath");
		per.setPersonpk(pks);

		personrepo.save(per);

		System.out.println("Record saved....");

	}

}
