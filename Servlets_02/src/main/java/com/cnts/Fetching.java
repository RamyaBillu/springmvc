package com.cnts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Fetching {
	public static List<Worker> fetch()  {
		List<Worker>list=new ArrayList<>();
		Connection con=DBconnection.getConnection();
		String query="SELECT * FROM Worker";
		PreparedStatement pre=null;
		try{
			pre = con.prepareStatement(query);
		    ResultSet resultSet = pre.executeQuery();
		    while(resultSet.next()) {
				Worker work=new Worker();
				work.setId(resultSet.getInt("id"));
				work.setName(resultSet.getString("name"));
				work.setCaste(resultSet.getString("address"));
				list.add(work);	
			}
//		    System.out.println(list);
		}catch(SQLException e) {
			System.out.println(e);
		}
		DBconnection.close(pre, con);

		return list;


}


}
