package com.Cenima.DAO;

import java.sql.SQLException;
import java.util.List;

import com.Cenima.Classes.Reservation;

public interface ReservationDAO {
	 public void saveReservation(Reservation res) throws SQLException;
	 public List<Reservation> historicalReservation() throws SQLException;

}
