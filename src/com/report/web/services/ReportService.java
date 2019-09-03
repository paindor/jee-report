package com.report.web.services;

import com.report.web.domains.MemberBean;

public interface ReportService {
	
	public void createStuNum(MemberBean param);
	
	public boolean isExsit(String[] arr, String s);
	
	public String createHakbun(String ssn);
	
	

}
