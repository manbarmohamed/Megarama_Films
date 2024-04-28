package com.Cenima.Servlets;

import com.Cenima.Classes.Film;
import com.Cenima.DAO.FilmsDAOImp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "Search", value = "/Search")
public class Search extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("search");
        FilmsDAOImp filmSearch = new FilmsDAOImp();
        try {
            List<Film> ArrayFilms = filmSearch.selectFilmByTitle(title);
            request.setAttribute("filmSearch" , ArrayFilms);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        request.getRequestDispatcher("/WEB-INF/ShowFilms.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}