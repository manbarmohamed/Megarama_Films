package com.Cenima.Classes;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
public class Reservation {
	
	public Reservation(Integer reserve_id, Film film_id, User user_id, LocalDate reservation_date, String ticket) {
		super();
		this.reserve_id = reserve_id;
		this.film_id = film_id;
		this.user_id = user_id;
		this.reservation_date = reservation_date;
		this.ticket = ticket;
	}
	public Reservation(User user_id, Film film_id, LocalDate reservation_date, String ticket) {
		super();
		this.film_id = film_id;
		this.user_id = user_id;
		this.reservation_date = reservation_date;
		this.ticket = ticket;
	}
	public Reservation() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reserve_id")
	private Integer reserve_id; // Clé primaire

	@ManyToOne
	@JoinColumn(name = "film_id")
	private Film film_id; // Clé étrangère

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user_id; // Clé étrangère


	@Column(name = "reservation_date")
	private LocalDate reservation_date;

	@Column(name = "ticket")
	private String ticket;
	
	
	public Integer getReserve_id() {
		return reserve_id;
	}
	public void setReserve_id(Integer reserve_id) {
		this.reserve_id = reserve_id;
	}
	public Film getFilm_id() {
		return film_id;
	}
	public void setFilm_id(Film film_id) {
		this.film_id = film_id;
	}
	public User getUser_id() {
		return user_id;
	}
	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}
	public LocalDate getReservation_date() {
		return reservation_date;
	}
	public void setReservation_date(LocalDate reservation_date) {
		this.reservation_date = reservation_date;
	}
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "Reservation{" +
				"reserve_id=" + reserve_id +
				", film_id=" + film_id +
				", user_id=" + user_id +
				", reservation_date=" + reservation_date +
				", ticket='" + ticket + '\'' +
				'}';
	}
}
