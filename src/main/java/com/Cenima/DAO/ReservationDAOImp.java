package com.Cenima.DAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Cenima.Classes.Film;
import com.Cenima.Classes.Reservation;
import org.hibernate.Session;

public class ReservationDAOImp  implements ReservationDAO{

	@Override
	public void saveReservation(Reservation res){
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(res);
		session.getTransaction().commit();
		session.close();
	}

//	public void saveReservation(Reservation res) throws SQLException {
//		System.out.println("///*******???????");
//		Connection connection = DataBaseManager.getConnection();
//		String sql = "INSERT INTO reservations (user_id , film_id , reservation_date , ticket_number) VALUES (? , ? , ? , ?)";
//		PreparedStatement statement = connection.prepareStatement(sql);
//		statement.setInt(1, res.getUser_id());
//		statement.setInt(2, res.getFilm_id());
//		statement.setDate(3, res.getReservation_date());
//		statement.setString(4, res.getTicket());
//		statement.executeUpdate();
//
//	}

	@Override
	public List<Reservation> historicalReservation() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Reservation> res = session.createQuery("FROM Film", Reservation.class).getResultList();
		session.close();
		return res;
	}

//	public List<Reservation> historicalReservation() throws SQLException {
//		List<Reservation> Res = new ArrayList<>();
//		Connection connection =DataBaseManager.getConnection();
//		String sql = "SELECT * FROM reservations";
//		PreparedStatement statement = connection.prepareStatement(sql);
//		ResultSet rs= statement.executeQuery();
//		while(rs.next()) {
//			Integer reserve_id = rs.getInt("reserv_id");
//			Integer film_id = rs.getInt("film_id");
//			Integer user_id = rs.getInt("user_id");
//			Date reservation_date = rs.getDate("reservation_date");
//			String ticket = rs.getString("ticket_number");
//
//			Res.add(new Reservation(reserve_id ,film_id , user_id, reservation_date, ticket));
//		}
//		return Res;
//	}

}
