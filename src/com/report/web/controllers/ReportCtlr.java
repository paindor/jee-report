package com.report.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.report.web.domains.MemberBean;
import com.report.web.serviceimpls.ReportServiceImpl;
import com.report.web.services.ReportService;

/**
 * Servlet implementation class ReportCtlr
 */
@WebServlet("/report.do")
public class ReportCtlr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReportService service = new ReportServiceImpl();
		MemberBean mb = new MemberBean();
		mb.setName(request.getParameter("name"));
		mb.setSsn(request.getParameter("ssn"));
		mb.setKor(request.getParameter("kor"));
		mb.setEng(request.getParameter("eng"));
		mb.setMath(request.getParameter("math"));
		mb.setSociety(request.getParameter("sciety"));
		service.createStuNum(mb);
		
		System.out.println( "컨트롤" +mb.toString());
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
