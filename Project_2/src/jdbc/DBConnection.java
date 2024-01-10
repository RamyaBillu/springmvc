package jdbc;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class DBConnection {

		public static Connection getConnection() {

			String database = "products";
			String url = "jdbc:mysql://localhost:3306/feuji" + database;
			String username = "root";
			String password = "root";

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection(url, username, password);
				return connection;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

		public static void close(Statement statement, Connection connection) {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
				}
			}
		}

	}



