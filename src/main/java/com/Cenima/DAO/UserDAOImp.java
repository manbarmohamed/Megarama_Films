package com.Cenima.DAO;

import com.Cenima.Classes.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAOImp implements UserDAO {

    @Override
    public User getUserByEmailAndPassword(String email, String password) throws SQLException {
        User user = null;

        try (Connection con = DataBaseManager.getConnection();
             PreparedStatement pst = con.prepareStatement("SELECT * FROM user1 WHERE email = ? AND passwrd = ?")) {
            pst.setString(1, email);
            pst.setString(2, password);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    user = new User();
//                    user.setUserId(rs.getInt("id"));
                    user.setUserName(rs.getString("user_name"));
                    user.setRole(rs.getString("rolee"));
                }
            }
        }
        return user;
    }
}
