package com.Cenima.Servlets;

import com.Cenima.DAO.FavoriteDAO;
import com.Cenima.DAO.FavoriteDAOImp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DeleteFavoriteServlet", value = "/DeleteFavoriteServlet")
public class DeleteFavoriteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FavoriteDAO favoriteDAO = new FavoriteDAOImp();
        Integer id_fav = Integer.valueOf(request.getParameter("id"));
        favoriteDAO.deleteFavorite(id_fav);
        response.sendRedirect(request.getContextPath() + "/home");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}