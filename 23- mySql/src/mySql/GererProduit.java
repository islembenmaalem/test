package mySql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GererProduit {
	public static void insererPdt(Connection con, String req) {
		try {
			PreparedStatement st = con.prepareStatement(req);
			st.execute();
			/* Statement s=con.createStatement() */
			System.out.println("produit ajouté");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void suppPdt(Connection con, String req) {
		try {
			PreparedStatement st = con.prepareStatement(req);
			st.execute();
			/* Statement s=con.createStatement() */
			System.out.println("produit supprimé");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void rechercherPdt(Connection con, String req) {
		Statement st;
		try {
			st = con.createStatement();
			ResultSet res = st.executeQuery(req);
			while (res.next()) {
				System.out.println("reference : " + res.getString(1)+" Nom : " + res.getString(2)+" description : " + res.getString(3)
				+" prix : " + res.getString(4));			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void afficher_allPdt(Connection con) {
		Statement st;
		try {
			st = con.createStatement();
			String req = "select * from produit";
			ResultSet res = st.executeQuery(req);
			while (res.next()) {
				System.out.println("reference : " + res.getString(1)+" Nom : " + res.getString(2)+" description : " + res.getString(3)
				+" prix : " + res.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
