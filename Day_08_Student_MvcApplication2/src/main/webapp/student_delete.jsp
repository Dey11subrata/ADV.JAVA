<%@page import="com.subrata.service.StudentServiceImpl"%>
<%@page import="com.subrata.service.StudentService"%>
<%

	String para1 = request.getParameter("rollNo");
	String para2 = request.getParameter("standard");
	int rollNo = Integer.parseInt(para1);
	int standard = Integer.parseInt(para2);
	StudentService studentService = new StudentServiceImpl();
studentService.remove(rollNo, standard);

response.sendRedirect("student_showList.jsp");
%>