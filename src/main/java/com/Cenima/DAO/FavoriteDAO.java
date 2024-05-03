package com.Cenima.DAO;

import com.Cenima.Classes.Favorite;
import com.Cenima.Classes.Film;

import java.sql.SQLException;

public interface FavoriteDAO {
    void addFavorite(Favorite favorite) ;
    void deleteFavorite(int idFavorite) ;


}
