<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>toys</title>
</head>
<body>

	<h3>Toys</h3>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Photo</th>
			<th>Price</th>
			<th>Buy</th>
		</tr>
		
			<tr>
				<td>T01</td>
				<td>Learning Toys</td>
				<td><img src="image/ToyLearning.jpg" width="200"></td>
				<td>$450</td>
				<td align="center">
					<a href="${pageContext.request.contextPath }/cart/buy/${product.id}">Buy Now</a>
				</td>
			</tr>
			<tr>
				<td>T02</td>
				<td>Mini Scooter</td>
				<td><img src="image/toyMiniScooter.jpeg" width="200"></td>
				<td>$500</td>
				<td align="center">
					<a href="${pageContext.request.contextPath }/buy/${product.id}">Buy Now</a>
				</td>
			</tr>
			<tr>
				<td>T03</td>
				<td>Toy Robot</td>
				<td><img src="image/ToyRobot.jpg" width="200"></td>
				<td>$650</td>
				<td align="center">
					<a href="${pageContext.request.contextPath }/buy/${product.id}">Buy Now</a>
				</td>
			</tr>
			
	
	</table>

</body>
</html>