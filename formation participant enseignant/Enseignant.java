
public class Enseignant  { 
	private String nom;
	private String specialite;

	public Enseignant (String a, String b) {
		nom = a;
		specialite = b;
	}

	public String getNom() {
		return nom;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void afficher() {
		System.out.println("Enseignat: " + nom);
		System.out.println("specialite: " + specialite);
	}

}
