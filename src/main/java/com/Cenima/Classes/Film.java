package com.Cenima.Classes;

import java.sql.Date;

public class Film {
	
	
	///constructors ////
	public Film(Integer id_fiml, String title, String category, String description, Date show_time, String price,
			String film_duration, String film_pic, String ticket) {
		super();
		this.id_fiml = id_fiml;
		this.title = title;
		this.category = category;
		this.description = description;
		this.show_time = show_time;
		this.price = price;
		this.film_duration = film_duration;
		this.film_pic = film_pic;
		this.ticket = ticket;
	}
	
	
	public Film(String title, String category, String description, Date show_time, String price, String film_duration,
			String film_pic, String ticket) {
		super();
		this.title = title;
		this.category = category;
		this.description = description;
		this.show_time = show_time;
		this.price = price;
		this.film_duration = film_duration;
		this.film_pic = film_pic;
		this.ticket = ticket;
	}


	///// variables ////
	private Integer id_fiml;
	private String title;
	private String category;
	private String description;
	private Date show_time;
	private String price ;
	private String film_duration;
	private String film_pic;
	private String ticket;

	///Getters And Setters ///
	public Integer getId_fiml() {
		return id_fiml;
	}
	public void setId_fiml(Integer id_fiml) {
		this.id_fiml = id_fiml;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getShow_time() {
		return show_time;
	}
	public void setShow_time(Date show_time) {
		this.show_time = show_time;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getFilm_duration() {
		return film_duration;
	}
	public void setFilm_duration(String film_duration) {
		this.film_duration = film_duration;
	}
	public String getFilm_pic() {
		return film_pic;
	}
	public void setFilm_pic(String film_pic) {
		this.film_pic = film_pic;
	}
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	

}
