package com.Cenima.Servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Cenima.Classes.Favorite;
import com.Cenima.DAO.FavoriteDAO;
import com.Cenima.DAO.FavoriteDAOImp;
import com.Cenima.DAO.FilmsDAOImp;


@WebServlet("/ShowFilmsServlet")
public class ShowFilmsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FilmsDAOImp films = new FilmsDAOImp();
        request.setAttribute("listFilms", films.selectAllFilms());
        System.out.println(films.selectAllFilms());

		FavoriteDAO favoriteDAO = new FavoriteDAOImp();
		HttpSession session = request.getSession();
		Integer id_user=  (Integer) session.getAttribute("id");
		List<Favorite> favoritesWithDetails = favoriteDAO.getFavoritesByUserId(id_user);
		request.setAttribute("favoritesWithDetails", favoritesWithDetails);
		System.out.println(favoritesWithDetails);
		System.out.println("////////////////////////////doget show //////////////////");

		request.getRequestDispatcher("/WEB-INF/ShowFilms.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("////////////////////////////dopost show //////////////////");

	}

}
