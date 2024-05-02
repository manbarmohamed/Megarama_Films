package com.Cenima.Classes;

import javax.persistence.*;
@Entity
public class Favorite {

    //// les variables ////
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_favorite; // Clé primaire

    @ManyToOne
    @JoinColumn(name = "id_film")
    private Integer id_film; // Clé étrangère vers la table Film

    @ManyToOne
    @JoinColumn(name = "id_user")
    private Integer id_user; // Clé étrangère vers la table User

    private String title_favorite;
    private String category_favorite;
    private String image_favorite;

    public Favorite(Integer id_film, Integer id_user, String title_favorite, String category_favorite, String image_favorite) {
        this.id_film = id_film;
        this.id_user = id_user;
        this.title_favorite = title_favorite;
        this.category_favorite = category_favorite;
        this.image_favorite = image_favorite;
    }

    public Favorite() {
    }

    /////getters and setters ///
    public Integer getId_favorite() {
        return id_favorite;
    }

    public void setId_favorite(Integer id_favorite) {
        this.id_favorite = id_favorite;
    }

    public Integer getId_film() {
        return id_film;
    }

    public void setId_film(Integer id_film) {
        this.id_film = id_film;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public String getTitle_favorite() {
        return title_favorite;
    }

    public void setTitle_favorite(String title_favorite) {
        this.title_favorite = title_favorite;
    }

    public String getCategory_favorite() {
        return category_favorite;
    }

    public void setCategory_favorite(String category_favorite) {
        this.category_favorite = category_favorite;
    }

    public String getImage_favorite() {
        return image_favorite;
    }

    public void setImage_favorite(String image_favorite) {
        this.image_favorite = image_favorite;
    }
}
