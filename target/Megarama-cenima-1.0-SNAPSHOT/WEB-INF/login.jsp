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

	</ul>

	<div class="buttons1">
		<button id="singin"> <a href="login"> Sing in</a> </button>
		<button id="singup"> <a href="inscription">Sing up</a> </button>
	</div>
</header>


<section class="main">
	<div class="main-wrapper">
		<div class="img-login">
			<img src="https://i.ibb.co/31cPG5W/p.png">
		</div>

		<div class="formAll">
			<h1>Login</h1>
			<form action="login" method="POST">
				<label for="username">Username</label><br>
				<input type="text" name="email" id="username" placeholder="Username or email !">
				<br>
				<label for="password">Password</label><br>
				<input type="password" name="password" id="password" placeholder="Your Password !">
				<br>
				<button type="submit" id="btn">Login</button>
			</form>
		</div>

	</div>
</section>
</body>
</html>