package ex3;

public class Etudiant extends Personne {
	private int matricule;
	public Etudiant(String nom, String prenom, int matricule) {
		super(nom, prenom);
		this.matricule = matricule;
	}
	public int getMatricule() {
		return matricule;
	}
	
	

}
