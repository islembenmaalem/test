package ex1;

public class Test {
	public static void main(String[] args) {
		Compte c1 = new Compte();
		Compte c2 = new Compte();
		c1.Crediter(400);
		c1.Debiter(10);
		c1.affiche();
		c2.Crediter(400);
		c2.Debiter(20);
		c2.affiche();

	}

}
