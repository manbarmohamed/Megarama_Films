
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Document</title>
    <style>
        <%@include file="../CSS/addMovie.css"%>
    </style>
</head>
<body>
<section class="main">
    <div class="menu">
        <div class="logo">
            <img src="https://i.ibb.co/4pCSmsM/LOGO.png" alt="" width="100%">
        </div>

        <ul class="header">
            <li><a href="/WEB-INF/addMovies.jsp" id="a1">Add</a></li>
            <li><a href="/WEB-INF/deleteMovie.jsp">Delete</a></li>
            <li><a href="/WEB-INF/ShowFilms.jsp">Home</a></li>
        </ul>
    </div>

    <div class="home">
        <div class="add">
            <h1>Create a New Movies</h1>
            <form action="add" method="POST">
                <div class="group">
                    <label for="title">Title</label>
                    <input type="text" name="title" id="title" placeholder="title">
                    <br>
                    <label for="category">category</label>
                    <input type="text" name="category" id="category" placeholder="category">
                    <br>
                </div>

                <div class="group">
                    <label for="description">Description</label>
                    <input type="text" name="description" id="description" placeholder="description">
                    <br>
                    <label for="date">Date</label>
                    <input type="date" name="showTime" id="date" >
                    <br>
                    <label for="price">Price</label>
                    <input type="number" name="price" id="price" placeholder="price">
                    <br>
                </div>

                <div class="group">
                    <label for="pic">Pic</label>
                    <input type="text" name="filmPic" id="pic" placeholder="pic" >
                    <br>
                    <label for="duration_film">Duration</label>
                    <input type="text" name="filmDuration" id="duration_film" placeholder="duration">
                    <br>
                    <br>
                    <label for="tickets">Tickets</label>
                    <input type="number" name="ticket" id="tickets" placeholder="tickets_number" >
                    <br>
                </div>

                <button type="submit" id="btn">Add Movie</button>
            </form>

        </div>
    </div>
</section>
</body>
</html>