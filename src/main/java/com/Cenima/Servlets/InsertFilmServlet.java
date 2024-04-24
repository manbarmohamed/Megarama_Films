package com.Cenima.Servlets;

import com.Cenima.Classes.Film;
import com.Cenima.DAO.FilmsDAO;
import com.Cenima.DAO.FilmsDAOImp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "InsertFilmServlet", value = "/InsertFilmServlet")
public class InsertFilmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/InsertFilms.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FilmsDAOImp filmdao = new FilmsDAOImp();
        String title = request.getParameter("title");
        String category = request.getParameter("category");
        String description = request.getParameter("description");
        String showTime = request.getParameter("showTime");
        String price = request.getParameter("price");
        String filmDuration = request.getParameter("filmDuration");
        String filmPic = request.getParameter("filmPic");
        String ticket = request.getParameter("ticket");
        Film film = new Film(title,category,description,showTime,price,filmDuration,filmPic,ticket);
        try {
            filmdao.addFilm(film);
//            response.sendRedirect("/WEB-INF/AddRuessi.jsp");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        request.getRequestDispatcher("/WEB-INF/AddRuessi.jsp").forward(request, response);
    }
}