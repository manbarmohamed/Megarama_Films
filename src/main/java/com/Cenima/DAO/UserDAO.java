package com.Cenima.DAO;

import com.Cenima.Classes.User;

import java.sql.SQLException;

public interface UserDAO {

    User getUserByEmailAndPassword(String email, String password) throws SQLException;
}
