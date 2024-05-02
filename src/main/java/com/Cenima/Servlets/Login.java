package com.Cenima.Servlets;

import com.Cenima.Classes.User;
import com.Cenima.DAO.FilmsDAOImp;
import com.Cenima.DAO.UserDAO;
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		UserDAO userDAO = new UserDAOImp();

		try {
			User user = userDAO.getUser(email,password);
			System.out.println(user);
			if(user != null){
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				if(user.getRole().equals("admin")){
					this.getServletContext().getRequestDispatcher("/WEB-INF/addMovies.jsp").forward(request, response);
				}else {
					session.setAttribute("id" , user.getUserId());
					FilmsDAOImp film = new FilmsDAOImp();
					request.setAttribute("listFilms", film.selectAllFilms());
					 this.getServletContext().getRequestDispatcher("/WEB-INF/ShowFilms.jsp").forward(request, response);
				}
			}else {
				response.sendRedirect("login");
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}


