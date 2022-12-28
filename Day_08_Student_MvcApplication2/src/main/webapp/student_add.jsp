<%@page import="com.subrata.service.StudentServiceImpl"%>
<%@page import="com.subrata.service.StudentService"%>
<jsp:useBean id="student" class="com.subrata.model.Student"> </jsp:useBean>
<jsp:setProperty property="*" name="student"/>

<%
	StudentService studentService = new StudentServiceImpl();
	studentService.add(student);
	response.sendRedirect("student_form.jsp");
%>