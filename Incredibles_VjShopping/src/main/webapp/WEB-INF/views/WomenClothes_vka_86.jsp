<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Page</title>
</head>
<body>

	<h3>Women Clothing</h3>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Photo</th>
			<th>Price</th>
			<th>Buy</th>
		</tr>
		
			<tr>
				<td>w01</td>
				<td>women shorts</td>
				<td><img src="image//womenShort.jpg" width="200"></td>
				<td>$150</td>
				<td align="center">
					<a href="${pageContext.request.contextPath }/cart/buy/${product.id}">Buy Now</a>
				</td>
			</tr>
			<tr>
				<td>w02</td>
				<td>women Denim</td>
				<td><img src="image//womenDenim.jpg" width="110"></td>
				<td>$100</td>
				<td align="center">
					<a href="${pageContext.request.contextPath }/buy/${product.id}">Buy Now</a>
				</td>
			</tr>
			<tr>
				<td>w03</td>
				<td>women shorts</td>
				<td><img src="image/skinnyJeans.jpg" width="200"></td>
				<td>$250</td>
				<td align="center">
					<a href="${pageContext.request.contextPath }/buy/${product.id}">Buy Now</a>
				</td>
			</tr>
			<tr>
				<td>w04</td>
				<td>women shorts</td>
				<td><img src="image/dressWomen.jpg" width="200"></td>
				<td>$150</td>
				<td align="center">
					<a href="${pageContext.request.contextPath }/buy/${product.id}">Buy Now</a>
				</td>
			</tr>
	
	</table>

</body>
</html>