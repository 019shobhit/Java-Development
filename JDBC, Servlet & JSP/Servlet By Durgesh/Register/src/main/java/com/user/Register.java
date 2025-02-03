package com.user;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("user_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email");
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newhiber","root","shobhit2002");
			String q = "insert into user(name,password,email) values(?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1,name);
			ps.setString(2,password);
			ps.setString(3,email);
			
			ps.executeUpdate();
			
			response.getWriter().print("<h1>Register Succesful</h1>");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
