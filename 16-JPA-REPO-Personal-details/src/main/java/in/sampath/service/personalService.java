package in.sampath.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import org.springframework.stereotype.Service;
import in.sampath.Entity.PersonalEntity;
import in.sampath.jparepo.personalRepo;

@Service
public class personalService {

	private personalRepo personalrepo;

	public personalService(personalRepo personalrepo) {
		this.personalrepo = personalrepo;
	}

	public void saveAll() throws IOException {

		PersonalEntity person = new PersonalEntity();

		File photoFile = new File("C:\\Users\\sampa\\Pictures\\Pictures\\IMG_20230705_221534.jpg"); 																												// file
		byte[] photo = new byte[(int) photoFile.length()];
		FileInputStream fis = new FileInputStream(photoFile);
		fis.read(photo);
		fis.close();

		File resumeFile = new File("C:\\Users\\sampa\\Documents\\Resumes\\sampath's Resume(spl).pdf"); 
		byte[] resume = new byte[(int) resumeFile.length()];
		FileInputStream fis1 = new FileInputStream(resumeFile);
		fis1.read(resume);
		fis1.close();

		person.setPname("Ravi");
		//person.setPid(785);
		person.setPgender("Male");
		person.setPdob(LocalDate.of(2004, 03, 17));

		// person.setPdob(LocalDate.now());
		person.setPphoto(photo);
		person.setPresume(resume);

		personalrepo.save(person);

		System.out.println("Records inserted sucessfully");
	}
}