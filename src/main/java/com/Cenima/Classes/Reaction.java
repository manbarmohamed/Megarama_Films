package com.Cenima.Classes;

import javax.persistence.*;

@Entity
public class Reaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_reaction; // Clé primaire
    @ManyToOne
    @JoinColumn(name = "id_film") // Clé étrangère vers la table Film
    private Film id_film;
    @ManyToOne
    @JoinColumn(name = "id_user") // Clé étrangère vers la table User
    private Film id_user;
    private String comments;
    private Double notation;

    // Constructeur vide
    public Reaction() {
    }

    // Constructeur avec tous les paramètres
    public Reaction(Integer id_reaction, Film id_film, Film id_user, String comments, Double notation) {
        this.id_reaction = id_reaction;
        this.id_film = id_film;
        this.id_user = id_user;
        this.comments = comments;
        this.notation = notation;
    }

    // Getters et setters
    public Integer getId_reaction() {
        return id_reaction;
    }

    public void setId_reaction(Integer id_reaction) {
        this.id_reaction = id_reaction;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Double getNotation() {
        return notation;
    }

    public void setNotation(Double notation) {
        this.notation = notation;
    }
    public Film getId_film() {
        return id_film;
    }

    public void setId_film(Film id_film) {
        this.id_film = id_film;
    }

    public Film getId_user() {
        return id_user;
    }

    public void setId_user(Film id_user) {
        this.id_user = id_user;
    }
}
