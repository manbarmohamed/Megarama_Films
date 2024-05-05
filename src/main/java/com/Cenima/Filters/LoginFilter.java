package com.Cenima.Filters;

import com.Cenima.Classes.User;
import com.Cenima.DAO.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import java.sql.SQLException;

@WebFilter(filterName = "LoginFilter")
public class LoginFilter implements Filter {
    private UserDAO userDAO = new UserDAOImp();
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws ServletException, IOException, IOException {

//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        HttpServletResponse response = (HttpServletResponse) servletResponse;
//
//        String mail = request.getParameter("username");
//        String pass = request.getParameter("password");
//        User user = null;
//        try {
//            user= userDAO.getUser(mail , pass);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        HttpSession session = request.getSession();
//        session.setAttribute("user", user);
//
//        if(user != null && user.getPassword().equals(pass)){
//            chain.doFilter(request, response);
//        }
//        else{
//            request.setAttribute("error","User not found");
//            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/login.jsp");
//            dispatcher.include(request, response);
//        }
//        response.sendRedirect(request.getContextPath() + "/WEB-INF/login.jsp");
    }
}