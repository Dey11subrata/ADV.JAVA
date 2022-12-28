<%@page import="com.sarje.model.Expense.Expense"%>
<%@page import="com.sarje.service.ExpenseServiceImpl"%>
<%@page import="com.sarje.service.ExpenseService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!-- capture the details comes up with request  -->

<%
	String para=request.getParameter("id");
	int id = Integer.parseInt(para);
	ExpenseService expenseService = new ExpenseServiceImpl();
	Expense expense = expenseService.getById(id);
	/*  the object that is received bsuin this function is that one which is needed to be updated
	first these details are need to be displayed for user view then only we can update it
	to display the details use the below form*/
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expense Add Update</title>
</head>
<body>
	<form action="expense_update.jsp" method="post">
		<div>
 		<!-- <label >ID:</label> -->
		<input  value="<%=expense.getId() %>" type="hidden" name="id"/>
 	</div>
		<div>
 		<label >Input:</label>
		<input  value="<%=expense.getItem() %>" type="text" name="item"/>
 	</div>
 	<div>
 		<label >Price:</label>
		<input  value="<%=expense.getPrice() %>" type="text" name="price"/>
 	</div>
 	<div>
 		<label >Quantity:</label>
		<input  value="<%=expense.getQuantity() %>" type="text" name="quantity"/>
 	</div>
 	<div>
 		<label >Date:</label>
		<input  value="<%=expense.getEdate() %>" type="text" name="edate"/>
 	</div>
	<button type="submit">UPDATE</button>
	</form>
</body>
</html>