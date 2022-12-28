<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Student</title>
</head>
<body>
	<form action="student_add.jsp" method="post">
	<div>
		<label>Roll Number:</label>
		<input type="text" name="rollNo" placeholder="enter roll number">
	</div>
	<div>
		<label>Name:</label>
		<input type="text" name="name" placeholder="enter name">
	</div>
	<div>
		<label>Standard:</label>
		<input type="text" name="standard" placeholder="enter standard">
	</div>
	<div>
		<label>Percentage Scored:</label>
		<input type="text" name="percentageScored" placeholder="enter percentage">
	</div>
	<div>
		<label>Date Of Birth:</label>
		<input type="text" name="dob" placeholder="enter date of birth">
	</div>
	<div>
		<label>Contact:</label>
		<input type="text" name="contact" placeholder="enter contact number">
	</div>
	<div>
		<label>Local Address:</label>
		<input type="text" name="localAddress" placeholder="enter address">
	</div>
	<button type="submit" >Register</button>
	</form>
</body>
</html>