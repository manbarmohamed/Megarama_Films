package com.Cenima.Servlets;

import com.Cenima.Classes.Comments;
import com.Cenima.Classes.Film;
import com.Cenima.Classes.User;
import com.Cenima.DAO.CommentsDAOImp;
import com.Cenima.DAO.FilmsDAOImp;
import com.Cenima.DAO.UserDAOImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InsertCommentServlet", value = "/InsertCommentServlet")
public class InsertCommentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.getRequestDispatcher("/WEB-INF/InsertComment.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CommentsDAOImp comments = new CommentsDAOImp();
        FilmsDAOImp films = new FilmsDAOImp();
        UserDAOImp users = new UserDAOImp();
        Integer idFilm = Integer.valueOf(request.getParameter("id_film"));
        Integer idUser = Integer.valueOf(request.getParameter("id_user"));
        String comment = request.getParameter("comment");
        User user = users.getUserById(idUser);
        Film film = films.selectFilmById(idFilm);
        comments.createComment(new Comments( film, user,comment));
    }
}