package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class FetchRecordsByST
{
	public static List<Student> fetchResultSet() {
		Connection con = null;
		Statement st = null;
		String url ="jdbc:mysql://localhost:3306" , user="root" ,pwd="root";
		String qry = "select * from feuji.student";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pwd);
			st=con.createStatement();
			ResultSet rs = st.executeQuery(qry);
			List<Student> list = new ArrayList<>();
			
			while(rs.next())
			{
				list.add(new Student(rs.getInt("Id"),rs.getString("Name"), rs.getLong("Phno"),
						rs.getString("Password"),rs.getDouble("Marks"),rs.getString("Location")));
				
			}
			return list;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			if(st != null)
			{
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;

	}
}


