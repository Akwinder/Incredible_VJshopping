<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
* {
	box-sizing: border-box;
}

.column {
	float: left;
	width: 23.33%;
	padding: 5px;
}

/* Clearfix (clear floats) */
.row::after {
	content: "";
	clear: both;
	display: table;
}

img {
	border-radius: 50%;
	display: block;
	margin-left: auto;
	margin-right: auto;
	margin-top: 50px;
}

h4 {
	text-align: center;
}

p {
	text-align: center;
}

div {
	text-align: center;
}
</style>
<title>Registartion</title>
</head>
<body style="background-color: powderblue;">
	<h1></h1>
	<div class="row">
		<div class="column">
			<figure>
				<a href="http://localhost:8080/Incredibles_VjShopping/userlogin">
					<img src="<spring:url value="image/userImage.jpg"/>" alt="Avatar"
					style="width: 200px" height="200px">
				</a>
				<figcaption>User login</figcaption>
			</figure>
		</div>
		<div class="column">
			<figure>
				<a href="http://localhost:8080/Incredibles_VjShopping/adminlogin">
					<img src="<spring:url value="image/adminImage.jpg"/>" alt="Avatar"
					style="width: 200px" height="200px">
				</a>
				<figcaption>Admin login</figcaption>
			</figure>
		</div>

		<div class="column">
			<figure>
				<a
					href="http://localhost:8080/Incredibles_VjShopping/userregistration">
					<img src="<spring:url value="image/newCostumers.png"/>"
					alt="Avatar" style="width: 200px" height="200px">
				</a>
				<figcaption>New User</figcaption>
			</figure>
		</div>
		<div class="column">
			<figure>
				<a href="http://localhost:8080/Incredibles_VjShopping/registration">
					<img src="<spring:url value="image/newCostumers.png"/>"
					alt="Avatar" style="width: 200px" height="200px">
				</a>
				<figcaption>New Admin</figcaption>
			</figure>
		</div>
	</div>

	<h4>Click on the Photos For options!</h4>
</body>
</html>
