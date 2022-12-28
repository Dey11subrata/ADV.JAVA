
<%@page import="com.sarje.service.ExpenseServiceImpl"%>
<%@page import="com.sarje.service.ExpenseService"%>
<%
	/* first take the parameter comes with the request */
	String para = request.getParameter("id");
/* convert the string into integer */

	int id = Integer.parseInt(para);

/* create service class reference to call delete method */

	ExpenseService expenseService = new ExpenseServiceImpl();
	expenseService.delete(id);
	response.sendRedirect("expense_showList.jsp");
%>