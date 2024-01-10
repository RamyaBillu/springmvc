package com.cnts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	public static void update(int id,String name){
		Connection con=DBconnection.getConnection();
		String query="UPDATE worker set name=? WHERE id=?";
		PreparedStatement pre=null;
		try {
			pre = con.prepareStatement(query);
			pre.setString(1,name);
			pre.setInt(2, id);
		    pre.executeUpdate();
			System.out.println("Record updated");
		} catch (SQLException e) {
			System.out.println(e);
		}
	    DBconnection.close(pre, con);
		
	}
}
 