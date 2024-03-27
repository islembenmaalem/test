
public class Employe {
	private int matricule;
	private String nom;
	private float salaire ;
	private Service service;
	public static int dernierMat=1000;
	public Employe(String nom,float salaire) {
		dernierMat++;
		this.salaire=salaire;
		this.nom=nom;
		this.matricule=dernierMat;
	}
	public int getMat() {
		return matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setService(Service s) {
		this.service = s;
	}
	public void augmenterSalaire(double d) {
		this.salaire*=d;
	}
	public void afficher() {
		System.out.println("\tla matricule: "+this.getMat());
		System.out.println("\tnom: "+this.getNom());
		System.out.println("\tnom de sevice est: "+service.getNom());
		System.out.println("\tsalaire est: "+salaire);
		//\n\t
	}
	
}
