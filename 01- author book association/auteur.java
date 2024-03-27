public class auteur {
	private String nom;
	private livre tablivres[];
	private int nblivres;
	public String getNom() {
		return nom;
	}
	public void ajouterLlivre(livre l) {
		tablivres[nblivres]= l;
		this.nblivres++;
	}
	public void afficher () {
		System.out.println("le nom de l'auteur est : "+nom+" , les titres des livres ecrit par cet auteur sont :");
		for (int i=0;i<nblivres;i++) {
			System.out.print(tablivres[i].getTitre()+", ");
			//if (i!=(nblivres-1)) {
			//	System.out.println(", ");
		//	}
			System.out.println("");
	}
	}
	public auteur(String nom) {
		this.nom=nom;
		nblivres=0;
		tablivres=new livre [100];
	}

}
