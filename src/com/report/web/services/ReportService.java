package com.report.web.services;

import com.report.web.domains.GradeBean;

public interface ReportService {
	
	public void createStuNum(GradeBean param);
	
	public boolean isExsit(String[] arr, String s);
	
	public String createHakbun(String ssn);
	
	

}
