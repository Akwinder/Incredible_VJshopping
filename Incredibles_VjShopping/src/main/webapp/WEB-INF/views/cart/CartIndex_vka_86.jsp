<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart Page</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th, input {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}

a {
	text-decoration: none;
}
</style>
</head>
<body>
	<h3>Cart Page</h3>
	<header>

		<a href="http://localhost:8080/Incredibles_VjShopping/logout"><img
			src="${pageContext.request.contextPath }/image/homeIcon.png"
			width="30" /></a> <a
			href="http://localhost:8080/Incredibles_VjShopping/product">Products</a>
	</header>
	
		<table border="1">
			<tr>
				<th>Option</th>
				<th>Id</th>
				<th>Name</th>
				<th>Photo</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Sub Total</th>
			</tr>
			<c:set var="total" value="0"></c:set>
			<c:forEach var="item" items="${sessionScope.cart }">
				<c:set var="total"
					value="${total + item.product.price * item.quantity }"></c:set>
				<tr>
					<td align="center"><a
						href="${pageContext.request.contextPath }/cart/remove/${item.product.id }"
						onclick="return confirm('Are you sure?')">Remove</a></td>
					<td>${item.product.id }</td>
					<td>${item.product.name }</td>
					<td><img
						src="${pageContext.request.contextPath}/image/${item.product.photo }"
						width="50"></td>
					<td><fmt:formatNumber type="currency">
		${item.product.price }
			</fmt:formatNumber></td>

					<td><input type="number" name="quantity"
						value="${item.getQuantity()}" min="0" max="12" value="1" step="1">
					<a href="${pageContext.request.contextPath }/product"><input
							type="submit" value="Update"></a></td>
					<td><fmt:formatNumber type="currency">
		${item.cartPrice()}
			</fmt:formatNumber></td>

				</tr>
			</c:forEach>
			<tr>
				<td colspan="6" align="left">Total Amount</td>
				<td>Total:<fmt:formatNumber type="currency">
			${total }
			</fmt:formatNumber>
				</td>
			</tr>

		</table>
	
	<br>
	<a href="${pageContext.request.contextPath }/product">Continue
		Shopping</a>

 

</body>
</html>