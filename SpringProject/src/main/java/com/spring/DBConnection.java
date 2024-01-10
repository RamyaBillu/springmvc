package com.spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	private static DBConnection connection = new DBConnection();

	private DBConnection() {
	}

	public static synchronized DBConnection getInstanace() {
		if (connection == null) {
			connection = new DBConnection();
		}
		return connection;
	}

	public Connection getConnection() {

		String database = "product1";
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

	public void close(Statement statement, Connection connection) {
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
