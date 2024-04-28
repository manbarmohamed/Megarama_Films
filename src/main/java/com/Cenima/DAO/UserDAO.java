package com.Cenima.DAO;

import com.Cenima.Classes.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {

    User getUserByEmailAndPassword(String email, String password) throws SQLException;
}
