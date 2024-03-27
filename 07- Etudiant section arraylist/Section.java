package exercice;

import java.util.ArrayList;

public class Section {
	private int numero;
	private ArrayList<Etudiant> liste_etudiants;

	public Section(int numero) {
		this.numero = numero;
		this.liste_etudiants = new ArrayList<Etudiant>();
	}

	public void ajouter(Etudiant e) {
		liste_etudiants.add(e);
	}

	public void supprimer(Etudiant e) {
		liste_etudiants.remove(e);
	}

	public double getMoySection() {
		int n = 0;
		double som = 0;
		for (Etudiant i : liste_etudiants) {
			som += i.getMoy();
			n++;
		}
		return (som / n);
	}

	public double getMoyMax() {
		int n = liste_etudiants.size();
		double max = liste_etudiants.get(0).getMoy();
		for (int i = 1; i < n; i++) {
			if (liste_etudiants.get(i).getMoy() > max) {
				max = liste_etudiants.get(i).getMoy();
			}
		}
		return max;
	}

	public String toString() {
		String ch = "";
		for (Etudiant i : liste_etudiants) {
			ch += i.getNom() + ", ";
		}
		ch = ch.substring(0, ch.length()-2);
		return "\n\t numero = " + numero + "\n\t liste_etudiants = " + ch + "\n\t la moyenne de la section = "
				+ getMoySection() + "\n\t la moyenne maximale = " + getMoyMax();
	}

}
