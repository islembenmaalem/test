package tp_jdbc;

import java.sql.Connection;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Connect Connexion = new Connect();
		Connection con = Connexion.getConnection();
		//Traitement t=new Traitement() ;
		//Produit p = new Produit(2,"un",13);
		//t.save(p);
		//ArrayList<Produit> p1=t.produitsParMC("un");
		//ArrayList<Produit> p=t.produitsParMC("un");
	//	System.out.println(p);
		Fenetre2 fen2=new Fenetre2();
		
	}

}
