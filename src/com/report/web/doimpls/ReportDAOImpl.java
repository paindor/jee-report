package com.report.web.doimpls;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.print.PrintException;

import com.report.web.daos.ReportDAO;
import com.report.web.domains.GradeBean;

public class ReportDAOImpl implements ReportDAO {
	public static final String FILE_PATH = String.format("C:%sUsers%suser%seclipse_jee%sjee-repoort%sWebContent%sresources%stxt%s"
			,File.separator
	,File.separator
	,File.separator
	,File.separator
	,File.separator
	,File.separator
	,File.separator
	,File.separator);

	@Override
	public void insertReport(GradeBean param) {
		try{
			File file = new File(FILE_PATH +"grade.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
			writer.write("----------------------------------------------------");
			writer.newLine();
			int kor = Integer.parseInt(param.getKor());
			int eng=Integer.parseInt(param.getEng()); 
			int math= Integer.parseInt(param.getMath());
			int soci =Integer.parseInt(param.getSociety());
			int sum = kor+ eng+ math+ soci;
			int avg = sum / 4;
			
		//	writer.write(param.getStuNum() +"   "+ param.getName() +"   "+ param.getKor() +"   "+ param.getMath() 
		//	+"   "+param.getSociety() +"   "+ sum +"   "+avg);
			writer.newLine();
			writer.flush();
			System.out.println("다오"+param.toString());
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	

}
