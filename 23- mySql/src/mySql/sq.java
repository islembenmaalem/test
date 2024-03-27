package mySql;

import java.sql.*;
public class sq {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydatabase","root","root");
			//Connection con = DriverManager.getConnection(
		//			 "jdbc:mysql://192.100.0.000:3306/mydatabase", "root", "root");
			Statement st=con.createStatement();
	        System.out.println("Connected?");
			ResultSet res=st.executeQuery("select * from etudiant");
			while (res.next()) {
				System.out.println("Nom : "+res.getString(2));
			}
		}catch(Exception e) {
			System.out.println("erreur"+e.getMessage());
		}
	}

}