package com.Cenima.Servlets;
import com.Cenima.Classes.Film;
import com.Cenima.DAO.FilmsDAOImp;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "InsertFilmServlet", value = "/InsertFilmServlet")
public class InsertFilmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        request.getRequestDispatcher("/WEB-INF/addMovies.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        FilmsDAOImp filmdao = new FilmsDAOImp();
        System.out.println("////////////////22//////////////");
        String title = request.getParameter("title");
        String category = request.getParameter("category");
        String description = request.getParameter("description");
        String showTime = request.getParameter("showTime");
        String price = request.getParameter("price");
        String filmDuration = request.getParameter("filmDuration");
        String filmPic = request.getParameter("filmPic");
        String ticket = request.getParameter("ticket");

        System.out.println(title);
        System.out.println(category);

        Film film = new Film(null,title,category,description,showTime,price,filmDuration,filmPic,ticket);
        System.out.println("////" + film );

        filmdao.addFilm(film);
            this.getServletContext().getRequestDispatcher("/WEB-INF/deleteMovie.jsp");
        } }
