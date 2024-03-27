package mySql;

import java.sql.*;
import java.sql.PreparedStatement;

public class Test {

	public static void main(String[] args) {
		ConnexionBD conBD = new ConnexionBD();
		Connection con = conBD.getConnexion();
		GererProduit pdt = null;
		String req = "INSERT INTO `produit`(`reference`, `nom`, `description`, `prix`) VALUES (2,'pc','msi',100)";
		String r = "INSERT INTO `produit`(`reference`, `nom`, `description`, `prix`) VALUES (3,'pc','hp',300)";
		String rq = "INSERT INTO `produit`(`reference`, `nom`, `description`, `prix`) VALUES (4,'nokia','portable',200)";
		pdt.insererPdt(con, req);
		pdt.insererPdt(con, r);
		pdt.insererPdt(con, rq);
		System.out.println("avant supression : ");
		String req1 = "select * from produit where `nom`='pc'";
		pdt.rechercherPdt(con, req1);
		String req2 = "DELETE FROM `produit` WHERE `reference` = 2";
		pdt.suppPdt(con, req2);
		System.out.print("apres supression : ");
		String req3 = "select * from produit where `nom`='pc'";
		pdt.rechercherPdt(con, req3);
	}

}
