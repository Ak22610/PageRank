<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<spring:url var="contactform" value="/resources/contactform" />
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="img" value="/resources/img" />
<spring:url var="lib" value="/resources/lib" />


<c:set var="contextRoot" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="" name="keywords">
<meta content="" name="description">

<title>Page Rank - ${title}</title>

<script>
	window.menu = '${title}';
</script>

<!-- Favicons -->
<link href="${img}/favicon.png" rel="icon">
<link href="${img}/apple-touch-icon.png" rel="apple-touch-icon">

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Raleway:300,400,500,700,800|Montserrat:300,400,700"
	rel="stylesheet">

<!-- Bootstrap CSS File -->
<link href="${lib}/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Libraries CSS Files -->
<link href="${lib}/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<link href="${lib}/animate/animate.min.css" rel="stylesheet">
<link href="${lib}/ionicons/css/ionicons.min.css" rel="stylesheet">
<link href="${lib}/owlcarousel/assets/owl.carousel.min.css"
	rel="stylesheet">
<link href="${lib}/magnific-popup/magnific-popup.css" rel="stylesheet">
<link href="${lib}/ionicons/css/ionicons.min.css" rel="stylesheet">

<!-- Main Stylesheet File -->
<link href="${css}/style.css" rel="stylesheet">

<!-- =======================================================
    Theme Name: NewBiz
    Theme URL: https://bootstrapmade.com/newbiz-bootstrap-business-template/
    Author: BootstrapMade.com
    License: https://bootstrapmade.com/license/
  ======================================================= -->
</head>

<body>

	<div class="wrapper">


		<!--==========================
    Top Bar
  ============================-->
		<section id="topbar" class="d-none d-lg-block">
			<div class="container clearfix">
				<div class="contact-info float-left">
					<i class="fa fa-envelope-o"></i> <a
						href="mailto:contact@example.com">contact@example.com</a> <i
						class="fa fa-phone"></i> +1 5589 55488 55
				</div>
			</div>
		</section>

		<!--==========================

  <!--==========================
  Header
  ============================-->

		<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
		<%@include file="../../shared/navbar.jsp"%>



		<!-- #header -->

		<!--==========================
    Intro Section
  ============================-->


		<div class="container">
		
		
		<div class="row">
			
			<div class="col-md-6 col-md-offset-3">
				
				<div class="panel panel-primary">
				
					<div class="panel-heading">
						<h4>Sign Up - Personal</h4>
					</div>
					
					<div class="panel-body">
										
						<sf:form
							method="POST"
							modelAttribute="user"
							class="form-horizontal"
							id="registerForm"
						>
						
							
							<div class="form-group">
								<label class="control-label col-md-4">First Name</label>
								<div class="col-md-8">
									<sf:input type="text" path="firstName" class="form-control"
										placeholder="First Name" />
									<sf:errors path="firstName" cssClass="help-block" element="em"/> 
								</div>
							</div>


							<div class="form-group">
								<label class="control-label col-md-4">Last Name</label>
								<div class="col-md-8">
									<sf:input type="text" path="lastName" class="form-control"
										placeholder="Last Name" />
									<sf:errors path="lastName" cssClass="help-block" element="em"/> 
								</div>
							</div>
						
							<div class="form-group">
								<label class="control-label col-md-4">Email</label>
								<div class="col-md-8">
									<sf:input type="text" path="email" class="form-control"
										placeholder="abc@zyx.com" />
									<sf:errors path="email" cssClass="help-block" element="em"/> 									
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-4">Contact Number</label>
								<div class="col-md-8">
									<sf:input type="text" path="contactNumber" class="form-control"
										placeholder="XXXXXXXXXX" maxlength="10" />
									<sf:errors path="contactNumber" cssClass="help-block" element="em"/> 
								</div>
							</div>
							
							<div class="form-group">
								<label class="control-label col-md-4">Password</label>
								<div class="col-md-8">
									<sf:input type="password" path="password" class="form-control"
										placeholder="Password" />
									<sf:errors path="password" cssClass="help-block" element="em"/> 
								</div>
							</div>
							
							<div class="form-group">
								<label class="control-label col-md-4">Confirm Password</label>
								<div class="col-md-8">
									<sf:input type="password" path="confirmPassword" class="form-control"
										placeholder="Re-type password" />
									<sf:errors path="confirmPassword" cssClass="help-block" element="em"/>										 
								</div>
							</div>
							
	<div class="form-group">
		<label class="control-label col-md-4">Select Role</label>
		<div class="col-md-8">
			<label class="radio-inline">
				<sf:radiobutton path="role" value="USER" checked="checked"/> User 				
			</label>
			<label class="radio-inline">
				<sf:radiobutton path="role" value="SUPPLIER"/> Supplier
			</label>
		</div>
	</div>							

							<div class="form-group">
								<div class="col-md-offset-4 col-md-8">
									<button type="submit" name="_eventId_billing" class="btn btn-primary">
										Next - Billing <span class="glyphicon glyphicon-chevron-right"></span>
									</button>																	 
								</div>
							</div>
						
						
						</sf:form>					
					
					
					</div>
				
				
				</div>
			
			
			</div>
		
		
		</div>
		
		
	</div>


		<!--==========================
    Footer
  ============================-->

		<%@include file="../../shared/footer.jsp"%>

		<!-- #footer -->

		<a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>
		<!-- Uncomment below i you want to use a preloader -->
		<!-- <div id="preloader"></div> -->

		<!-- JavaScript Libraries -->
		<script src="${lib}/jquery/jquery.min.js"></script>
		<script src="${lib}/jquery/jquery-migrate.min.js"></script>
		<script src="${lib}/bootstrap/js/bootstrap.bundle.min.js"></script>
		<script src="${lib}/easing/easing.min.js"></script>
		<script src="${lib}/mobile-nav/mobile-nav.js"></script>
		<script src="${lib}/wow/wow.min.js"></script>
		<script src="${lib}/waypoints/waypoints.min.js"></script>
		<script src="${lib}/counterup/counterup.min.js"></script>
		<script src="${lib}/owlcarousel/owl.carousel.min.js"></script>
		<script src="${lib}/isotope/isotope.pkgd.min.js"></script>
		<script src="${lib}/lightbox/js/lightbox.min.js"></script>
		<!-- Contact Form JavaScript File -->
		<script src="${contactform}/contactform.js"></script>

		<!-- Template Main Javascript File -->
		<script src="${js}/main.js"></script>

	</div>

</body>
</html>
