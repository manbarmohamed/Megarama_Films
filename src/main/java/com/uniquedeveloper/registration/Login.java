package com.uniquedeveloper.registration;

import com.Cenima.Classes.User;
import com.Cenima.DAO.UserDAO;
import com.Cenima.DAO.UserDAOImp;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserDAO userDao;

	public void init() {
		userDao = new UserDAOImp();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher = null;
		try {
			User user = userDao.getUserByEmailAndPassword(email, password);
			if (user != null) {
				session.setAttribute("name", user.getUserName());
				if ("admin".equals(user.getRole())) {
					dispatcher = request.getRequestDispatcher("/WEB-INF/Admin.jsp");
				} else if ("user".equals(user.getRole())) {
					dispatcher = request.getRequestDispatcher("/WEB-INF/ShowFilms.jsp");
				}
			} else {
				request.setAttribute("status", "failed");
				dispatcher = request.getRequestDispatcher("login.jsp");
			}
			dispatcher.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
}
