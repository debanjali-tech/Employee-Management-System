<%@ page import="com.smartemp.dao.EmployeeDAO" %>
<%@ page import="com.smartemp.entity.Employee" %>

<%
int id = Integer.parseInt(request.getParameter("id"));

EmployeeDAO dao = new EmployeeDAO();

Employee emp = dao.getEmployeeById(id);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Employee</title>
</head>
<body>

<h2>Edit Employee</h2>

<form action="updateEmployee" method="post">

<input type="hidden"
       name="id"
       value="<%= emp.getId() %>">

Name:
<input type="text"
       name="name"
       value="<%= emp.getName() %>"
       required>

<br><br>

Email:
<input type="email"
       name="email"
       value="<%= emp.getEmail() %>"
       required>

<br><br>

Department:
<input type="text"
       name="department"
       value="<%= emp.getDepartment() %>"
       required>

<br><br>

Salary:
<input type="number"
       name="salary"
       value="<%= emp.getSalary() %>"
       required>

<br><br>

<input type="submit" value="Update Employee">

</form>

<br><br>

<a href="viewEmployee">Back</a>

</body>
</html>