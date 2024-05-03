package com.Cenima.Classes;

import javax.persistence.*;

@Entity
public class Favorite {

    public Favorite() {
    }

    public Favorite(Film film, User user, String favoriteTitle, String favoriteCategory, String favoriteImage) {
        this.film = film;
        this.user = user;
        this.favoriteTitle = favoriteTitle;
        this.favoriteCategory = favoriteCategory;
        this.favoriteImage = favoriteImage;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String favoriteTitle;
    private String favoriteCategory;
    private String favoriteImage;

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFavoriteTitle() {
        return favoriteTitle;
    }

    public void setFavoriteTitle(String favoriteTitle) {
        this.favoriteTitle = favoriteTitle;
    }

    public String getFavoriteCategory() {
        return favoriteCategory;
    }

    public void setFavoriteCategory(String favoriteCategory) {
        this.favoriteCategory = favoriteCategory;
    }

    public String getFavoriteImage() {
        return favoriteImage;
    }

    public void setFavoriteImage(String favoriteImage) {
        this.favoriteImage = favoriteImage;
    }
}
