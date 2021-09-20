package com.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import 
/**
 * Servlet implementation class Registration
 */
@WebServlet("/RegistrationServLlet")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Registration() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(jakarta.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Student student = new Student ();
		student.setEmail(request.getParameter("email"));
		student.setFirstName(request.getParameter("firstName"));
		student.setEmail(request.getParameter("lastName"));
		student.setEmail(request.getParameter("password"));
		student.setEmail(request.getParameter("Claim Academy"));
		
		
	}
}
}
		Address address = new Address ();
		address.setCit(request.getParameter("city"));
		address.setState(request.getParameter("state");
		address.setStreet(request.getParameter("street");
		address.setZipCode(request.getParameter(zipCode);
		
		httpSeession session = request.getSession(true);