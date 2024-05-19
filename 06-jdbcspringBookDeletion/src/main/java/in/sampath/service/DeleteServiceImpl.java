package in.sampath.service;

import in.sampath.dao.DeleteDao;

public class DeleteServiceImpl implements DeleteService {

	private DeleteDao bookdeletion;
	
	
	public void setBookdeletion(DeleteDao bookdeletion) {
		this.bookdeletion = bookdeletion;
	}
	



	@Override
	public void deletebook() {
		boolean status = bookdeletion.delete();

		if(status) {
			System.out.println("Record Deleted Successfully...");
		}else {
			System.out.println("Record Delection failed....");
		}
	}

}
