package com.Cenima.Servlets;

import com.Cenima.DAO.FilmsDAOImp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "DeleteF", value = "/DeleteF")
public class DeleteF extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FilmsDAOImp films = new FilmsDAOImp();
        String id = request.getParameter("id");
        request.setAttribute("listFilms", films.selectAllFilms());
        this.getServletContext().getRequestDispatcher("/WEB-INF/deleteMovie.jsp").forward(request , response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.getServletContext().getRequestDispatcher("/WEB-INF/deleteMovie.jsp").forward(request , response);
    }
}