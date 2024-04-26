package com.Cenima.Classes;

import java.sql.Date;

public class Reservation {

    public Reservation(Integer reserve_id, Integer film_id, Integer user_id, Date reservation_date, String ticket) {
        super();
        this.reserve_id = reserve_id;
        this.film_id = film_id;
        this.user_id = user_id;
        this.reservation_date = reservation_date;
        this.ticket = ticket;
    }
    public Reservation() {
        super();
    }

    private Integer reserve_id;
    private Integer film_id;
    private Integer user_id;
    private Date reservation_date;
    private String ticket;


    public Integer getReserve_id() {
        return reserve_id;
    }
    public void setReserve_id(Integer reserve_id) {
        this.reserve_id = reserve_id;
    }
    public Integer getFilm_id() {
        return film_id;
    }
    public void setFilm_id(Integer film_id) {
        this.film_id = film_id;
    }
    public Integer getUser_id() {
        return user_id;
    }
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
    public Date getReservation_date() {
        return reservation_date;
    }
    public void setReservation_date(Date reservation_date) {
        this.reservation_date = reservation_date;
    }
    public String getTicket() {
        return ticket;
    }
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }





}
