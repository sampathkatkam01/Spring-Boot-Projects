package in.sampath.service;

import java.util.List;

import in.sampath.dto.Dashboard;
import in.sampath.entity.Enquiry;

public interface EnquiryService {

	//Dashboard page based on counsellorid
	public Dashboard getDashboardInfo(Integer counsellorid);
	
	//adding enquiring to a counsellor dashboard
	public boolean addEnquiry(Enquiry enquiry,Integer counsellorid);
	
	//views and filter
	public List<Enquiry> getEnquiries(Enquiry enquiry , Integer counsellorid );
	
	//edit
	public Enquiry getEnquiry(Integer eid);
	
}