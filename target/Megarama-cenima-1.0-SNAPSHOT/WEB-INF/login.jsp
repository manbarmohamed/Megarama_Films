<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<style>
		<%@include file="../CSS/login.css"%>
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


<section class="main">
	<div class="main-wrapper">
		<div class="img-login">
			<img src="https://i.ibb.co/31cPG5W/p.png">
		</div>

		<div class="formAll">
			<h1>Login</h1>
			<form action="POST" method="Login">
				<label for="username">Username</label><br>
				<input type="text" name="username" id="username" placeholder="Username or email !">
				<br>
				<label for="password">Password</label><br>
				<input type="password" name="password" id="password" placeholder="Your Password !">
				<br>
				<button type="button" id="btn">Login</button>
			</form>
		</div>

	</div>
</section>
</body>
</html>