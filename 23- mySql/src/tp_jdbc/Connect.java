package tp_jdbc;

import java.sql.*;

public class Connect {
	private static Connection con;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver ok");
			con = DriverManager.getConnection("jdbc:mysql://localhost/catalogue", "root", "root");
			System.out.println("connected");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static Connection getConnection() {
		return con;
	}
}
