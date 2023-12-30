<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center; font-family: cursive;">
		<%-- ${k } --%>
		<%-- <center><h3><%= request.getAttribute("k") %></h1></center> --%>
		<center>
		<h3>Student Details</h3>
		<h4>Student Id : ${student.id}</h4><br>
		<h4>Student name : ${student.name}</h4><br>
		<h4>Student age : ${student.age}</h4>
		</center>
	
</body>
</html>