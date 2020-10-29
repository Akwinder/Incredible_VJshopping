<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Laptops</title>
</head>
<body>

	<h3>Laptops</h3>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Photo</th>
			<th>Price</th>
			<th>Buy</th>
		</tr>
		
			<tr>
				<td>L01</td>
				<td>Dell XPS 13</td>
				<td><img src="image/laptop1.jpg" width="200"></td>
				<td>$1,450</td>
				<td align="center">
					<a href="${pageContext.request.contextPath }/cart/buy/${product.id}">Buy Now</a>
				</td>
			</tr>
			<tr>
				<td>L02</td>
				<td>Acer Aspire 5 slim laptop </td>
				<td><img src="image/laptop2.jpg" width="200"></td>
				<td>$2,500</td>
				<td align="center">
					<a href="${pageContext.request.contextPath }/buy/${product.id}">Buy Now</a>
				</td>
			</tr>
			<tr>
				<td>T03</td>
				<td>Toy Robot</td>
				<td><img src="image/hplaptop.jpeg" width="200"></td>
				<td>$2,650</td>
				<td align="center">
					<a href="${pageContext.request.contextPath }/buy/${product.id}">Buy Now</a>
				</td>
			</tr>
			
	
	</table>

</body>
</html>