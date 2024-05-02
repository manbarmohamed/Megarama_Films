package com.Cenima.Classes;

import javax.persistence.*;

@Entity
@Table(name = "films")
public class Film {
	
	
	///constructors ////
	public Film(Integer film_id, String title, String category, String description, String show_time, String price,
			String film_duration, String film_pic, String ticket) {
		this.film_id = film_id;
		this.title = title;
		this.category = category;
		this.description = description;
		this.show_time = show_time;
		this.price = price;
		this.film_duration = film_duration;
		this.film_pic = film_pic;
		this.ticket = ticket;
	}
	
	
	public Film(String title, String category, String description, String show_time, String price, String film_duration,
			String film_pic, String ticket) {
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
	@Id
	@Column(name= "film_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer film_id;

	private String title;
	private String category;
	private String description;
	private String show_time;
	private String price ;
	private String film_duration;
	private String film_pic;
	private String ticket;

	public Film() {

	}

	///Getters And Setters ///
	public Integer getId_fiml() {
		return film_id;
	}
	public void setId_fiml(Integer id_fiml) {
		this.film_id = id_fiml;
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
	public String getShow_time() {
		return show_time;
	}
	public void setShow_time(String show_time) {
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
