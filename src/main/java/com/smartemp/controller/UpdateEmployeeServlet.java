package com.smartemp.controller;

import java.io.IOException;

import com.smartemp.dao.EmployeeDAO;
import com.smartemp.entity.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updateEmployee")
public class UpdateEmployeeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        int id =
                Integer.parseInt(request.getParameter("id"));

        String name =
                request.getParameter("name");

        String email =
                request.getParameter("email");

        String department =
                request.getParameter("department");

        double salary =
                Double.parseDouble(
                        request.getParameter("salary"));

        Employee emp = new Employee();

        emp.setId(id);
        emp.setName(name);
        emp.setEmail(email);
        emp.setDepartment(department);
        emp.setSalary(salary);

        EmployeeDAO dao = new EmployeeDAO();

        dao.updateEmployee(emp);

        response.sendRedirect("viewEmployee");
    }
}