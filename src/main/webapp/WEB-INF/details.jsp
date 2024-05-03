<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        <%@include file="/CSS/details.css"%>
    </style>
    <title>Document</title>
</head>
<body>


<header>
    <div class="logo"><img src="https://i.ibb.co/4pCSmsM/LOGO.png" width="100%"></div>

    <ul>
        <li><a href="#" id="a1">HOME</a></li>
        <li><a href="#">MOVIE</a></li>
        <li><a href="#">ABOUT</a></li>
        <li><a href="/WEB-INF/addMovies.jsp">Admin</a></li>
    </ul>
</header>



<section class="details">
    <div class="wrapper">
        <div class="img-film">
            <img src="${films.getFilm_pic()}" width="90%">
        </div>
        <div class="content-film">
            <div class="titles">
                <h2>New Episodes</h2>
                <h1>${films.getTitle()}</h1>
            </div>
            <br>
            <div class="titles-content">

                <div class="quality">
                    <div>
                        <h2>8K+</h2>
                        <button id="book">Book</button>
                    </div>
                </div>

                <div class="proprty">
                    <h3>${films.getCategory()}</h3>
                </div>

                <div class="delay">
                    <h3>${films.getShow_time()}</h3>
                    <h3>${films.getFilm_duration()} min</h3>
                </div>
            </div>
            <br>
            <div class="desc">
                <p>${films.getDescription()}</p>
            </div>
            <div class="film-res">
                <form action="Reservation_film" method="GET">
                        <input type="number" name="ticket" placeholder="tickets"/>
                        <input type="date" name="date" value="${films.getShow_time()}" style="display: none"/>
                        <input type="number" name="id_film" value="${films.getId_fiml()}" style="display: none"/>
                        <button class="reservation" type="submit">Reservation</button>
                </form>
            </div>

        </div>

    </div>
</section>



</body>
</html>