<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expense Add</title>
</head>
<body>
 <form action="expense_add.jsp" method="post">
 	<div>
 		<label >Input:</label>
		<input  placeholder="Enter Item Name" type="text" name="item"/>
 	</div>
 	<div>
 		<label >Price:</label>
		<input  placeholder="Enter Price" type="text" name="price"/>
 	</div>
 	<div>
 		<label >Quantity:</label>
		<input  placeholder="Enter Quantity" type="text" name="quantity"/>
 	</div>
 	<div>
 		<label >Date:</label>
		<input  placeholder="Enter Your Expense Date" type="text" name="edate"/>
 	</div>
	<button type="submit">ADD</button>
 </form>
</body>
</html>