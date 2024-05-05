package com.Cenima.DAO;

import com.Cenima.Classes.Favorite;
import com.Cenima.Classes.Film;

import java.sql.SQLException;
import java.util.List;

public interface FavoriteDAO {
    void addFavorite(Favorite favorite) ;
    void deleteFavorite(int idFavorite) ;
    List<Favorite> getFavoritesByUserId(int userId);


}
