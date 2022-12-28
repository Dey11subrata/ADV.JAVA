<%@page import="com.sarje.model.Expense.Expense"%>
<%@page import="java.util.List"%>
<%@page import="com.sarje.service.ExpenseServiceImpl"%>
<%@page import="com.sarje.service.ExpenseService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!-- to display list of saved entity call to service method is needed  -->
<%
	ExpenseService expenseService = new ExpenseServiceImpl();
	List<Expense> expenses = expenseService.getAll(0);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expense List</title>
</head>
<body>
	<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Purchase Date</th>
            <th>UID</th>
            <th>Delete</th>
            <th>Update</th>
            
        </tr>
    </thead>

    <tbody>
        <% for (Expense expense: expenses){%>
        <tr>
            <td><%= expense.getId()%></td>
            <td><%= expense.getItem()%></td>
            <td><%= expense.getPrice() %></td>
            <td><%= expense.getQuantity() %></td>
            <td><%= expense.getEdate() %></td>
            <td><%= expense.getUid() %></td>
            <td> <a href="expense_delete.jsp?id=<%= expense.getId() %>"> Delete</a>
            <td> <a href="expense_update_list.jsp?id=<%= expense.getId() %>"> Update</a>
            </tr>
        <% } %>
    </tbody>
</table>
</body>
</html>