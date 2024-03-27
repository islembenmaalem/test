public class ExecuteAbonnement {
	public static void main(String arg[]) {
		Produit p1=new Produit("p1","d1",1,12);
		Produit p2=new Produit("p2","d2",2,10);
		Produit p3=new Produit("p3","d3",3,23);
		Produit p4=new Produit("p4","d4",4,15);
		Commande c1=new Commande();
		Commande c2=new Commande();
		c1.ajouterProduit(p4);
		c1.ajouterProduit(p3);
		c2.ajouterProduit(p2);
		c2.ajouterProduit(p1);
		System.out.println("---------c2 avant suppression---------\n"+c2);
		System.out.println(c2);
		/*c2.retirerProduit(1);
		System.out.println("---------c2 apres suppression---------\n"+c2+"\n");*/
		Commandes cm=new Commandes();
		cm.ajouterCommande("c2", c2);
		cm.ajouterCommande("c1", c1);
		System.out.println("la recette = "+cm.CalculRecette());
		cm.Affiche();
	}
}
