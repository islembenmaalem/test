import java.util.Map;
import java.util.Iterator;

public class Ville {
	private Map<Integer, Delegation> delegations_ville;
	private String nom_ville;

	public Ville(Map<Integer, Delegation> delegations_ville, String nom) {
		this.delegations_ville = delegations_ville;
		this.nom_ville = nom;
	}

	public String toString() {
		return "\n\t\t" + nom_ville + " de delegations " + delegations_ville.values();
	}

	public Map<Integer, Delegation> getDelegations_ville() {
		return delegations_ville;
	}

	public void setDelegations_ville(Map<Integer, Delegation> delegations_ville) {
		this.delegations_ville = delegations_ville;
	}

	public String getNom_ville() {
		return nom_ville;
	}

	public void setNom_ville(String nom) {
		this.nom_ville = nom;
	}

	public void ajouter_délégation(Delegation d) {
		int i = delegations_ville.size();
		i++;
		this.delegations_ville.put(i, d);
	}

	public void supprimer_delegation(Delegation d) {
		delegations_ville.values().remove(d);
	}

	public void modifier_nombre_habitant_délégation(Delegation d, int n) {
		/*
		 * if (delegations_ville.values().contains(d)){ Delegation d1=d; d.setNombre(n);
		 * delegations_ville.replace(2,d1,d);
		 */
		for (Map.Entry<Integer, Delegation> entry : delegations_ville.entrySet()) {
			if (entry.getValue().getNom().equals(d.getNom()))
				entry.getValue().setNombre(n);
		}
	}

	public int nbre_habitants_par_ville() {
		int n = 0;
		for (Map.Entry<Integer, Delegation> entry : delegations_ville.entrySet()) {
			n += entry.getValue().getNombre();
		}
		return n;
	}

	public boolean recherche_delegation(Delegation d) {
		boolean test=false;
		for (Map.Entry<Integer, Delegation> entry : delegations_ville.entrySet()) {
			if (entry.getValue().getNom().equals(d.getNom())) {
				test=true;
			}
		}
		return test;
	}

	public void recherche_Max_delegation() {
		int max = 0;
		String ch = "";
		for (Map.Entry<Integer, Delegation> entry : delegations_ville.entrySet()) {
			if (entry.getValue().getNombre() > max) {
				max = entry.getValue().getNombre();
				ch = entry.getValue().getNom();
			}
		}
		System.out.println("pour "+ nom_ville+" le delegation ayant nombre maximale est " + ch + " le max est: " + max);
	}

}
