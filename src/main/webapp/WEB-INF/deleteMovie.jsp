
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">

    <title>Document</title>

    <style>
        <%@include file="../CSS/deleteMovie.css"%>
        .table > tbody > tr > td {
            background: #3333337a;
            backdrop-filter: blur(5px);
            color:white;
            border:5px solid transparent;
            font-size: 14px;
        }
        .table > thead > tr > th {
            background: rgba(255, 196, 0, 0.5);
            backdrop-filter: blur(5px);
            color:white;
            border:2px solid transparent;
            font-size: 14px;
        }
        .add{
            width: 90%;
            height: 80%;
        }
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
            <h1>delete Movies</h1>
            <form>
                <div class="row ">
                    <div class="col">
                        <table class="table">
                            <thead>
                            <tr>
                                <th>Title</th>
                                <th>Category</th>
                                <th>Show Time</th>
                                <th>Duration Film</th>
                                <th>Price</th>
                                <th>Number Tickets</th>
                                <th>Delete</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${listFilms}" var="r">
                                <tr>
                                    <td>${r.getTitle()}</td>
                                    <td>${r.getCategory()}</td>
                                    <td>${r.getShow_time()}</td>
                                    <td>${r.getFilm_duration()}</td>
                                    <td>${r.getPrice()}</td>
                                    <td>${r.getTicket()}</td>
                                    <td><a href="delete?id=${r.getId_fiml()}" class="btn btn-outline-danger">Delete</a></td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </form>

        </div>
    </div>
</section>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>