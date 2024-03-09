package com.rays.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/ServletPractice")
// wildcard mapping = so that we can define the path of class on a web server.


public class ServletPractice extends HttpServlet{
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	 
	 
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 System.out.println("in dopost method");
		 
		String fname =  req.getParameter("firstname");

		String lname =  req.getParameter("lastname");
		
		System.out.println(fname);
		System.out.println(lname);

	 }
	

}

