package exemen_tp_java;

public class Eleve {
	private int num;
	private String nom;
	private String prenom;
	private float moyenne;
	public Eleve(int num, String nom, String prenom, float moyenne) {
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.moyenne = moyenne;
	}
	public Eleve() {
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public float getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(float moyenne) {
		this.moyenne = moyenne;
	}

	public String toString() {
		return "Eleve [num=" + num + ", nom=" + nom + ", prenom=" + prenom + ", moyenne=" + moyenne + "]";
	}

}
