import java.util.TreeMap;
import java.util.Set;
public class Commandes {
	private TreeMap<String, Commande> Cmde;
	public Commandes() {
		Cmde = new TreeMap<String, Commande>();
	}
	public void ajouterCommande(String code, Commande C) {
		Cmde.put(code, C);
	}
	public void retirerCommande(String code) {
		/*
		 * Set<String> ks = Cmde.keySet(); for (String c : ks) { if (c.equals(code))
		 * Cmde.remove(code); }
		 */
		Cmde.remove(code);
	}
	public void AjouterProduit(String code, Produit P) {
		Cmde.get(code).ajouterProduit(P);
	}
	public void RetirerProduit(String code, Produit P) {
		Cmde.get(code).retirerProduit(P.getNumProd());
	}
	public float CalculRecette() {
	float x=0;
	Set<String>ks=Cmde.keySet();
	for(String y:ks){
		x+=(Cmde.get(y).getPrixT());
	}	
	return x;
	}
	public void Affiche() {
		System.out.println( " Cmde = " + Cmde);
	}
}