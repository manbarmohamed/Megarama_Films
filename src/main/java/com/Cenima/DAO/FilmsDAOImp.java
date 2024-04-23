package com.Cenima.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Cenima.Classes.Film;

public class FilmsDAOImp implements FilmsDAO{
	
	
	private String INSERT_FILM_SQL="INSERT INTO nom_de_la_table (title, category, description, show_time, price, film_duration, film_pic, ticket_number) \r\n"
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?);\r\n"
			+ "";
	private String UPDATE_FILM_SQL="";
	private String DELETE_FILM_SQL="";
	private String SELECT_ALL_FILM_SQL="";
	private String SELECT_FILM_BY_ID_SQL="";



	@Override
	public void addFilm(Film film) throws SQLException {
		Connection connection = DataBaseManager.getConnection();
		PreparedStatement statement =connection.prepareStatement(INSERT_FILM_SQL);
		statement.setString(1, film.getTitle());
		statement.setString(2,film.getCategory());
		statement.setString(3, film.getDescription());
		statement.setString(4, film.getShow_time());
		statement.setString(5,film.getPrice());
		statement.setString(6, film.getFilm_duration());
		statement.setString(7, film.getFilm_pic());
		statement.setString(8, film.getTicket());
		
		statement.executeUpdate();
	}

	@Override
	public List<Film> selectAllFilms() throws SQLException {
		return null;
	}

	@Override
	public Film selectFilmById(int idFilm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateFilm(Film film) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteFilm(int idFilm) {
		// TODO Auto-generated method stub
		return false;
	}

}
