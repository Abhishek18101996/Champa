<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>iConnect</title>
	  <link href="${pageContext.request.contextPath}/webjars/images/logo.png"/>
	<!--/tags -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

	<script type="application/x-javascript">
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<!--//tags -->
	<link href="${pageContext.request.contextPath}/webjars/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
	<link href="${pageContext.request.contextPath}/webjars/css/style.css" rel="stylesheet" type="text/css" media="all" />

	<link href="${pageContext.request.contextPath}/webjars/css/font-awesome.css" rel="stylesheet">
	<!-- //for bootstrap working -->
	<link href="//fonts.googleapis.com/css?family=Work+Sans:200,300,400,500,600,700" rel="stylesheet">
	<link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,900,900italic,700italic'
		rel='stylesheet' type='text/css'>
		
		<style> 
			input[type=text] {
				width: 130px;
				box-sizing: border-box;
				border: 2px solid #ccc;
				border-radius: 4px;
				font-size: 16px;
				background-color: white;
				background-image: url('searchicon.png');
				background-position: 10px 10px; 
				background-repeat: no-repeat;
				padding: 12px 20px 12px 40px;
				-webkit-transition: width 0.4s ease-in-out;
				transition: width 0.4s ease-in-out;
			}
			
			</style>
</head>

<body>
	
	<!-- header -->
	<div class="header" id="home">
		<div class="content white agile-info">
			<nav class="navbar navbar-default" role="navigation">
				<div class="container">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
						<a class="navbar-brand" href="index.html">
							<h1><span class="fa fa-signal" aria-hidden="true"></span> iConnect</h1>
						</a>
					</div>

					<!--/.navbar-header-->
					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						<nav class="link-effect-2" id="link-effect-2">
							<ul class="nav navbar-nav">
								<li class="active"><a href="index.html" class="effect-3">Home</a></li>
														
						</nav>
					</div>
					


					<!--/.navbar-collapse-->
					<!--/.navbar-->
				</div>
			</nav>
			
		</div>
	</div>
	<br><br>
	<div>
					<h3>Hello, You are logged in As PS Number: ${role}.</h3>
					</div>


</form><br><br>

	
	<!--//search_form -->
	
	<!-- //banner-bottom -->
	<div style="background-image: url('${pageContext.request.contextPath}/webjars/images/e1.jpg');" class="team_work_agile">
		<h4>Whether we play a large or small role, by working together we achieve our objectives.</h4>
	</div>
	<!-- services -->
	<div class="services" id="services">
		<div class="container">
			<div class="tittle_head_w3ls">
				<h3 class="tittle"> Employee Dashboard</h3>
			</div>
			
			<div class="inner_sec_grids_info_w3ls">
				<div class="col-md-3 services-left">
						
						<a href="${pageContext.request.contextPath}/webjars/documents/payroll.pdf" target="_blank">
								<div class="services-left-top services-left-top1">
			
									<h5>Payroll</h5>
			
								</div>
								</a>
					<a href="Leave" target="_blank">
					<div class="services-left-top services-left-top1">

						<h5>Leave</h5>

					</div>
				</a>
				</div>


				
				<div class="col-md-6 services-middle">
					<div class="services-middle-img">
						<img src="${pageContext.request.contextPath}/webjars/images/process.jpg" alt="" />
					</div>
					<div class="services-middle-grids">
						<div class="col-md-6 services-middle-left">
								<a href="${pageContext.request.contextPath}/webjars/documents/timesheet.html" target="_blank">
							<div class="services-left-top">

									<h5>TimeSheet</h5>
							</div>
						</a>
						</div>
						<div class="col-md-6 services-middle-left">
							
								<a href="${pageContext.request.contextPath}/webjars/documents/complaints.html" target="_blank">
							<div class="services-left-top">

									<h5>Complaints</h5>
							</div>
						</a>
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="col-md-3 services-left">
						<a href="eventsann" target="_blank">
					<div class="services-left-top">

						<h5>Announcement</h5>

					</div>
				</a>
				<a href="feedhr" target="_blank">
					<div class="services-left-top services-left-top1">

					<h5>FeedBack</h5>

					</div>
				</a>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>

	 <div class="footer_top_agileits">
		<div class="container">
	
			<div class="col-md-4 footer_grid">
				<h3>Announcement</h3>
				<ul class="footer_grid_list">
					<li><i class="fa fa-long-arrow-right" aria-hidden="true"></i>
						<a href="#" >Announcement 1 </a>
					</li>
					<li><i class="fa fa-long-arrow-right" aria-hidden="true"></i>
						<a href="#" >Announcement 2 </a>
					</li>
					<li><i class="fa fa-long-arrow-right" aria-hidden="true"></i>
						<a href="#">Announcement 3  </a>
					</li>
					<li><i class="fa fa-long-arrow-right" aria-hidden="true"></i>
						<a href="#" >Announcement 4 </a>
					</li>
					<li><i class="fa fa-long-arrow-right" aria-hidden="true"></i>
						<a href="#" >Announcement 5  </a>
					</li>
				</ul>
			</div>
	<div class="footer_w3ls">
		<div class="container">
			<div class="footer_bottom">
				<div class="col-md-9 footer_bottom_grid">
					<div class="footer_bottom1">
						<a href="index.html">
						</a>
						<p>© 2018 iConnect. All rights reserved | Designed By <a href="${pageContext.request.contextPath}/webjars/documents/team.html">iConnect Team</a></p>
					</div>
				</div>
				
				<div class="clearfix"> </div>
			</div>

		</div>
	</div>
	<!-- //footer -->

	<a href="#home" class="scroll" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
	<!-- js -->
	<script src="${pageContext.request.contextPath}/webjars/js/jquery-2.1.4.min.js" type="text/javascript" ></script>
 
	<script  src="${pageContext.request.contextPath}/webjars/js/bootstrap.js" type="text/javascript"></script>
</body>

</html>