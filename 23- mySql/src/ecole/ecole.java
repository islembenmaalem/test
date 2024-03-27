package ecole;

import java.util.ArrayList;
import java.util.HashMap;

public class ecole {
	private HashMap<Integer, ArrayList<eleve>> liste;

	public ecole() {
		this.liste = new HashMap<Integer, ArrayList<eleve>>();
	}

	public void ajouter(int niveau, eleve e) {
		liste.get(niveau).add(e);
	}

	public void supprimer(int x, eleve e) {
		liste.get(x).remove(e);
	}

	/*
	 * public double moy() { double m = 0; int n = 0; for (int i : liste.keySet()) {
	 * m += liste.get(i).getMoyenne(); n++; } return m / n;
	 * 
	 * }
	 */

	@Override
	public String toString() {
		String ch = "";
		for (int i : liste.keySet()) {
			ch += " niveau : " + i;
			// ch+=" ,prenom : "+liste.get(i).getPrenom();
			// ch+=" , moyenne : "+liste.get(i).getMoyenne();
			// ch+=" , num : "+liste.get(i).getNum();

		}
		return "ecole [liste=" + ch;// + "\n, moy()=" //+ moy() + "]";
	}

}
