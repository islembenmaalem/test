
public class Formation {
	private String nom;
	private Enseignant  ens ;
	public void setNom(String x) {
		nom=x;
	}
	public String getNom() {
		return nom;
	}
	public void setEns(Enseignant  x) {
		ens=x;
	}
	public Enseignant  getEns() {
		return ens;
	}
	public Formation (String a , Enseignant  b) {
		nom = a ; ens = b;
	}
	
	public void afficher() {
	    System.out.println("Nom de la formation: " + nom);
	    if (ens != null) {
	        ens.afficher();
	    } else {
	        System.out.println("Aucun enseignant associé à cette formation.");
	    }
	}

}
