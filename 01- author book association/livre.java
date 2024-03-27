
public class livre {
	private String titre;
	private auteur[] tabAuteurs;
	public String getTitre() {
		return titre;
	}
	public auteur getPremierAuteur() {
		return tabAuteurs[0];
	}
	public auteur[] getAuteurs() {
			return tabAuteurs;
	}
	public livre(String titre, auteur[] tabAuteurs) {
		this.titre = titre;
		this.tabAuteurs = tabAuteurs;
		for (int i=0;i< tabAuteurs.length;i++) {
			tabAuteurs[i].ajouterLlivre(this);
		}
	}
	
}
