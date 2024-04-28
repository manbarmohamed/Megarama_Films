<<<<<<< HEAD
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
=======
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Sign Up Form by Colorlib</title>

<!-- Font Icon -->
<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="css2/style.css">
</head>
<body>
<input type="hidden" id="status" value="<%=request.getAttribute("status") %>">
	<div class="main">

		<!-- Sign up form -->
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<h2 class="form-title">Sign up</h2>
					
						<form method="post" action="register" class="register-form"
							id="register-form">
							<div class="form-group">
								<label for="user_id"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="text" name="user_id" id="user_id"
									placeholder="Your ID" />
							</div>
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="name" id="name" placeholder="Your Name" />
							</div>
							<div class="form-group">
								<label for="email"><i class="zmdi zmdi-email"></i></label> <input
									type="email" name="email" id="email" placeholder="Your Email" />
							</div>
							<div class="form-group">
								<label for="pass"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="pass" id="pass" placeholder="Password" />
							</div>
							<div class="form-group">
								<label for="re-pass"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="password" name="re_pass" id="re_pass"
									placeholder="Repeat your password" />
							</div>
							
							<div class="form-group">
								<input type="checkbox" name="agree-term" id="agree-term"
									class="agree-term" /> <label for="agree-term"
									class="label-agree-term"><span><span></span></span>I
									agree all statements in <a href="#" class="term-service">Terms
										of service</a></label>
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Register" />
							</div>
						</form>
					</div>
					<div class="signup-image">
						<figure>
							<img src="https://img.freepik.com/free-vector/sign-concept-illustration_114360-125.jpg" alt="sing up image">
						</figure>
						<a href="login.jsp" class="signup-image-link">I am already
							member</a>
					</div>
				</div>
			</div>
		</section>


	</div>
	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">

<script type="text/javascript">

var status = document.getElementById("status").value;
if(status=="success"){
	swal("Congrats","Account Created Successfully","success");
}
</script>

</body>
<!-- This templates was made by Colorlib (https://colorlib.com) -->
>>>>>>> f1862385d0a6d56c28bf67483399cd4b5fb3036d
</html>