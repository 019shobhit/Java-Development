<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
		<h1>Welcome to Home Page</h1>
				<% String myname = (String) session.getAttribute("name_key");%>
		
		<h3>Welcome : <%=myname %></h3>
		
		
	<br>
	<a href="profile.jsp">Profile</a>
	&nbsp &nbsp
	<a href="about-us.jsp">About us</a>
</body>
</html>