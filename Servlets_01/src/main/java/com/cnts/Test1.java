package com.cnts;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test1 extends  HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/feuji?user=root&password=root");
			String sql="insert into register(name,age,gender)values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,"ramya" );
			ps.setInt(2, 33);
			ps.setString(3, "f");

			int n=ps.executeUpdate();
			System.out.println(n);
			con.close();
			
		
		}
		catch (Exception e) {
			System.out.println("jdbc issue");
			e.printStackTrace();
		}
		
	}



	

}
