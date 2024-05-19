package in.sampath.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sampath.Repo.repo;
import in.sampath.entity.entity;

@Service
public class service {
	@Autowired
	private repo repo;
	
	public void save() {
		entity e = new entity(1,"sampath");
		entity save = repo.save(e);
		System.out.println("data saved sucess fully");
	}
	public void findbyid() {
		Optional<entity> byId = repo.findById(1);
		
		if(byId.isPresent()) {
			entity entity = byId.get();
			System.out.println(entity);
		}
	}

}
