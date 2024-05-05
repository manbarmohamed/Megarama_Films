
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <title>Document</title>
    <style>
        <%@include file="../CSS/home.css"%>
    </style>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
</head>

<body>

<header>
    <div class="logo"><img src="https://i.ibb.co/4pCSmsM/LOGO.png" width="100%" alt=""></div>

    <ul>
        <li><a href="#" id="a1">HOME</a></li>
        <li><a href="#">MOVIE</a></li>
        <li><a href="#">ABOUT</a></li>
        <li><a href="/WEB-INF/addMovies.jsp">Admin</a></li>
        <li><a id="show-popup">Favorite</a></li>

    </ul>

    <div class="buttons1">
        <button id="singin">log out</button>
        <button id="singup">log out</button>
    </div>
</header>


<section>
    <div id="popup-container" class="popup-container">
        <div class="popup-content">
            <span class="close-button">&times;</span>
        <c:forEach var="fav" items="${favoritesWithDetails}">
            <div class="horizontal-card">
                <div class="card-image">
                    <img src="${fav.getFavoriteImage()}"
                         alt="Image de la carte">
                </div>
                <div class="card-content">
                    <h3>${fav.getFavoriteTitle()}</h3>
                    <p>${fav.getFavoriteCategory()}</p>
                    <a href="#" class="card-link">En savoir plus</a>
                </div>
            </div>
        </c:forEach>
            <div class="horizontal-card">
                <div class="card-image">
                    <img src="https://t3.ftcdn.net/jpg/05/71/06/76/360_F_571067620_JS5T5TkDtu3gf8Wqm78KoJRF1vobPvo6.jpg"
                         alt="Image de la carte">
                </div>
                <div class="card-content">
                    <h3>Titre de la carte</h3>
                    <p>Description de la carte</p>
                    <a href="#" class="card-link">En savoir plus</a>
                </div>
            </div>

        </div>
    </div>
</section>

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
        <form action="Search" method="GET">
            <input type="text" name="search" id="search" placeholder="Search by title"/>
            <button id="btn-search" type="submit">Search</button>
        </form>

    </div>

</div>

<div class="S-main">
    <c:forEach var="film" items="${listFilms}">
    <div class="S-main-hero">
        <div class="card-film">
            <div class="FF">
                <form action="fav" method="post" >

                    <input type="number" id="id_film" name="id_film" value="${film.getId_fiml()}" style="display: none">

                    <input id="favoriteTitle" name="favoriteTitle" value="${film.getTitle()}" style="display: none"></input>

                    <input type="text" id="favoriteCategory" name="favoriteCategory" value="${film.getCategory()}" style="display: none">

                    <input id="favoriteImage" name="favoriteImage" value="${film.getFilm_pic()}" style="display: none" > </input>
                    <button type="submit" class="favorite-button">
                        <i class="far fa-heart"></i> Ajouter aux favoris
                    </button>
                </form>
            </div>
            <img  class="cover-img" src="${film.getFilm_pic()}" width="100%">

            <div class="film-content ">
                <h2>${film.getTitle()}</h2>
                <h3>${film.getShow_time()}</h3>
            </div>
            <div class="film-content2">
                <div>
                    <h2>8K+</h2>
                    <a href="details?id=${film.getId_fiml()}" id="book">Book</a>
                </div>
                <h3> ${film.getFilm_duration()} min</h3>
            </div>

        </div>
    </div>
    </c:forEach>


    <c:forEach var="film" items="${filmSearch}">
        <div class="S-main-hero">
            <div class="card-film">
                <img  class="cover-img" src="${film.getFilm_pic()}" width="100%">

                <div class="film-content ">
                    <h2>${film.getTitle()}</h2>
                    <h3>${film.getShow_time()}</h3>
                </div>
                <div class="film-content2">
                    <div>
                        <h2>8K+</h2>
                        <a href="details?id=${film.getId_fiml()}" id="book">Book</a>
                    </div>
                    <h3> ${film.getFilm_duration()} min</h3>
                </div>

            </div>
        </div>
    </c:forEach>

    <p id="alert1">${alert}</p>
</div>

<br>

<div class="D1">
    <div class="D1-content">
        <h2>CATEGORY STREAMING</h2>
        <h1>Trending Movie Requests</h1>

    </div>
    <div class="D1-buttons">
    </div>

</div>
<div class="S-main">
    <c:forEach var="film" items="${listFilms}">
        <div class="S-main-hero">
            <div class="card-film">
                <img  class="cover-img" src="${film.getFilm_pic()}" width="100%">

                <div class="film-content ">
                    <h2>${film.getTitle()}</h2>
                    <h3>${film.getShow_time()}</h3>
                </div>
                <div class="film-content2">
                    <div>
                        <h2>8K+</h2>
                        <a href="details?id=${film.getId_fiml()}" id="book">Book</a>
                    </div>
                    <h3> ${film.getFilm_duration()} min</h3>
                </div>

            </div>
        </div>
    </c:forEach>

    <c:forEach var="film" items="${filmSearch}">
        <div class="S-main-hero">
            <div class="card-film">
                <img  class="cover-img" src="${film.getFilm_pic()}" width="100%">

                <div class="film-content ">
                    <h2>${film.getTitle()}</h2>
                    <h3>${film.getShow_time()}</h3>
                </div>
                <div class="film-content2">
                    <div>
                        <h2>8K+</h2>
                        <a href="details?id=${film.getId_fiml()}" id="book">Book</a>
                    </div>
                    <h3> ${film.getFilm_duration()} min</h3>
                </div>

            </div>
        </div>
    </c:forEach>

    <p id="alert1">${alert}</p>
</div>



<script>
    const al = document.getElementById("alert1");
    if (al.innerHTML === ".") {
        alert("The Reservation is add Successfully !");
    } else if (al.innerHTML === "..") {
        alert("The Reservation is Not added !");
    }


    document.getElementById('next').onclick = function () {
        let lists = document.querySelectorAll('.item');
        document.getElementById('slide').appendChild(lists[0]);
    }
    document.getElementById('prev').onclick = function () {
        let lists = document.querySelectorAll('.item');
        document.getElementById('slide').prepend(lists[lists.length - 1]);
    }

        // Données du film


        // Éléments du popup
        const popupContainer = document.getElementById("popup-container");
        const closeButton = document.querySelector(".close-button");
        const showPopupButton = document.getElementById("show-popup");

        // Afficher le popup
        showPopupButton.addEventListener("click", () => {
        popupContainer.style.display = "block";

    });

        // Fermer le popup
        closeButton.addEventListener("click", () => {
        popupContainer.style.display = "none";
    });

        window.addEventListener("click", (event) => {
        if (event.target == popupContainer) {
        popupContainer.style.display = "none";
    }
    });
    const favoriteButton = document.querySelector('.favorite-button');
    let isFavorite = false;

    favoriteButton.addEventListener('click', () => {
        if (!isFavorite) {
            favoriteButton.classList.add('active');
            // Ajouter la logique pour sauvegarder l'article dans les favoris
        } else {
            favoriteButton.classList.remove('active');
            // Supprimer la logique pour retirer l'article des favoris
        }
        isFavorite = !isFavorite;
    });


</script>
</body>
</html>
