package com.smartemp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.smartemp.db.DBConnection;

public class UserDAO {

	public boolean login(String username, String password) {

	    boolean status = false;

	    try {

	        Connection con = DBConnection.getConnection();

	        System.out.println("Connection = " + con);

	        String sql =
	                "select * from user where username=? and password=?";

	        PreparedStatement ps =
	                con.prepareStatement(sql);

	        ps.setString(1, username);
	        ps.setString(2, password);

	        ResultSet rs = ps.executeQuery();

	        if(rs.next()) {

	            System.out.println("User Found");
	            status = true;

	        } else {

	            System.out.println("User Not Found");
	        }

	    } catch(Exception e) {
	        e.printStackTrace();
	    }

	    return status;
	}
}