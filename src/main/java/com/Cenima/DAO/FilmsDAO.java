package com.Cenima.DAO;

import java.sql.SQLException;
import java.util.List;

import com.Cenima.Classes.Film;


public interface FilmsDAO {
	
	void addFilm(Film film) ;
	List<Film> selectAllFilms() throws SQLException;
	List<Film> selectFilmById(int idFilm) throws SQLException;
	boolean updateFilm(Film film) throws SQLException;
	void deleteFilm(int idFilm) throws SQLException;
	List<Film> selectFilmByTitle(String title_film) throws SQLException;

}
