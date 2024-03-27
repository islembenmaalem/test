import java.util.Map;
import java.util.Map.Entry;

public class Pays {
	private String nom_pays;
	private Map<Integer, Ville> villes_pays;

	public Pays(String nom_pays, Map<Integer, Ville> villes_pays) {
		this.nom_pays = nom_pays;
		this.villes_pays = villes_pays;
	}

	public String getNom_pays() {
		return nom_pays;
	}

	public void setNom_pays(String nom_pays) {
		this.nom_pays = nom_pays;
	}

	public Map<Integer, Ville> getVilles_pays() {
		return villes_pays;
	}

	public void setVilles_pays(Map<Integer, Ville> villes_pays) {
		this.villes_pays = villes_pays;
	}

	public String toString() {
		return "le pays " + nom_pays + " a des villes: " + villes_pays.values();
	}

	public void ajouter_ville(Ville v) {
		int i = villes_pays.size();
		i++;
		this.villes_pays.put(i, v);
	}

	public void supprimer_ville(Ville v) {
		villes_pays.values().remove(v);
	}

	public int nbre_habitants_par_pays() {
		int n = 0;
		for (Map.Entry<Integer, Ville> entry : villes_pays.entrySet())
			n += entry.getValue().nbre_habitants_par_ville();
		return n;
	}

	public boolean recherche_ville(Ville v) {
		boolean test = false;
		for (Map.Entry<Integer, Ville> entry : villes_pays.entrySet()) {
			if (entry.getValue().getNom_ville().equals(v.getNom_ville()))
				test = true;
		}
		return test;
	}

	public void recherche_Max_ville() {
		int max = 0;
		String ch = "";
		for (Map.Entry<Integer, Ville> entry : villes_pays.entrySet()) {
			if (entry.getValue().nbre_habitants_par_ville() > max) {
				max = entry.getValue().nbre_habitants_par_ville();
				ch = entry.getValue().getNom_ville();
			}
		}
		System.out.println("pour " + nom_pays + " la ville ayant nombre maximale est " + ch + " le max est: " + max);
	}

}
