package jdbc;



	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.Comparator;
	import java.util.List;

	import org.junit.jupiter.api.Order;
	import org.junit.jupiter.api.Test;


	public class DBConnectionTest {
		private Connection connection = null;
//
//		 @Test
//		@Order(1)
//		public void insertion() {
//			Statement statement = null;
//			try {
//				connection = DBConnection.getConnection();
//				statement = connection.createStatement();
//				String name = "Avakado";
//				String sql = "INSERT INTO product(name,price) values('" + name + "',200.2)";
//				int insertCount = statement.executeUpdate(sql);
//				System.out.println(insertCount);
//			} catch (SQLException e) {
//				e.printStackTrace();
//			} finally {
//				DBConnection.close(statement, connection);
//			}
//		}

		 @Test
		@Order(1)
		public void insertionUsingPrepareStatement() {
			PreparedStatement statement = null;
			try {
				connection = DBConnection.getConnection();

				String sql = "INSERT INTO product(name,price) values(?,?)";
				statement = connection.prepareStatement(sql);

				statement.setString(1, "Test");
				statement.setDouble(2, 554.4);

				int insertCount = statement.executeUpdate();
				System.out.println(insertCount);

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBConnection.close(statement, connection);
			}
		}

//		@Test
//		@Order(2)
//		public void update() {
//			PreparedStatement statement = null;
//			try {
//				connection = DBConnection.getConnection();
//
//				String sql = "UPDATE product SET name=? WHERE id=?";
//				statement = connection.prepareStatement(sql);
//
//				statement.setString(1, "Lime");
//				statement.setLong(2, 6);
//
//				int insertCount = statement.executeUpdate();
//				System.out.println(insertCount);
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			} finally {
//				DBConnection.close(statement, connection);
//			}
//		}
////
//		 @Test
//		@Order(3)
//		public void delete() {
//			PreparedStatement statement = null;
//			try {
//				connection = DBConnection.getConnection();
//
//				String sql = "DELETE FROM product WHERE id=?";
//				statement = connection.prepareStatement(sql);
//
//				statement.setLong(1, 5);
//
//				int insertCount = statement.executeUpdate();
//				System.out.println(insertCount);
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			} finally {
//				DBConnection.close(statement, connection);
//			}
//		}
//
//		@Test
//		@Order(1)
//		public void transactions() {
//			PreparedStatement statement = null;
//			try {
//				connection = DBConnection.getConnection();
//				connection.setAutoCommit(false);
//
//				for (int i = 0; i < 15; i++) {
//					String sql = "INSERT INTO product(name,price) values(?,?)";
//					statement = connection.prepareStatement(sql);
//
//					statement.setString(1, "Product-" + i);
//					statement.setDouble(2, 554.4 + i);
//
//					if (i == 10) {
//						throw new SQLException();
//					}
//					int insertCount = statement.executeUpdate();
//					System.out.println(i + "---" + insertCount);
//				}
//
//				connection.commit();
//
//			} catch (SQLException e) {
//				try {
//					if (connection != null) {
//						connection.rollback();
//					}
//				} catch (SQLException e1) {
//					e1.printStackTrace();
//				}
//				e.printStackTrace();
//			} finally {
//				DBConnection.close(statement, connection);
//			}
//		}
//
//		@Test
//		@Order(1)
//		public void batchProccessing() {
//			Statement statement = null;
//			for (int j = 0; j < 10; j++) {
//				try {
//					connection = DBConnection.getConnection();
//					connection.setAutoCommit(false);
//					statement = connection.createStatement();
//
//					for (int i = 0; i < 10; i++) {
//						String sql = "INSERT INTO product(name,price) values(" + i + ","
//								+ (10.0 * i) + ")";
//						statement.addBatch(sql);
//					}
//					int[] executeBatch = statement.executeBatch();
//					System.out.println(executeBatch);
//
//					connection.commit();
//
//				} catch (SQLException e) {
//					try {
//						if (connection != null) {
//							connection.rollback();
//						}
//					} catch (SQLException e1) {
//						e1.printStackTrace();
//					}
//					e.printStackTrace();
//				} finally {
//					DBConnection.close(statement, connection);
//				}
//
//			}
//		}

		@Test
		@Order(1)
		public void batchProccessing1() {
			PreparedStatement statement = null;
			for (int j = 0; j < 10; j++) {
				try {
					connection = DBConnection.getConnection();
					connection.setAutoCommit(false);
					String sql = "INSERT INTO product(name,price) values(?,?)";
					statement = connection.prepareStatement(sql);
					
					for (int i = 0; i < 10; i++) {
						statement.setString(1, "product-" + i);
						statement.setDouble(2, 20 * i);
						statement.addBatch();
					}
					int[] executeBatch = statement.executeBatch();
					System.out.println(executeBatch);

					connection.commit();

				} catch (SQLException e) {
					try {
						if (connection != null) {
							connection.rollback();
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					e.printStackTrace();
				} finally {
					DBConnection.close(statement, connection);
				}

			}
		}

//		@Test
//		@Order(4)
//		public void fetch() {
//			Statement statement = null;
//			try {
//				connection = DBConnection.getConnection();
//				statement = connection.createStatement(ResultSet.FETCH_FORWARD,
//						ResultSet.CONCUR_UPDATABLE);
//				ResultSet resultSet = statement.executeQuery("SELECT * FROM product");
//
//				List<Product> products = new ArrayList<>();
//
//				while (resultSet.next()) {
//					long id = resultSet.getLong("id");
//					String name = resultSet.getString("name");
//					Double price = resultSet.getDouble("price");
//
//					if (id == 7) {
//						resultSet.deleteRow();
//					}
//
//					if (id == 3) {
//						resultSet.updateString("name", "Grape");
//						resultSet.updateRow();
//					}
//
//					products.add(new Product(id, name, price));
//
//				}
//				products.stream().sorted(Comparator.comparing(Product::getId).reversed())
//						.forEach(e -> System.out.println(e));
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			} finally {
//				DBConnection.close(statement, connection);
//			}
//		}

	}



