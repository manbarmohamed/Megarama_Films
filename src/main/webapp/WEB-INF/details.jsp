
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
        <li><a href="#">CONTACT</a></li>
    </ul>

</header>

<section class="details">
    <div class="wrapper">
        <div class="img-film">
            <img src="https://i.ibb.co/S61nqsj/55.jpg" width="90%">
        </div>
        <div class="content-film">
            <div class="titles">
                <h2>New Episodes</h2>
                <h1>Harry Potter</h1>
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
                    <h3>Comedy, Action, Adventure, Science Fiction</h3>
                </div>

                <div class="delay">
                    <h3>2024-9-23</h3>
                    <h3>146 min</h3>
                </div>
            </div>
            <br>
            <div class="desc">
                <p>A bank teller called Guy realizes he is a background character in an open world video game called Free City that will soon go offline.</p>
            </div>
            <div class="film-res">
                <h2>Share</h2>
                <h3>Prime Film</h3>
                <button class="reservation"><a href="#">Reservation</a></button>
            </div>

        </div>

    </div>
</section>



</body>
</html>