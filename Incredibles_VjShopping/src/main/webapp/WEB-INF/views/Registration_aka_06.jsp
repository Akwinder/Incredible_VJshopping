<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<link href="<c:url value="/static/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/static/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/static/js/bootstrap.min.js" />"></script>
</head>
<h2>Registration form</h2>


<form:form action="${pageContext.request.contextPath}/registration/"
	cssClass="form-horizontal" method="post" modelAttribute="admins">

	<div class="form-group">
		<label for="firstName" class="col-md-3 control-label">First
			Name</label>
		<div class="col-md-9">
			<form:input path="firstName" cssClass="form-control" />
		</div>
	</div>

	<div class="form-group">
		<label for="lastName" class="col-md-3 control-label">Last Name</label>
		<div class="col-md-9">
			<form:input path="lastName" cssClass="form-control" />
		</div>
	</div>
	<div class="form-group">
		<label for="email" class="col-md-3 control-label">E-mail</label>
		<div class="col-md-9">
			<form:input path="email" cssClass="form-control" />
		</div>
	</div>
	<div class="form-group">
		<label for="password" class="col-md-3 control-label">Password</label>
		<div class="col-md-9">
			<form:input path="password" cssClass="form-control" />
		</div>
	</div>
	<div class="form-group">
		<label for="phoneNumber" class="col-md-3 control-label">Phone
			Number</label>
		<div class="col-md-9">
			<form:input path="phoneNumber" cssClass="form-control" />
		</div>
	</div>


	<div class="form-group">
		<!-- Button -->
		<div class="col-md-offset-3 col-md-9">
			<form:button cssClass="btn btn-primary">Submit</form:button>
		</div>
	</div>
</form:form>

</body>
</html>