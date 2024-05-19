package in.sampath.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.sampath.person.PersonDetails;

@RestController
public class ExceptinoController {

	@GetMapping(value = "/person/{id}")
	public ResponseEntity<PersonDetails> getmsg(@PathVariable("id") Integer id) throws Exception {

		if (id == 1) {
			PersonDetails p = new PersonDetails();
			p.setPersonId(1);
			p.setName("Sampath");
			p.setDOB("01/15/2001");
			p.setDesignation("Developer");
			return new ResponseEntity<>(p, HttpStatus.OK);
		} else {
			throw new Exception("Invalid Id Passing");
		}

	}
}
