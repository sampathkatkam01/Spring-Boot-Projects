package in.sampath.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.sampath.Repo.StudentRepo;
import in.sampath.entity.Student;

@Service
public class StuService {

	private StudentRepo stuRepo;

	public StuService(StudentRepo stuRepo) {
		this.stuRepo = stuRepo;
	}

	public void getAllstuPagination() {
		int pageSize = 5;
		int pageNumber = 3;
		PageRequest page = PageRequest.of(pageNumber - 1, pageSize);
		Page<Student> pg = stuRepo.findAll(page);
		List<Student> stus = pg.getContent();
		stus.forEach(e -> System.out.println(e));
	}

	public void getAllbyfilter() {

		Student entity = new Student();

		entity.setSid(401);

		Example<Student> example = Example.of(entity);

		List<Student> stus = stuRepo.findAll(example);
		stus.forEach(e -> System.out.println(e));

	}

	public void saveAllstudents() {

		Student s1 = new Student(405, "Rana",11.5, "F", "01");
		Student s2 = new Student(406, "Ravi", 19.5, "E", "01");
		Student s3 = new Student(407, "prabha", 16.5, "E", "02");
		Student s4 = new Student(408, "ganesh", 7.5, "D", "05");

		List<Student> studetails = Arrays.asList(s1, s2, s3, s4);

		stuRepo.saveAll(studetails);

		System.out.println("Records saved sucessfully.....");
	}

	public void DeleteById() {

		stuRepo.deleteById(1);
		System.out.println("Record delted sucessfully....");
	}

	public void getAllstudents() {

		List<Student> stus = stuRepo.findAll();

		stus.forEach(e -> System.out.println(e));
	}

	public void getAllStuSort() {

		Sort sort = Sort.by("smarks", "sname").descending();
		List<Student> stus = stuRepo.findAll(sort);
		stus.forEach(e -> System.out.println(e));

	}
}
