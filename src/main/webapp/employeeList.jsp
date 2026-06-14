<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="com.smartemp.entity.Employee" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>

<style>

table{
    border-collapse: collapse;
    width: 80%;
}

th,td{
    padding: 10px;
    text-align: center;
}

th{
    background-color: #f2f2f2;
}

a{
    text-decoration: none;
}

</style>

</head>

<body>

<h2>Employee List</h2>

<table border="1">

<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Department</th>
    <th>Salary</th>
    <th>Edit</th>
    <th>Delete</th>
</tr>

<%

List<Employee> list =
        (List<Employee>)request.getAttribute("empList");

if(list != null){

    for(Employee emp : list){

%>

<tr>

    <td><%= emp.getId() %></td>

    <td><%= emp.getName() %></td>

    <td><%= emp.getEmail() %></td>

    <td><%= emp.getDepartment() %></td>

    <td><%= emp.getSalary() %></td>

    <td>

        <a href="editEmployee.jsp?id=<%= emp.getId() %>">

            Edit

        </a>

    </td>

    <td>

        <a href="deleteEmployee?id=<%= emp.getId() %>">

            Delete

        </a>

    </td>

</tr>

<%

    }

}else{

%>

<tr>

<td colspan="7">

No Employee Found

</td>

</tr>

<%

}

%>

</table>

<br><br>

<a href="addEmployee.jsp">

Add Employee

</a>

<br><br>

<a href="dashboard.jsp">

Back To Dashboard

</a>

</body>
</html>