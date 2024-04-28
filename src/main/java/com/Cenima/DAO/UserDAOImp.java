package com.Cenima.DAO;

import com.Cenima.Classes.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImp implements UserDAO {

    @Override
    public User getUserByEmailAndPassword(String email, String password) throws SQLException {
        User user1 = null;

        try (Connection con = DataBaseManager.getConnection();
             PreparedStatement pst = con.prepareStatement("SELECT * FROM user1 WHERE email = ? AND passwrd = ?")) {
            pst.setString(1, email);
            pst.setString(2, password);

            try (ResultSet rs = pst.executeQuery()) {

                if (rs.next()) {
                    user1 = new User();
//                  user1.setUserId(rs.getInt("id"));
                    user1.setUserName(rs.getString("user_name"));
                    user1.setRole(rs.getString("rolee"));

                }
            }
        }
        return user1;
    }
}
