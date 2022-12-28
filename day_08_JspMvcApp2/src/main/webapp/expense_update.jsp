<%@page import="com.sarje.service.ExpenseServiceImpl"%>
<%@page import="com.sarje.service.ExpenseService"%>
<jsp:useBean id="expense" class="com.sarje.model.Expense.Expense"></jsp:useBean>
<jsp:setProperty property="*" name="expense"/>

<% 
	ExpenseService expenseService = new ExpenseServiceImpl();
	expenseService.modify(expense);
	response.sendRedirect("expense_showList.jsp");
%> 