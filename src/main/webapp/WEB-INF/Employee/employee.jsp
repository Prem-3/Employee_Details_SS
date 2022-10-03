 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page import="com.database.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
</head>
<body>
<% Employee emp= (Employee)request.getAttribute("emp")  ;%>
<div>
		<table>
			<tr>
				<th>Employee Id</th>
				<th>Employee Name</th>
				<th>Employee Department</th>
			</tr>
			<tr>
				<td>
					<%=emp.getEmpId() %>
				</td>
				<td><%=emp.getEmpName()%></td>
				<td><%=emp.getEmpEmail()%></td>
			</tr>
		</table>
	</div>
</body>
</html>