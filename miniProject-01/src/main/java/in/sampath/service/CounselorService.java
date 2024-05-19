package in.sampath.service;

import in.sampath.entity.Counsellor;

public interface CounselorService {
	//saving counsellor data to database
	public boolean saveCounsellor(Counsellor counsellor);
	
	//retriving data from database to login 
	public Counsellor getCounsellor(String email,String password);

}
