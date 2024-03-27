package exercice;
import java.util.ArrayList;
public class Etudiant {
	private String nom, prenom;
	private int cin;
	private ArrayList<Double> liste_notes;
	public Etudiant(String nom, String prenom, int cin) {
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		liste_notes= new ArrayList<Double>();
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
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public ArrayList getliste_notes() {
		return liste_notes;
	}
	public void setListe_notes(ArrayList l) {
		this.liste_notes = l;
	}
	public double getMoy() {
		float som = 0;
	    for(int i = 0; i < liste_notes.size(); i++)
	        som += liste_notes.get(i);
		return  som/liste_notes.size();
	}
	public String toString() {
		return  "\n\t nom = " + nom + "\n\t prenom = " + prenom + "\n\t cin=" + cin + "\n\t liste des notes="
				+ liste_notes + "\n\t son moyenne est = " + getMoy();
	}
	public String Resultat() {
		String mention;
		if (getMoy() < 10)
			mention = "Refusé";
		else {
			if (getMoy() > 15)
				mention = "Admis avec mention trés bien";
			else
				mention = "Admis avec mention bien";
		}
		return mention;
	}
}
