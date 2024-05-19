package in.sampath.service;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import in.sampath.entity.TimestampingEntity;
import in.sampath.repo.productRepo;

@Service
public class productService{
	
	private productRepo productrepo;
	
	public productService(productRepo productrepo) {
		this.productrepo=productrepo;
	}
	
	public void savedata() {
		
		TimestampingEntity TSE=new TimestampingEntity();
		TSE.setCd(LocalDateTime.now());
		TSE.setUd(LocalDate.now());
		TSE.setPid(1);
		TSE.setPname("Ravi");
		TSE.setPprice(543.22);
		
		productrepo.save(TSE);
		
	}
}
