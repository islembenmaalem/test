import java.util.LinkedList;
public class Commande {
	private LinkedList<Produit> liste;
	private float PrixTotal;
	public Commande() {
		PrixTotal = 0;
		liste = new LinkedList<Produit>();
	}
	public void ajouterProduit(Produit p) {
		liste.add(p);
		PrixTotal += p.getPrixProd();
	}
	public void retirerProduit(int n) {
		for (Produit p : liste) {
			if (p.getNumProd() == n) {
				liste.remove(n);
				PrixTotal -= p.getPrixProd();
			}
		}
	}
	public int nombreProduit() {
		return liste.size();
	}
	public String toString() {
		return "prixT = " + PrixTotal + ", liste = " + liste.toString();
	}
	public boolean estPresent(Produit P) {
		return liste.contains(P);
	}
	public float getPrixT() {
		return PrixTotal;
	}
}
