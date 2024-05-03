package com.Cenima.Servlets;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Cenima.Classes.Film;
import com.Cenima.Classes.Reservation;
import com.Cenima.Classes.User;
import com.Cenima.DAO.FilmsDAOImp;
import com.Cenima.DAO.ReservationDAOImp;
import com.Cenima.DAO.UserDAOImp;

@WebServlet("/Reservation_film")
public class Reservation_film extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Reservation_film() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ReservationDAOImp res = new ReservationDAOImp();
        FilmsDAOImp filmD = new FilmsDAOImp();
        UserDAOImp userD = new UserDAOImp();
		FilmsDAOImp films = new FilmsDAOImp();
		String idF = request.getParameter("id_film");
		Integer id_user = (Integer) session.getAttribute("id");
		String date = request.getParameter("date");
        LocalDate dateFilm = Date.valueOf(date).toLocalDate();
		String number_ticket = request.getParameter("ticket");

		Integer idFilm = Integer.valueOf(idF);
        User user = userD.getUserById(id_user);
		Film film = filmD.selectFilmById(idFilm);

        if(true){
            res.saveReservation(new Reservation(user , film , dateFilm , number_ticket));
            request.setAttribute("listFilms", films.selectAllFilms());
            request.setAttribute("alert" , ".");
        }
        else {
            request.setAttribute("alert" , "..");
        }
        this.getServletContext().getRequestDispatcher("/WEB-INF/ShowFilms.jsp").forward(request , response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

}
