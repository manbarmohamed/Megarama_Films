<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        <%@include file="/CSS/home.css"%>
    </style>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
</head>

<body>

<<<<<<< HEAD
<header>
    <div class="logo"><img src="https://i.ibb.co/4pCSmsM/LOGO.png" width="100%"></div>

    <ul>
        <li><a href="#" id="a1">HOME</a></li>
        <li><a href="#">MOVIE</a></li>
        <li><a href="#">ABOUT</a></li>
        <li><a href="#">CONTACT</a></li>
    </ul>

    <div class="buttons1">
        <button id="singin">Sing in</button>
        <button id="singup">Sing up</button>
    </div>
</header>

<section class="main">
    <div class="container">

        <div id="slide">
            <div class="item" style="background-image: url('https://i.ibb.co/yg26BCG/22.jpg');">
                <div class="content">
                    <div class="name">LUNDEV</div>
                    <div class="des">Tinh ru anh di chay pho, chua kip chay
                        pho thi anhchay mat tieu</div>
                    <button>See more</button>
                </div>
            </div>


            <div class="item" style="background-image: url('https://i.ibb.co/LkTJgnk/33.jpg');">
                <div class="content">
                    <div class="name">LUNDEV</div>
                    <div class="des">Tinh ru anh di chay pho, chua kip chay
                        pho thi anhchay mat tieu</div>
                    <button>See more</button>
                </div>
            </div>

            <div class="item" style="background-image: url('https://i.ibb.co/9hgX9dL/44.jpg');">
                <div class="content">
                    <div class="name">LUNDEV</div>
                    <div class="des">Tinh ru anh di chay pho, chua kip chay
                        pho thi anhchay mat tieu</div>
                    <button>See more</button>
                </div>
            </div>

            <div class="item" style="background-image: url('https://i.ibb.co/S61nqsj/55.jpg');">
                <div class="content">
                    <div class="name">LUNDEV</div>
                    <div class="des">Tinh ru anh di chay pho, chua kip chay
                        pho thi anhchay mat tieu</div>
                    <button>See more</button>
                </div>
            </div>

            <div class="item" style="background-image: url('https://i.ibb.co/Kx3d0df/66.jpg');">
                <div class="content">
                    <div class="name">LUNDEV</div>
                    <div class="des">Tinh ru anh di chay pho, chua kip chay
                        pho thi anhchay mat tieu</div>
                    <button>See more</button>
                </div>
            </div>

            <div class="item" style="background-image: url('https://i.ibb.co/gjT3s9k/11.jpg');">
                <div class="content">
                    <div class="name">LUNDEV</div>
                    <div class="des">Tinh ru anh di chay pho, chua kip chay
                        pho thi anhchay mat tieu</div>
                    <button>See more</button>
                </div>
            </div>
        </div>
        <div class="buttons">
            <button id="prev"><i class="fa-solid fa-angle-left"></i></button>
            <button id="next"><i class="fa-solid fa-angle-right"></i></button>
        </div>
    </div>
</section>
<div class="D1">
    <div class="D1-content">
        <h2>CATEGORY STREAMING</h2>
        <h1>Upcoming Movies</h1>

    </div>
    <div class="D1-buttons">
        <button>MOVIES</button>
        <button>TV SHOWS</button>
        <button>ANIME</button>
    </div>

</div>

<div class="S-main">
    <div class="S-main-hero">
        <div class="card-film">
            <img src="https://i.ibb.co/9hgX9dL/44.jpg" width="100%">

            <div class="film-content">
                <h2>harru potter</h2>
                <h3>2024-04-25</h3>
            </div>
            <div class="film-content2">
                <div>
                    <h2>8K+</h2>
                    <button id="book">Book</button>
                </div>
                <h3>180 min</h3>
            </div>

        </div>
    </div>

</div>



<script>
    document.getElementById('next').onclick = function(){
        let lists = document.querySelectorAll('.item');
        document.getElementById('slide').appendChild(lists[0]);
    }
    document.getElementById('prev').onclick = function(){
        let lists = document.querySelectorAll('.item');
        document.getElementById('slide').prepend(lists[lists.length - 1]);
    }

</script>
</body>
</html>
