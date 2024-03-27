package ex1;

public class Compte {
	static int x = 0;
	private String numero; // Encapsulation
	private float solde;

	public Compte() {
		x++;
		numero = String.valueOf(x);
		solde = 0;
	}

	void Crediter(float x) {
		solde += x;

	}

	void Debiter(float x) {
		if (solde >= x)
			solde -= x;
		else
			System.out.print("erreur");
	}

	public void setSolde(float x) {
		solde = x;
	}

	public float getSolde() {
		return solde;
	}

	public void affiche() {
		System.out.println("le numero = " + numero + " le solde = " + solde);
	}

	boolean verif(String num) {
		return (numero.equals(num));
	}

}
