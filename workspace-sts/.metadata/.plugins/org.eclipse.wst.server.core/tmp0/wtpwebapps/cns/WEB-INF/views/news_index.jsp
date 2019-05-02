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
<title>QuadCore News</title>

</head>

<body>

	<!-- Navigation -->
	<!--nav class에 원래 bg-dark있음 -->
	<nav class="navbar fixed-top navbar-expand-lg navbar-dark fixed-top"
		style="background-color: #A566FF">
		<div class="container">
			<a class="navbar-brand" href="#"  onClick="top.location='javascript:location.reload()'">QuadCore News</a>
			<button class="navbar-toggler navbar-toggler-right" type="button"
				data-toggle="collapse" data-target="#navbarResponsive"
				aria-controls="navbarResponsive" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><img style="margin-top: 5px"
						src="resources/img/user.png"></li>
					<li class="nav-item"><a class="nav-link" href="login.do">User1</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>

	<!-- Navigation kimsk -->
	<nav class="navbar navbar-expand-lg bg-dark navbar-dark"
		style="text-align: center">
		<div class="container" style="width: 350px">
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav" style="text-align: center">
					<!-- ml-auto -->
					<li class="dropdown" style="display: inline"><a
						class="dropbtn" style="display: inline-block" href="#"
						id="navbarDropdownPortfolio" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false"> 카테고리 </a>
						<div class="dropdown-content"
							aria-labelledby="navbarDropdownPortfolio">
							<a class="dropdown-item " href="category/politics.do">정치</a> <a
								class="dropdown-item" href="category/economy.do">경제</a> <a
								class="dropdown-item" href="category/society.do">사회</a> <a
								class="dropdown-item" href="category/living.do">생활문화</a> <a
								class="dropdown-item" href="category/itScience.do">IT과학</a>
						</div></li>
					<li class="dropdown" style="display: inline"><a
						class="dropbtn" style="display: inline-block" href="tag.do"
						id="navbarDropdownBlog"> 태그 </a></li>
					<li class="dropdown" style="display: inline"><a
						class="dropbtn" style="display: inline-block" href="#"
						id="navbarDropdownBlog" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false"> 신문사 </a>
						<div class="dropdown-content" aria-labelledby="navbarDropdownBlog">
							<a class="dropdown-item" href="company/chosun.do">조선일보</a> <a
								class="dropdown-item" href="company/joongang.do">중앙일보</a> <a
								class="dropdown-item" href="company/donga.do">동아일보</a> <a
								class="dropdown-item" href="company/hankyoreh.do">한겨례</a> <a
								class="dropdown-item" href="company/yonhap.do">연합뉴스</a>
						</div></li>
				</ul>
			</div>
		</div>
	</nav>

	<header>
		<div id="carouselExampleIndicators" class="carousel slide"
			data-ride="carousel">
			<ol class="carousel-indicators">
				<li data-target="#carouselExampleIndicators" data-slide-to="0"
					class="active"></li>
				<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
				<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
			</ol>
			<div class="carousel-inner" role="listbox"
				style="background-color: #000000">
				<!-- Slide One - Set the background image for this slide in the line below -->
				<div class="carousel-item active"
					style="background-image: url('https://imgnews.pstatic.net/image/003/2019/01/24/NISI20181204_0014703338_web_20181204153114_20190124120204832.jpg?type=w647')">
					<div class="carousel-caption d-none d-md-block">
						<a href="news.do" style="color: white"><h3>'365일·24시간'
								편의점 줄어든다…경조사 휴무·심야영업 단축 쉽게</h3></a>
						<p>공정위, 편의점·외식업 등 표준가맹계약서 개정</p>
					</div>
				</div>
				<!-- Slide Two - Set the background image for this slide in the line below -->
				<div class="carousel-item"
					style="background-image: url('https://imgnews.pstatic.net/image/001/2019/01/24/PYH2019012406210005700_P2_20190124125957738.jpg?type=w647')">
					<div class="carousel-caption d-none d-md-block">
						<a href="news.do" style="color: white"><h3>'3년 전 불났는데
								또…' 화마 부른 울산농수산물시장 안전불감증</h3></a>
						<p>이전·재건축 논의만 10년째 되풀이…노후 건물 화재에 더 취약해져</p>
					</div>
				</div>
				<!-- Slide Three - Set the background image for this slide in the line below -->
				<div class="carousel-item"
					style="background-image: url('https://imgnews.pstatic.net/image/001/2019/01/24/PAF20190124226301848_P2_20190124155551943.jpg?type=w647')">
					<div class="carousel-caption d-none d-md-block">
						<a href="news.dol" style="color: white"><h3>트럼프, 새해 국정연설
								결국 연기…"셧다운 끝나면 하겠다"</h3></a>
						<p>하원회의장 놓고 펠로시와 신경전 벌이다 결국 예정일 강행 포기</p>
					</div>
				</div>
			</div>
			<a class="carousel-control-prev" href="#carouselExampleIndicators"
				role="button" data-slide="prev"> <span
				class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
				role="button" data-slide="next"> <span
				class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>
	</header>

	<c:forEach items="${newsList}" var="news">
		<!-- Page Content -->
		<div class="container">
			<!-- Project One -->
			<div class="row" style="margin-top: 50px">
				<div class="col-md-4">
					<a href="#"> <img class="img-fluid rounded mb-3 mb-md-0"
						src="http://www.ifm.kr/wp-content/uploads/2018/11/iHY5e-660x330.jpg"
						alt="">
					</a>
				</div>
				<div class="col-md-7">
					<a href="#" style="color: black"><h4>${news.news_title}</h4></a>
					<p>${news.summarize}</p>
					<!--a class="btn btn-primary" href="#">View Project
            <span class="glyphicon glyphicon-chevron-right"></span>
          </a-->
				</div>
			</div>
			<!-- /.row -->
			<hr>
		</div>
	</c:forEach>
	<!-- /.container -->

	<!-- Footer -->
	<footer class="py-5 bg-dark">
		<div class="container">
			<p class="m-0 text-center text-white">Copyright &copy; Quad-Core
				2018</p>
		</div>
		<!-- /.container -->
	</footer>

	<!-- Bootstrap core JavaScript -->
	<script src="/resources/vendor/jquery/jquery.min.js"></script>
	<script src="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
