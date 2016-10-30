<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Form</title>
</head>
<body>
	<h1>Register Form</h1>
	<form action="reg" method="post">
		<label>Name:</label>
		<input type="text" name="name"></br>
		<label>Email:</label>
		<input type="text" name="email"></br>
		<label>Password:</label>
		<input type="text" name="password"></br>
		<label>Confirm :</label>
		<input type="text" name="confirm"></br></br>
		<input type="submit" value="Register">
	</form>
</body>
</html>