package in.sampath.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import in.sampath.dto.Dashboard;
import in.sampath.entity.Counsellor;
import in.sampath.entity.Enquiry;
import in.sampath.repo.CounsellorRepo;
import in.sampath.repo.EnquiryRepo;
import in.sampath.service.EnquiryService;

@Service
public class Enquiresserviceimpl implements EnquiryService {

	@Autowired
	private EnquiryRepo erepo;

	@Autowired
	private CounsellorRepo crepo;

	@Override
	public Dashboard getDashboardInfo(Integer counsellorid) {

		Long totalEnquiries = erepo.getTotalEnquiries(counsellorid);
		Long opencount = erepo.getEnquiries(counsellorid, "new");
		Long enrolledcount = erepo.getEnquiries(counsellorid, "Enrolled");
		Long lostcount = erepo.getEnquiries(counsellorid, "Lost");

		Dashboard dash = new Dashboard();
		dash.setTotalEnqs(totalEnquiries);
		dash.setOpenEnqs(opencount);
		dash.setLostenqs(lostcount);
		dash.setEnrolledEnqs(enrolledcount);

		return dash;
	}

	@Override
	public boolean addEnquiry(Enquiry enquiry, Integer counsellorid) {

		Counsellor counsellor = crepo.findById(counsellorid).orElseThrow();
		enquiry.setCounsellor(counsellor);// Association for FK

		Enquiry savedenqs = erepo.save(enquiry);
		return savedenqs.getEid() != null;
	}

	@Override
	public List<Enquiry> getEnquiries(Enquiry enquiry, Integer counsellorid) {

		//Counsellor counsellor = crepo.findById(counsellorid).orElseThrow();
		Counsellor counsellor=new Counsellor();
		counsellor.setCounsellorid(counsellorid);
		
		Enquiry search=new Enquiry();
		search.setCounsellor(counsellor);
		
		if(null!= enquiry.getCourse()&&!"".equals(enquiry.getCourse())) {
			search.setCourse(enquiry.getCourse());
		}
		if(null!= enquiry.getClass_mode()&&!"".equals(enquiry.getClass_mode())) {
			search.setClass_mode(enquiry.getClass_mode());
		}
		if(null!= enquiry.getStatus()&&!"".equals(enquiry.getStatus())) {
			search.setStatus(enquiry.getStatus());
		}
		
		// Dynamic queary creation
		Example<Enquiry> of = Example.of(search);
		return erepo.findAll(of);
	}

	@Override
	public Enquiry getEnquiry(Integer eid) {

		Enquiry enquiry = erepo.findById(eid).orElseThrow();
		return enquiry;
	}

}
