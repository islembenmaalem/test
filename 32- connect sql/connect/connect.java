package connect;

import java.sql.*;
import java.sql.Connection;

class connect {

	public static void main(String args[]) {
	    String login="system";
	    String passwd="manager";
	    Connection cn=null;
	    Statement st=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", login, passwd);

			Statement stmt = con.createStatement();

			ResultSet res = stmt.executeQuery("select * from produit");
			while (res.next())
				System.out.println(res.getInt(1) + "  " + res.getString(2) + "  " + res.getString(3));

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}