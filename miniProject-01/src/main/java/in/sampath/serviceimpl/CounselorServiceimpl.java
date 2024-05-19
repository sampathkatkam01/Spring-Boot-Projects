package in.sampath.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.sampath.entity.Counsellor;
import in.sampath.repo.CounsellorRepo;
import in.sampath.service.CounselorService;

@Service
public class CounselorServiceimpl implements CounselorService {
	@Autowired
	private CounsellorRepo Crepo;

	@Override
	public boolean saveCounsellor(Counsellor counsellor) {
		Counsellor findbyemail = Crepo.findByEmail(counsellor.getEmail());
		if (findbyemail != null) {
			return false;
		} else {
			Counsellor savedcounsellor = Crepo.save(counsellor);
			return savedcounsellor.getCounsellorid() != null;
		}

	}

	@Override
	public Counsellor getCounsellor(String email, String password) {
		Counsellor byEmailAndPassword = Crepo.findByEmailAndPassword(email, password);
		return byEmailAndPassword;
	}

}
