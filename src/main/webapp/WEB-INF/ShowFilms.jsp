<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style><%@ include file="/CSS/style.css"%></style>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>

<h1 >Films Available</h1>
<div class="container row">
<c:forEach var="film" items="${listFilms}">


		<div class="movie ">

            <div class="movie-img movie-img1"><img class="movie-img movie-img1" src="${film.getFilm_pic()}"></div>
            <div class="movie-info">
                <p class="title">${film.getTitle()}</p>
                <p class="genres">${film.getCategory()}</p>
                <div class="movie-text">
                    <p>Summary</p>
                    <div class="movie-link">
                        <span><i class="fa-solid fa-thumbs-up"></i>269</span>
                        <span><i class="fa-solid fa-comment"></i>19</span>
                    </div>
                </div>
    
                <p class="text">
                    ${film.getDescription()}.
                </p>
                <div class="actions">
                    <a href="add"><i class="fa fa-play"></i>reserve</a>
    
                    <div class="actions-more">
                        <i class="fa-solid fa-share-nodes"></i>
                        <i class="fa-solid fa-bookmark"></i>
                        <i class="fa-regular fa-floppy-disk"></i>
                    </div>
                </div>
            </div>

		</div>


</c:forEach>
</div>
</body>
</html>