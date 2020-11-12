<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>VJ shopping</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/home.css">
<style>
logo {
	float: left;
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
	float: center;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
}

li {
	float: left;
	border-right: 1px solid #bbb;
	display: inline;
}
/* Navbar container */
.navbar {
	overflow: hidden;
	background-color: #333;
	font-family: Arial;
}

/* Links inside the navbar */
.navbar a {
	float: left;
	font-size: 16px;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

/* The dropdown container */
.dropdown {
	float: left;
	overflow: hidden;
}

/* Dropdown button */
.dropdown .dropbtn {
	font-size: 16px;
	border: none;
	outline: none;
	color: white;
	padding: 14px 16px;
	background-color: inherit;
	font-family: inherit;
	/* Important for vertical align on mobile phones */
	margin: 0; /* Important for vertical align on mobile phones */
}

/* Add a red background color to navbar links on hover */
.navbar a:hover, .dropdown:hover .dropbtn {
	background-color: red;
}

/* Dropdown content (hidden by default) */
.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f9f9f9;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

/* Links inside the dropdown */
.dropdown-content a {
	float: none;
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
	text-align: left;
}

/* Add a grey background color to dropdown links on hover */
.dropdown-content a:hover {
	background-color: #ddd;
}

.navbar.search-container {
	float: right;
}

.navbar input[type=text] {
	border: 1px solid #ccc;
}
/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content {
	display: block;
}

.imglogo {
	border-radius: 50%;
	display: block;
	margin-left: auto;
	margin-right: auto;
	margin-top: 50px;
	float: left;
}

footer {
	background-color: DarkSalmon;
}

a {
	text-decoration: none;
	color: black;
}

button {
	background-color: black;
	color: white;
}
</style>

</head>


<body>
	<nav>
		<img src="image/logo.jpg"
			style="position: absolute; left: 70px; top: 10px;" width="100"
			height="80" />
		<div class="navbar">

			<a href="http://localhost:8080/Incredibles_VjShopping/login"
				style="position: absolute; right: 300px; top: 10px;">Login</a><a
				href="http://localhost:8080/Incredibles_VjShopping/registration"
				style="position: absolute; right: 200px; top: 10px;">Registration</a>
			<a href="#"
				style="position: absolute; right: 120px; top: 20px color:red;"><i
				class="fa fa-shopping-cart fa_custom fa-2x"></i></a><br /> <br /> <br />
			<br /> <a href="http://localhost:8080/Incredibles_VjShopping/home">Home</a>
			<div class="dropdown">
				<button class="dropbtn">
					clothes <i class="fa fa-caret-down"></i>
				</button>
				<div class="dropdown-content">
					<a href="#">Women</a> <a href="#">Men</a> <a href="#">Kids</a>
				</div>
			</div>

			<a href="#toys">Toys</a>

			<div class="dropdown">
				<button class="dropbtn">
					Fashion <i class="fa fa-caret-down"></i>
				</button>
				<div class="dropdown-content">
					<a href="http://localhost:8080/Incredibles_VjShopping/product">Women</a>
					<a href="#">Men</a> <a href="#">Kids</a>
				</div>
			</div>
			<div class="dropdown">
				<button class="dropbtn">
					Electronics<i class="fa fa-caret-down"></i>
				</button>
				<div class="dropdown-content">
					<a href="#">Laptop</a> <a href="#">Mobile</a> <a href="#">Smart
						Gedgets</a>
				</div>
			</div>
		</div>
		<div class="search-container">
			<form action="/action_page.php">
				<input type="text" placeholder="Search.." name="search">
				<button type="submit">
					<i class="fa fa-search"></i>
				</button>
			</form>
		</div>
	</nav>
	<section>
		<br>
		<br> <a href="#"><img src="image/deal.png" width="1500"
			height="500"></a>
		<div class="row">
			<div class="column">

				<a href="#"><img src="image/laptophome.png" class="imglogo"
					width="200" height="200"> </a>


			</div>
			<div class="column">

				<a href="#"><img src="image/jewlaryhome.jpg" class="imglogo"
					width="200" height="200"> </a>

			</div>

			<a href="#"><img src="image/home decor.jpg" class="imglogo"
				width="200" height="200"> </a>

			<div class="column">

				<a href="#"><img src="image/dresslogo.jpg" class="imglogo"
					width="200" height="200"> </a>

			</div>
		</div>
		<article></article>
	</section>

	<aside></aside>

</body>
<footer>
	<div class="row">
		<div class="column">
			<h4>
				<b>Contact US</b>
			</h4>
			<address>
				<i class="fa fa-fw fa-map-marker"></i> Vj enterprise 109-3840
				Jacombs Rd<br /> Richmond,<br /> BC V6V 1Y6<br /> Canada
			</address>
			<p>
				Telephone: <a href="tel: +1 2367896543"><i
					class="fa fa-fw fa-phone"></i></a> +12367896543
			</p>
			<p>
				Mail : <a href="mailto:vj@mail.com"><i
					class="fa fa-fw fa-envelope"></i> </a>vj@mail.com
			</p>
		</div>
		<div class="column">
			<h4>
				<b>We accept</b>
			</h4>
			<p>
				<i class="fa fa-fw fa-cc-amex"></i> Amex
			</p>
			<p>
				<i class="fa fa-fw fa-credit-card"></i> Credit Card
			</p>

			<h4>
				<b>About</b>
			</h4>
			<p>
				<a href="#">About us</a>
			</p>
			<p>
				<a href="#">We're hiring</a>
			</p>
			<p>
				<a href="#">Support</a>
			</p>
			<p>
				<a href="#">Help</a>
			</p>
		</div>

		<div class="column">
			<h4>
				<b>Social platforms</b>
			</h4>
			<i class="fa fa-facebook-official "></i> <i class="fa fa-instagram "></i>
			<i class="fa fa-snapchat "></i> <i class="fa fa-pinterest-p "></i> <i
				class="fa fa-twitter "></i> <i class="fa fa-linkedin "></i>
			<h4>
				<b>Subscribe for newsletters</b>
			</h4>
			<input class="subscribe" type="Email" placeholder="abc@gmail.com"
				required><br />
			<br />
			<button type="submit" class="subscribe">Subscribe</button>

		</div>
		<div class="column">
			<form action="#" target="_blank">
				<h4>
					Do you have question?<br /> Go ahead.
				</h4>
				<p>
					<input class="border" type="text" placeholder="Name" name="Name"
						required>
				</p>
				<p>
					<input class="border" type="text" placeholder="Email" name="Email"
						required>
				</p>
				<p>
					<input class="border" type="text" placeholder="Subject"
						name="Subject" required>
				</p>
				<p>
					<input class="border" type="text" placeholder="Message"
						name="Message" required>
				</p>
				<button type="submit" class="w3-button w3-block w3-black">Send</button>
			</form>

		</div>
	</div>

</footer>
</html>