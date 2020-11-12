<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<style>
body, html {
  height: 100%;
  margin: 0;
}

.bg {
  /* The image used */
  background-image: url("image/background.jpg");

  /* Full height */
  height: 90%; 

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
<body class="bg">
</head>
<h2>Registration form</h2>
		
			
<form:form action="${pageContext.request.contextPath}/userregistration/" cssClass="form-horizontal"
			method="post" modelAttribute="users">
			
			<div class="form-group" align="center">
				<label for="firstName" class="col-md-3 control-label">First Name</label>
				<div class="col-md-9">
					<form:input path="firstName" cssClass="form-control" />
				</div>
			</div>
			
			<div class="form-group" align="center">
				<label for="lastName" class="col-md-3 control-label">Last Name</label>
				<div class="col-md-9">
					<form:input path="lastName" cssClass="form-control" />
				</div>
			</div>
			<div class="form-group" align="center">
				<label for="email" class="col-md-3 control-label">E-mail</label>
				<div class="col-md-9">
					<form:input path="email" cssClass="form-control" />
				</div>
			</div>
			<div class="form-group" align="center">
				<label for="password" class="col-md-3 control-label">Password</label>
				<div class="col-md-9">
					<form:input path="password" cssClass="form-control" />
				</div>
			</div>
			<div class="form-group" align="center">
				<label for="phoneNumber" class="col-md-3 control-label">Phone Number</label>
				<div class="col-md-9">
					<form:input path="phoneNumber" cssClass="form-control" />
				</div>
			</div>
			
			
			<div class="form-group" align="center">
				<!-- Button -->
				<div class="col-md-offset-3 col-md-9">
					<form:button cssClass="btn btn-primary">Submit</form:button>
				</div>
			</div>
			</form:form>
 
</body>
</html>