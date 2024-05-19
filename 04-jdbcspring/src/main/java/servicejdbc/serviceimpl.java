package servicejdbc;

import springDao.BookDao;

public class serviceimpl implements ServiceBook {
	
	private BookDao bookdao;
	
	

	public void setBookdao(BookDao bookdao) {
		this.bookdao = bookdao;
	}

	@Override
	public void saveBook() {
		boolean status = bookdao.Save();
		if(status) {
			System.out.println("Record is inserted into the table.");
		}else {
			System.out.println("Record insertion failed ...");
		}

	}

}
