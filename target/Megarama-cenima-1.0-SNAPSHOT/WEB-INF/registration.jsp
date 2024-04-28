<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<style>
		<%@include file="../CSS/rg.css"%>
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

	<div class="buttons1">
		<button id="singin">Sing in</button>
		<button id="singup">Sing up</button>
	</div>
</header>

<div class="rg-main">
	<div class="rg-title">
		<h1>REGESTRATION</h1>
	</div>
	<div class="rg-wrapper">
		<form action="" method="POST">
			<label for="username">username</label><br>
			<input type="texe" name="username" id="username" placeholder="username">
			<br>
			<label for="Email">Email</label><br>
			<input type="email" name="Email" id="Email" placeholder="Email">
			<br>
			<label for="Password">Password</label><br>
			<input type="password" name="Password" id="Password" placeholder="Password">
			<br>
			<button type="submit" id="btn">registration</button>
		</form>
	</div>
</div>
</body>
</html>