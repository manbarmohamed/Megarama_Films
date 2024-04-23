package com.Cenima.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Cenima.Classes.Film;

public class FilmsDAOImp implements FilmsDAO{
	
	
	private String INSERT_FILM_SQL="INSERT INTO films (title, category, description, show_time, price, film_duration, film_pic, ticket_number) \r\n"
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?);\r\n"
			+ "";
	private String UPDATE_FILM_SQL="";
	private String DELETE_FILM_SQL="";
	private String SELECT_ALL_FILM_SQL="select * from films";
	private String SELECT_FILM_BY_ID_SQL="select * from films where film_id = ?";



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
		List<Film> allFilms= new ArrayList<>();
		Connection connection =DataBaseManager.getConnection();
		PreparedStatement statement = connection.prepareStatement(SELECT_ALL_FILM_SQL);
		ResultSet rs= statement.executeQuery();
		
		while(rs.next()) {
			String title = rs.getString("title");
			String category = rs.getString("category");
			String description = rs.getString("description");
			String show_time = rs.getString("show_time");
			String price = rs.getString("price");
			String film_duration = rs.getString("film_duration");
			String film_pic = rs.getString("film_pic");
			String ticket_number = rs.getString("ticket_number");
			allFilms.add(new Film(title,category,description,show_time,price,film_duration,film_pic,ticket_number));
		}
		return allFilms;
	}

	@Override
	public Film selectFilmById(int idFilm) throws SQLException {
		Film film = null;
		Connection connection = DataBaseManager.getConnection();
		PreparedStatement statement = connection.prepareStatement(SELECT_FILM_BY_ID_SQL);
		statement.setInt(1, idFilm);
		ResultSet rs = statement.executeQuery();
		while(rs.next()) {
			String title = rs.getString("title");
			String category = rs.getString("category");
			String description = rs.getString("description");
			String show_time = rs.getString("show_time");
			String price = rs.getString("price");
			String film_duration = rs.getString("film_duration");
			String film_pic = rs.getString("film_pic");
			String ticket_number = rs.getString("ticket_number");
			film = new Film(title,category,description,show_time,price,film_duration,film_pic,ticket_number);
		}
		return film;
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
