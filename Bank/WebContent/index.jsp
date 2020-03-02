<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bank</title>

<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0-alpha.6/js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/form.js"></script>
</head>
<body>
	<h3>Create Account</h3>

	Username:
	<input type="text" name="username" id="a_name">
	<br> Email ID:
	<input type="email" name="email" id="a_email">
	<br> Age:
	<input type="number" name="age" id="a_age">
	<br> Phone Number:
	<input type="text" name="phone" id="a_phone">
	<br> Branch Name:
	<input type="text" name="branch" id="a_branch">
	<br>
	<button type="button" id="add">Add</button>

</body>
</html>