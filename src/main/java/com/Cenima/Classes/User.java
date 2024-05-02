package com.Cenima.Classes;

public class User {

        private int userId;
        private String userName;
        private String email;
        private String password;
        private String role;

        // Constructeur par défaut
        public User() {
        }

        // Constructeur avec tous les attributs
        public User(String username, String email, String password) {
            this.userName = username;
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

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
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
                    ", userName='" + userName + '\'' +
                    ", email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    ", role='" + role + '\'' +
                    '}';
        }
}
