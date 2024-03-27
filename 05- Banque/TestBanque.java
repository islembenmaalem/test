package ex1;

public class TestBanque {
	public static void main(String[] arg) {
		Client c1 = new Client("n1", "p1");
		Compte a = new Compte();
		c1.Ouvrir_Compte();
		c1.Ouvrir_Compte();
		c1.Ouvrir_Compte();
		c1.Fermer_Compte("1");
		c1.Deposer(200, "2");
		c1.Retirer("2", 10);
		c1.Deposer(300, "3");
		c1.Retirer("3", 30);
		c1.Deposer(400, "4");
		c1.Retirer("4", 40);
		c1.Affiche();

	}
}

