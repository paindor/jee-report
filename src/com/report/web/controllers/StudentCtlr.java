package com.report.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentCtlr
 */
@WebServlet("/student.do")
public class StudentCtlr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		switch(request.getParameter("action")){
			case "move":
				request.getRequestDispatcher(String.format("WEB-INF/views/%s/%s.jsp", "student", request.getParameter("dest"))).forward(request, response);
				break;
			case "login":
				break;
			case "register":
				System.out.println(request.getParameter("dest"));
				request.getRequestDispatcher(String.format("WEB-INF/views/%s/%s.jsp", "student", request.getParameter("dest"))).forward(request, response);
				break;
		}
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
