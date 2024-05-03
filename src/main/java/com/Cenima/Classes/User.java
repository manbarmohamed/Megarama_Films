package com.Cenima.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String username;
    private String email;
    private String password;
    private String role;

    public User(String username, String email, String password, String role) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
        this.username = username;
    }

        // Constructeur par défaut
        public User() {
        }

        // Constructeur avec tous les attributs
        public User(String username, String email, String password) {
            this.username = username;
            this.email = email;
            this.password = password;
        }

        public User(int userId, String email ) {
        this.userId = userId;
        this.email = email;

    }


        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        // Méthode toString pour afficher les informations de l'utilisateur
        @Override
        public String toString() {
            return "User{" +
                    "userId=" + userId +

                    ", email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    ", role='" + role + '\'' +
                    '}';
        }
}
