<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="register" method="get">
		Name: <input type="text" name ="name" placeholder="Enter your name"><br><br>
		Email: <input type="email" name ="mail" placeholder="Enter your Email id"><br><br>
		Password: <input type="password" name ="pass" placeholder="Enter your Password"><br><br>
		gender: <input type="radio" name ="gender1" value="Male"> Male &nbsp <input type="radio" name ="gender1" value="Female">Female
		<br><br><input type="submit" value="Register">
	</form>
</body>
</html>