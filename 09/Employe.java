
public class Employe {
	public static int dernier = 1001;
	private String nom;
	protected float salaire;
    private int matricule;
	public Employe(String nom) {
		this.nom = nom;
		matricule=dernier++;
	}

	public String toString() {
		return "matricule = " + matricule + "\nnom = "+nom;
	}

}
