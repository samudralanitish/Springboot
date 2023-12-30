<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot</title>
</head>
<body style="text-align: center; font-family: cursive;">
	<h1>Spring Boot Application</h1>
	<!-- <form action="add" method="post">
		Enter a number <input type="text" name="num1" required="required" ><br><br>
		Enter b number <input type="text" name="num2" required="required"><br><br>
		<button>Submit</button><br><br>
	</form> -->
	
	<form action="addstudent" method="post">
		Enter student name : <input type="text" name="name" required="required"><br><br>
		Enter student age : <input type="number" name="age" required="required"><br><br>
		<button>Add to Database</button><br><br>
	</form>
	
	
	<form action="getstudent" method="post">
		Enter student id : <input type="text" name="id"  required="required"><br><br>
		<button>Get Student From Database</button> 
	</form>
	<br><br>
	
	<form action="updatestudent" method="post">
		Enter student id : <input type="text" name="id"  required="required"><br><br>
		Enter student name : <input type="text" name="name" required="required"><br><br>
		Enter student age : <input type="number" name="age" required="required"><br><br>
		<button>Update to Database</button><br><br>
	</form>
	
	<form action="deletestudent" method="post">
		Enter student id : <input type="text" name="id"  required="required"><br><br>
		<button>Delete Student From Database</button>
	</form>

</body>
</html>