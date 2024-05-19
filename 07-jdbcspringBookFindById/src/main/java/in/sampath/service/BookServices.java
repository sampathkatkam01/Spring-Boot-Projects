package in.sampath.service;

import in.sampath.Dao.BookDao;

public class BookServices implements Bookservice {

	
	private BookDao bookdao;
	
	
	@Override
	public void FindByIdBook() {
		
		boolean findById = bookdao.FindById();
		
		if(findById) {
			System.out.println("Record found");
		}

	}

}
