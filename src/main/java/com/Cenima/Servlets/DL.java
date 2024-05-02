package com.Cenima.Servlets;

import com.Cenima.DAO.FilmsDAOImp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "DL", value = "/DL")
public class DL extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        FilmsDAOImp films = new FilmsDAOImp();
        Integer id = Integer.valueOf(request.getParameter("id"));
        films.deleteFilm(id);
        this.getServletContext().getRequestDispatcher("/WEB-INF/deleteMovie.jsp").forward(request , response);
        }
}