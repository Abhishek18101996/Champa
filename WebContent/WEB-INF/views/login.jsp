<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!------ Include the above in your HEAD tag ---------->
</head>

<body id="LoginForm">
	<div class="container">
		<center>
			<br> <br>
			<h1 class="form-heading">Online HR Management System</h1>
		</center>
		<div class="login-form">
			<div class="main-div">
				<div class="panel">


					<p>Enter Your PS Number and Password</p>
				</div>

				<form method="POST" modelAttribute="login" action="LoginForms">


					<div class="form-group">


						<input type="text" name="employee_id" size="45" class="form-control"
							placeholder="Your PS Number" min="10000000" max="15555555"
							maxlength="8" minlength="8" title="Enter Eight Digit PS Number"
							required>

					</div>
					<br>
					<div class="form-group">

						<input type="password" name="password" size="45" class="form-control"
							placeholder="Your Password"
							pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
							title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"
							required>

					</div>
					<br>
					<div class="form-group">
						<button type="submit" class="btn btn-primary">Login</button>
					</div>
					<br>
				</form>
				<div class="forgot">
					<a href="reset.html"><button type="submit"
							class="btn btn-primary">Forgot Password</button></a>
				</div>
			</div>

		</div>
	</div>


</body>
<style>
body#LoginForm {
	background-image:
		url("https://images.pexels.com/photos/273238/pexels-photo-273238.jpeg");
	background-repeat: no-repeat;
	background-position: center;
	background-size: cover;
	background-repeat: no-repeat;
	background-position: center;
	background-size: cover;
	background-attachment: fixed;
	margin-left: 175px;
}

.form-heading {
	color: #00000;
	font-size: 50px;
}

.panel p {
	font-size: 20px;
	margin-bottom: 30px;
	line-height: 24px;
}

.login-form .form-control {
	background: #f7f7f7 none repeat scroll 0 0;
	border: 1px solid #d4d4d4;
	border-radius: 4px;
	font-size: 14px;
	height: 50px;
	line-height: 50px;
}

.main-div {
	border-radius: 2px;
	margin: 20px auto 40px;
	max-width: 55%;
	padding: 100px 50px 70px 71px;
}

.login-form .form-group {
	margin-bottom: 10px;
}

.login-form {
	text-align: center;
}

.forgot a {
	color: #777777;
	font-size: 14px;
	text-decoration: underline;
}

.login-form  .btn.btn-primary {
	background: #f0ad4e none repeat scroll 0 0;
	border-color: #f0ad4e;
	color: #ffffff;
	font-size: 14px;
	width: 100%;
	height: 50px;
	line-height: 50px;
	padding: 0;
}

.forgot {
	text-align: left;
	margin-bottom: 30px;
}

.botto-text {
	color: #ffffff;
	font-size: 14px;
	margin: auto;
}

.login-form .btn.btn-primary.reset {
	background: #ff9900 none repeat scroll 0 0;
}

.back {
	text-align: left;
	margin-top: 10px;
}

.back a {
	color: #444444;
	font-size: 13px;
	text-decoration: none;
}
</style>
</html>




