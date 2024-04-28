package com.Cenima.registration;

import com.Cenima.Classes.User;
import com.Cenima.DAO.UserDAOImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("username");
		String password = request.getParameter("password");
		UserDAOImp userD = new UserDAOImp();
        try {
             User user = userD.getUserByEmailAndPassword(email , password);
			 if (user != null){
				 HttpSession session = request.getSession();
				 session.setAttribute("user" , user);
			 }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
