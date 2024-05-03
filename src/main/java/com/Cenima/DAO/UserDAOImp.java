package com.Cenima.DAO;

import com.Cenima.Classes.Film;
import com.Cenima.Classes.User;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImp implements UserDAO {



    @Override
    public User getUser(String email, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query<User> query = session.createQuery("FROM User WHERE email = :email AND password = :password", User.class);
        query.setParameter("email", email);
        query.setParameter("password", password);
        User user = query.uniqueResult();
        session.close();
        return user;
    }

    public User getUserById(Integer id_user){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query<User> query = session.createQuery("FROM User WHERE userId=:id_user", User.class);
        query.setParameter("id_user", id_user);
        User user = query.uniqueResult();
        session.close();
        return user;
    }
//    public User getUser(String username, String password) throws SQLException {
//        User user=null;
//        Connection con = DataBaseManager.getConnection();
//        PreparedStatement ps = con.prepareStatement("select user_id , role from user1 where email=? and passwrd=?");
//        ps.setString(1,username);
//        ps.setString(2,password);
//        ResultSet rs = ps.executeQuery();
//        if(rs.next()){
//            user = new User();
//            user.setUserId(rs.getInt("user_id"));
//            user.setRole(rs.getString("role"));
//
//        }
//        return user;
//    }
    @Override
    public void addUser(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }

//    public void addUser(User user) throws SQLException {
//        String sql = "INSERT INTO user1 (username , email, passwrd, role) VALUES (?, ?, ?, ?)";
//        Connection connection = DataBaseManager.getConnection();
//        System.out.println("***** Add User *************");
//        PreparedStatement statement =connection.prepareStatement(sql);
//        statement.setString(1, user.getUsername());
//        statement.setString(2, user.getEmail());
//        statement.setString(3, user.getPassword());
//        statement.setString(4, "user");
//        statement.executeUpdate();
//    }

}
