package com.Cenima.Servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Cenima.Classes.Reservation;
import com.Cenima.DAO.ReservationDAOImp;

@WebServlet("/Details")
public class Details extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Details() {
        super();
        // TODO Auto-generated constructor stub
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String desc = request.getParameter("desc");
        String date = request.getParameter("date");
        String duration = request.getParameter("duration");
        String cat = request.getParameter("cat");
        String img = request.getParameter("img");
        String title = request.getParameter("title");


        request.setAttribute("desc", desc);
        request.setAttribute("date", date);
        request.setAttribute("duration", duration);
        request.setAttribute("cat", cat);
        request.setAttribute("img", img);
        request.setAttribute("title", title);
        this.getServletContext().getRequestDispatcher("/WEB-INF/details.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
