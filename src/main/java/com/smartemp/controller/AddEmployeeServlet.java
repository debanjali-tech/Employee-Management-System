package com.smartemp.controller;

import java.io.IOException;

import com.smartemp.dao.EmployeeDAO;
import com.smartemp.entity.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String department = request.getParameter("department");

        double salary =
                Double.parseDouble(request.getParameter("salary"));

        Employee emp = new Employee();

        emp.setName(name);
        emp.setEmail(email);
        emp.setDepartment(department);
        emp.setSalary(salary);

        EmployeeDAO dao = new EmployeeDAO();

        if(dao.addEmployee(emp)) {

            response.getWriter()
                    .println("Employee Added Successfully");
            response.sendRedirect("dashboard.jsp");

        } else {

            response.getWriter()
                    .println("Failed");
        }
    }
}