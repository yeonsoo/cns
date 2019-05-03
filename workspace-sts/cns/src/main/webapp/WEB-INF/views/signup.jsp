<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">



<!-- Bootstrap core CSS -->
<link href="/resources/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/resources/css/modern-business.css" rel="stylesheet">
<link href="/resources/css/ij-css.css" rel="stylesheet">
<link href="/resources/css/login.css" rel="stylesheet">
<link href="/resources/vendor/bootstrap/datepicker/daterangepicker.css" rel="stylesheet" media="all">
<title>QuadCore News</title>

</head>
<body>

	<div class="wrapper fadeInDown">
		<div id="formContent">
			<!-- Tabs Titles -->

			<!-- Icon -->
			<div class="fadeIn first">
			<a class="underlineHover" href=".do">QuadCore News</a>
			</div>

			<!-- Login Form -->
			<form>
				<input type="text" id="login" class="fadeIn second" name="email" placeholder="Your Email">
				<select name="gender" id="gender" class="fadeIn third">
							<option selected>Female</option>
							<option>male</option>
				</select>
				<input class="fadeIn third" type="text" placeholder="Date of Birth" name="birthday">
				<i class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
				<input type="text" id="password" class="fadeIn third" name="login" placeholder="Password">
				<input type="text" id="password" class="fadeIn third" name="login" placeholder="Repeat Your Password">
				<input type="submit" class="fadeIn fourth" value="Sign Up">
			</form>

			<!-- Remind Passowrd -->
			<div id="formFooter">
				<a class="underlineHover" href="login.do">I am already member</a><br>
			</div>

		</div>
	</div>
	<!-- Bootstrap core JavaScript -->
	<script src="/resources/vendor/jquery/jquery.min.js"></script>
	<script src="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="/resources/vendor/bootstrap/js/bootstrap.min.js"></script>


</body>
</html>