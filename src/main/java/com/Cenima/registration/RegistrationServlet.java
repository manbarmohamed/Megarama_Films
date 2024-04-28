package com.Cenima.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user_id=request.getParameter("user_id");
		String user_name=request.getParameter("name");
		String email=request.getParameter("email");
		String passwrd=request.getParameter("pass");
		RequestDispatcher dispatcher =null;
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 con =DriverManager.getConnection("jdbc:mysql://localhost:3306/megarama","root","jujuRO55");
			PreparedStatement pst =con.prepareStatement("insert into user1(user_id,user_name,email,passwrd)values(?,?,?,?)");
			pst.setString(1,user_id);
			pst.setString(2,user_name);
			pst.setString(3,email);
			pst.setString(4,passwrd);
			int rowCount=pst.executeUpdate();
			dispatcher = request.getRequestDispatcher("registration.jsp");
			if(rowCount>0) {
				request.setAttribute("status","success");
			}else {
				request.setAttribute("status","failed");
			}
			
			dispatcher.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
		
	}

}
