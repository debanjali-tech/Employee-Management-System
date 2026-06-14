package com.smartemp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.smartemp.db.DBConnection;
import com.smartemp.entity.Employee;

public class EmployeeDAO {

    public boolean addEmployee(Employee emp) {

        boolean status = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql =
                    "insert into employee(name,email,department,salary) values(?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, emp.getName());
            ps.setString(2, emp.getEmail());
            ps.setString(3, emp.getDepartment());
            ps.setDouble(4, emp.getSalary());

            int row = ps.executeUpdate();

            if(row > 0) {
                status = true;
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return status;
    }
    
    public List<Employee> getAllEmployees() {

        List<Employee> list = new ArrayList<>();

        try {

            Connection con = DBConnection.getConnection();

            String sql = "select * from employee";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                Employee emp = new Employee();

                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setEmail(rs.getString("email"));
                emp.setDepartment(rs.getString("department"));
                emp.setSalary(rs.getDouble("salary"));

                list.add(emp);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    
    public boolean deleteEmployee(int id) {

        boolean status = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql =
                    "delete from employee where id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            int row = ps.executeUpdate();

            if(row > 0) {
                status = true;
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return status;
    }
    
    public Employee getEmployeeById(int id) {

        Employee emp = null;

        try {

            Connection con = DBConnection.getConnection();

            String sql =
                    "select * from employee where id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {

                emp = new Employee();

                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setEmail(rs.getString("email"));
                emp.setDepartment(rs.getString("department"));
                emp.setSalary(rs.getDouble("salary"));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return emp;
    }
    
    public boolean updateEmployee(Employee emp) {

        boolean status = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql =
                    "update employee set name=?,email=?,department=?,salary=? where id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, emp.getName());
            ps.setString(2, emp.getEmail());
            ps.setString(3, emp.getDepartment());
            ps.setDouble(4, emp.getSalary());
            ps.setInt(5, emp.getId());

            int row = ps.executeUpdate();

            if(row > 0) {
                status = true;
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return status;
    }
    
}