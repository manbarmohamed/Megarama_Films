package com.Cenima.DAO;

import com.Cenima.Classes.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImp implements UserDAO {



    @Override
    public int verifieUser(String username, String password) throws SQLException {
        Connection con = DataBaseManager.getConnection();
        PreparedStatement prepStmt = con.prepareStatement("SELECT * FROM user1 WHERE username = ? AND password = ?");
        prepStmt.setString(1, username);
        prepStmt.setString(2, password);
        ResultSet rs = prepStmt.executeQuery();
        if (rs.next()) {
            String role = rs.getString("role");
            if (role.equals("admin")) {
                return 1;
            }else{
                return 2;
            }
        }else{
            return 0;
        }
    }

    @Override
    public void inertUser(User user) throws SQLException {
        Connection con = DataBaseManager.getConnection();
        PreparedStatement prs = con.prepareStatement("INSERT INTO user1 (email, passwrd, role) VALUES (?,?,?)");
       prs.setString(1, user.getEmail());
       prs.setString(2, user.getPassword());
       prs.setString(3, user.getRole());
       prs.executeUpdate();

    }

    @Override
    public User getUser(String username) throws SQLException {
        Connection con = DataBaseManager.getConnection();
        PreparedStatement prepStmt = con.prepareStatement("SELECT * FROM user1 WHERE username = ?");
        prepStmt.setString(1, username);
        ResultSet rs = prepStmt.executeQuery();
        if (rs.next()) {
            User user = new User();
            user.setEmail(rs.getString("email"));
            user.setPassword(rs.getString("passwrd"));
            user.setRole(rs.getString("role"));
            return user;

        }

        return null;
    }
}
