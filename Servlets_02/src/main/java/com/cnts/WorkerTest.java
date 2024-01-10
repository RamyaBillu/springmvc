package com.cnts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class WorkerTest {
	public static void insert(Worker work) {

		Connection con = DBconnection.getConnection();
//		String query="INSERT INTO worker VALUES(?,?,?)";
		//String query = "update worker set name=? where id=?";
		 String query="SELECT * FROM worker";
		 //String query="delete from worker where id=?";
		PreparedStatement pre = null;
		try {
			pre = con.prepareStatement(query);

//			pre.setInt(1, str.getId());
//			pre.setString(2, str.getName());
//
//         	pre.setString(3,str.getCaste());
//			pre.executeUpdate();
//			ResultSet results = pre.executeQuery();
			

//			while(results.next()) {
//				int id=results.getInt(1);
//				String name=results.getString(2);
//				String caste=results.getString(3);
//				System.out.println(id);
//				System.out.println(name);
//				System.out.println(caste);
//
				
			//}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		DBconnection.close(pre, con);

	}

}
