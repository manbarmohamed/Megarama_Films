package com.Cenima.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Cenima.Classes.Film;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class FilmsDAOImp implements FilmsDAO{



//	private String INSERT_FILM_SQL="INSERT INTO films (title, category, description, show_time, price, film_duration, film_pic, ticket_number) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
//	private String UPDATE_FILM_SQL="UPDATE films SET title = ?,category = ?,description = ?,show_time = ?,price = ?,film_duration = ?,film_pic = ?,ticket_number = ? WHERE film_id = ?;";
//	private String DELETE_FILM_SQL="DELETE FROM films WHERE film_id = ? ;";
//	private String SELECT_ALL_FILM_SQL="select * from films";
//	private String SELECT_FILM_BY_ID_SQL="select * from films where film_id = ?";
//	private String SELECT_FILM_BY_TITLE_SQL="select * from films where title = ?";

	@Override
	public void addFilm(Film film) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(film);
		session.getTransaction().commit();
		session.close();
	}
	@Override
	public List<Film> selectAllFilms() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Film> allFilms = session.createQuery("FROM Film", Film.class).getResultList();
		session.close();
		return allFilms;
	}

//	public List<Film> selectAllFilms() throws SQLException {
//		List<Film> allFilms= new ArrayList<>();
//		Connection connection =DataBaseManager.getConnection();
//		PreparedStatement statement = connection.prepareStatement(SELECT_ALL_FILM_SQL);
//		ResultSet rs= statement.executeQuery();
//
//		while(rs.next()) {
//			Integer film_Id = rs.getInt("film_id");
//			String title = rs.getString("title");
//			String category = rs.getString("category");
//			String description = rs.getString("description");
//			String show_time = rs.getString("show_time");
//			String price = rs.getString("price");
//			String film_duration = rs.getString("film_duration");
//			String film_pic = rs.getString("film_pic");
//			String ticket_number = rs.getString("ticket_number");
//			allFilms.add(new Film(film_Id,title,category,description,show_time,price,film_duration,film_pic,ticket_number));
//		}
//
//		return allFilms;
//
//	}
	@Override
	public Film selectFilmById(int idFilm) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Film film = session.get(Film.class, idFilm);
		session.close();
		return film;
	}


	@Override

	public boolean updateFilm(Film film) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(film);
		session.getTransaction().commit();
		session.close();
		return false;
	}

//	public boolean updateFilm(Film film) throws SQLException {
//		boolean isUpdated;
//		Connection connection = DataBaseManager.getConnection();
//		PreparedStatement statement = connection.prepareStatement(UPDATE_FILM_SQL);
//		statement.setString(1, film.getTitle());
//		statement.setString(2,film.getCategory());
//		statement.setString(3, film.getDescription());
//		statement.setString(4, film.getShow_time());
//		statement.setString(5,film.getPrice());
//		statement.setString(6, film.getFilm_duration());
//		statement.setString(7, film.getFilm_pic());
//		statement.setString(8, film.getTicket());
//		statement.setInt(9, film.getId_fiml());
//
//		isUpdated= statement.executeUpdate() > 0;
//
//		return isUpdated;
//	}
	@Override
	public void deleteFilm(int idFilm) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Film film = session.get(Film.class, idFilm);
		session.delete(film);
		session.getTransaction().commit();
		session.close();
	}

//	public void deleteFilm(int idFilm) throws SQLException {
//		System.out.println("/1/1/1/1/11/");
//		Connection connection = DataBaseManager.getConnection();
//		PreparedStatement statement = connection.prepareStatement(DELETE_FILM_SQL);
//		statement.setInt(1, idFilm);
//		statement.executeUpdate();
//	}

	@Override
	public List<Film> selectFilmByTitle(String title_film) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Film> query = builder.createQuery(Film.class);
		Root<Film> root = query.from(Film.class);
		query.select(root).where(builder.equal(root.get("title"), title_film));
		List<Film> films = session.createQuery(query).getResultList();
		session.close();
		return films;
	}

//	public List<Film> selectFilmByTitle(String title_film) throws SQLException {
//		List<Film> films = new ArrayList<>();
//		Connection connection = DataBaseManager.getConnection();
//		PreparedStatement statement = connection.prepareStatement(SELECT_FILM_BY_TITLE_SQL);
//		statement.setString(1, title_film);
//		ResultSet rs = statement.executeQuery();
//		while(rs.next()) {
//			Integer film_Id = rs.getInt("film_id");
//			String title = rs.getString("title");
//			String category = rs.getString("category");
//			String description = rs.getString("description");
//			String show_time = rs.getString("show_time");
//			String price = rs.getString("price");
//			String film_duration = rs.getString("film_duration");
//			String film_pic = rs.getString("film_pic");
//			String ticket_number = rs.getString("ticket_number");
//			Film film = new Film(film_Id,title,category,description,show_time,price,film_duration,film_pic,ticket_number);
//			films.add(film);
//		}
//		return films;
//	}

}
