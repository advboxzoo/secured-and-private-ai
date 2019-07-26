package com.servlets;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/page3")
public class Page3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname=null,lname=null;
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		Cookie cookies[]=request.getCookies();
		
		for(Cookie c:cookies){
			if(c.getName().equals("fn")){
				fname=c.getValue();
			}
			else if(c.getName().equals("ln")){
				lname=c.getValue();
			}
		}
		
		
		//Here i want to print all the details
		String s3=request.getParameter("email");
		String s4=request.getParameter("pass");
		
		out.println("<h3>First Name : "+fname);
		out.println("<br/>Last Name : "+lname);
		out.println("<br/>Email : "+s3);
		out.println("<br/>Password : "+s4+"</h3>");
		
		
	}

}
