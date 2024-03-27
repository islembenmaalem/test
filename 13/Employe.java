
public abstract class Employe { // pour heritage - class mere
	private String nom,prenom,date;
	private int age;
	public Employe(String nom, String prenom, int age, String date) {
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
		this.age = age;
	}
	public abstract String getTitre();
	public String getNom() {
		return getTitre()+nom+ " "+prenom;
	}
	public String getNom1() {
		return this.getClass().getName()+nom+" "+prenom;
	}
	public abstract float calulerSalaire(); // pour n'importe quel employe on doit calculer salaire
}
