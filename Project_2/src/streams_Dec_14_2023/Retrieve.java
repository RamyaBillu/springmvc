package streams_Dec_14_2023;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Retrieve {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
	     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/feuji","root","root");
	     Statement st=con.createStatement();
	     String sql="select* from studentass";
	    
	 		     	
	     st.execute(sql);
	     ResultSet rs=st.getResultSet();
	     while(rs.next()) {
	     int id=rs.getInt(1);
	     String name=rs.getString(2);
	     String gender=rs.getString(3);
	     String department=rs.getString(4);
	     String address=rs.getString(5);
	     String city=rs.getString(6);
	     String state=rs.getString(7);


	     System.out.println(id);
	     System.out.println(name);
	     System.out.println(gender);
	     System.out.println(department);
	     System.out.println(address);
	     System.out.println(city);
	     System.out.println(state);


	     }
	     con.close();
	     System.out.println("Excuted");

		

	}

}
