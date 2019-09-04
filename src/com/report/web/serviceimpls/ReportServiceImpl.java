package com.report.web.serviceimpls;

import com.report.web.daos.ReportDAO;
import com.report.web.doimpls.ReportDAOImpl;
import com.report.web.domains.GradeBean;
import com.report.web.services.ReportService;

public class ReportServiceImpl implements ReportService{

	private ReportDAO dao;
	public ReportServiceImpl() {
		dao = new ReportDAOImpl();
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public void createStuNum(GradeBean param) {
		// TODO Auto-generated method stub
	//	String stnum = createHakbun(param.getSsn());
		
		//param.setStuNum(stnum);
		
		
		
		dao.insertReport(param);
		
	}

	@Override
	public boolean isExsit(String[] arr, String s) {
		boolean b = false;
		for(int i = 0 ; i < arr.length;i ++) {
			if(arr[i] == s) {
				b = true;
				
			}
		}
		return b;
	}
	
	@Override
	public String createHakbun(String ssn) {
		String result = "2019-";
		int sex = Integer.parseInt(ssn.substring(7,8));
		if(sex == 1) {
			result += "1";
			
		}
		else
		{
			result += "2";
			
		}
		for(int i = 0 ; i < 3; i++) {
			result += String.valueOf((int)(Math.random() * 10));
			
		}
		System.out.println( "서비스"+ result);
		return result;
		
		
	}

}
