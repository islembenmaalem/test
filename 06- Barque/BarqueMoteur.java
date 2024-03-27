package tp3;

public class BarqueMoteur extends Barque {
	private int puissance;

	public BarqueMoteur(String nom, String num, int puiss) {
		super(nom, num);
		puissance = puiss;
	}

	public int getPuissance() {
		return puissance;
	}

	public String toString() {
		return super.toString() + "puissance = " + puissance;
	}

}
