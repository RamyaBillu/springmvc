package com.cnts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteClass {
		public static void delete(int id){
			Connection con=DBconnection.getConnection();
			String query="delete from worker where id=?";
			PreparedStatement pre=null;
			try {
				pre = con.prepareStatement(query);
				pre.setInt(1, id);
			    pre.executeUpdate();
				System.out.println("Record deleted");
			} catch (SQLException e) {
				System.out.println(e);
			}
		    DBconnection.close(pre, con);
			
		}
	}

		