package com.Cenima.Classes;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Integer commentId;
    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "comments")
    private String comments;

    public Comments() {
    }

    public Comments(Integer commentId, Film film, User user, String comments) {
        this.commentId = commentId;
        this.film = film;
        this.user = user;
        this.comments = comments;
    }


    public Comments(Film film, User user, String comments) {
        this.film = film;
        this.user = user;
        this.comments = comments;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
