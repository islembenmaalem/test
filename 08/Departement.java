package ex3;

public class Departement {
	private String nom;
	private Personne[] T;
	public Departement(String nom, Personne[] t2) {
		this.T=t2;
		this.nom=nom;
	}
	public String getNom() {
		return nom;
	}
	public Personne[] getTabPersonnes() {
		return T;
	}
	
	
	
	

}
