package in.sampath.service;

import java.util.List;
import in.sampath.entity.productsdata;

public interface productService {
	
	public boolean saveproducts(productsdata p);
	
	public List<productsdata> getAllproducts();
	
	public boolean updateproducts(productsdata p);
	
	public void deleteproducts(Integer pid);

}
