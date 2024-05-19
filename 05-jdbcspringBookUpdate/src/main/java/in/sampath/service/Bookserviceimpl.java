package in.sampath.service;

import in.sampath.Book.BookupdateDao;

public class Bookserviceimpl implements BookUpdateService {

	private BookupdateDao bookupdatedao;

	public void setBookupdatedao(BookupdateDao bookupdatedao) {
		this.bookupdatedao = bookupdatedao;
	}

	@Override
	public void updateBook() {

		boolean status = bookupdatedao.update();
		if (status) {
			System.out.println("Record Updated sucessfully");
		} else {
			System.out.println("Record updation failed");
		}

	}

}
