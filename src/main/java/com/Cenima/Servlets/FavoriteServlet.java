package com.Cenima.Servlets;

import com.Cenima.Classes.Favorite;
import com.Cenima.Classes.Film;
import com.Cenima.Classes.User;
import com.Cenima.DAO.*;
import org.hibernate.Session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "FavoriteServlet", value = "/FavoriteServlet")
public class FavoriteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FavoriteDAO favoriteDAO = new FavoriteDAOImp();
        HttpSession session = request.getSession();
        Integer id_user=  (Integer) session.getAttribute("id");
        List<Favorite> favoritesWithDetails = favoriteDAO.getFavoritesByUserId(id_user);
        request.setAttribute("favoritesWithDetails", favoritesWithDetails);
        FilmsDAOImp film = new FilmsDAOImp();
        request.setAttribute("listFilms", film.selectAllFilms());
        System.out.println(favoritesWithDetails);
        request.getRequestDispatcher("/WEB-INF/ShowFilms.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FavoriteDAO favoriteDAO = new FavoriteDAOImp();
        FilmsDAO filmsDAO = new FilmsDAOImp();
        UserDAO userDAO = new UserDAOImp();

        HttpSession session = request.getSession();

        Integer id_user=  (Integer) session.getAttribute("id");
        Integer id_film = Integer.valueOf(request.getParameter("id_film"));
        String  favoriteTitle = request.getParameter("favoriteTitle");
        String  favoriteCategory = request.getParameter("favoriteCategory");
        String  favoriteImage = request.getParameter("favoriteImage");

        Film film  =  filmsDAO.selectFilmById(id_film);
        User user  =  userDAO.getUserById(id_user);
        favoriteDAO.addFavorite(new Favorite(film,user,favoriteTitle,favoriteCategory,favoriteImage));

        List<Favorite> favoritesWithDetails = favoriteDAO.getFavoritesByUserId(id_user);
        request.setAttribute("favoritesWithDetails", favoritesWithDetails);

        try {
            request.setAttribute("listFilms", filmsDAO.selectAllFilms());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(favoritesWithDetails);
        System.out.println("////////////////////////////dopost favorite //////////////////");

        request.getRequestDispatcher("/WEB-INF/ShowFilms.jsp").forward(request, response);

    }
}