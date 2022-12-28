<%@page import="com.subrata.model.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.subrata.service.StudentServiceImpl"%>
<%@page import="com.subrata.service.StudentService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!-- we got list of all the students now we have to traverse it and print on view page -->
    
    <%
    	StudentService studentService = new StudentServiceImpl();
   List<Student> students = studentService.showAll();
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show All Students</title>
</head>
<body>
		<div>
			<table>
				<thead>
				<tr>
						<th> rollNo </th>
						<th> name </th>
						<th> standard </th>
						<th> percentageScored </th>
						<th> dob </th>
						<th> contact  </th>
						<th> local address </th>
						<th> Delete </th>
						
				</tr>
					
				</thead>
				
				<tbody>
				<% for (Student s: students) {%>
					<tr>
						<td> <%=s.getRollNo() %></td>
						<td> <%=s.getName() %></td>
						<td> <%=s.getStandard() %></td>
						<td> <%=s.getPercentageScored() %></td>
						<td> <%=s.getDob() %></td>
						<td> <%=s.getContact() %></td>
						<td> <%=s.getLocalAddress() %></td>
						<!-- to delete a student from list we have to idntify the student for this we rollNo is used (have two entity with same rollNo-- need to check this)  -->
						<td> <a href="student_delete.jsp?rollNo=<%=s.getRollNo()%>&standard=<%=s.getStandard()%>">Delete</a></td>
						
						
					</tr>
					<%} %>
				</tbody>
					
			</table>
		</div>
</body>
</html>