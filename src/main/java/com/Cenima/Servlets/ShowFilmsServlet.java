package com.Cenima.Servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Cenima.DAO.FilmsDAOImp;


@WebServlet("/ShowFilmsServlet")
public class ShowFilmsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FilmsDAOImp films = new FilmsDAOImp();
        request.setAttribute("listFilms", films.selectAllFilms());
        System.out.println(films.selectAllFilms());
        request.getRequestDispatcher("/WEB-INF/ShowFilms.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
