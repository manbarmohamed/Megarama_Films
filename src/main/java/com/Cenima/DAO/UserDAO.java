package com.Cenima.DAO;

import com.Cenima.Classes.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {

    int verifieUser(String username, String password) throws SQLException;
    void inertUser(User user) throws SQLException;
    User getUser(String username) throws SQLException;
}
