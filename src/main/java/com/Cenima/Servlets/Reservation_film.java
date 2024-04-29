package com.Cenima.Servlets;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Cenima.Classes.Reservation;
import com.Cenima.DAO.FilmsDAOImp;
import com.Cenima.DAO.ReservationDAOImp;

@WebServlet("/Reservation_film")
public class Reservation_film extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Reservation_film() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReservationDAOImp res = new ReservationDAOImp();
		FilmsDAOImp films = new FilmsDAOImp();
		String idF = request.getParameter("id_film");
		Integer id_user = 2;
		String date = request.getParameter("date");
		String number_ticket = request.getParameter("ticket");

		Integer idFilm = Integer.valueOf(idF);
		Date dateFilm = Date.valueOf(date);

        try {
            res.saveReservation(new Reservation(id_user , idFilm , dateFilm , number_ticket));
			request.setAttribute("listFilms", films.selectAllFilms());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
		this.getServletContext().getRequestDispatcher("/WEB-INF/ShowFilms.jsp").forward(request , response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

}
