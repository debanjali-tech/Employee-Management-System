package com.smartemp.controller;

import java.io.IOException;

import com.smartemp.dao.UserDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("Username = " + username);
        System.out.println("Password = " + password);

        UserDAO dao = new UserDAO();

        boolean result = dao.login(username, password);

        System.out.println("Login Result = " + result);

        if(result) {

            HttpSession session = request.getSession();

            session.setAttribute("user", username);

            response.sendRedirect("dashboard.jsp");

        } else {

            response.getWriter().println(
                    "Invalid Username or Password");
        }
    }
}