package in.sampath.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sampath.entity.productsdata;
import in.sampath.repo.productrepo;
@Service
public class productserviceImpl implements productService {
	@Autowired
	private productrepo repo;

	@Override
	public boolean saveproducts(productsdata p) {
		productsdata savedproduct = repo.save(p);
		return savedproduct.getPid()!=null;
	}

	@Override
	public List<productsdata> getAllproducts() {
		
		return repo.findAll();
	}

	@Override
	public boolean updateproducts(productsdata p) {
		productsdata updateproducts = repo.save(p);
		return updateproducts.toString()!=null;
	}

	@Override
	public void deleteproducts(Integer pid) {
		repo.deleteById(pid);
		
	}

	

}
