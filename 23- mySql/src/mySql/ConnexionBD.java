package mySql;

import java.sql.*;

public class ConnexionBD {
	private Connection con;

	public ConnexionBD() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/stock", "root", "root");
		} catch (Exception e) {
			System.out.println("erreur" + e.getMessage());
		}
	}
	public Connection getConnexion() {
		return con;
	}

}
