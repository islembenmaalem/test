package exemen_tp_java;

import java.util.ArrayList;
import java.util.Hashtable;

public class Ecole {
	Hashtable<String, ArrayList<Eleve>> HM;

	public Ecole() {
		HM = new Hashtable<String, ArrayList<Eleve>>();
	}

	public void AjouterNiveau(String ch) {
		HM.put(ch, new ArrayList<Eleve>());
	}

	public void Ajouter(String x, Eleve e) {
		for (String i : HM.keySet()) {
			if (HM.get(i).contains(e) == false) {
				HM.get(i).add(e);
				break;
			}
		}
	}

	public void Affiche() {
		for (String i : HM.keySet()) {
			for (Eleve e : HM.get(i)) {
				System.out.println(e);
			}
		}
	}
	public Eleve Premier(String x) {
		Eleve el = new Eleve();
		float max=0;
		for (Eleve e:HM.get(x)) {
			if (e.getMoyenne()>max){
				max=e.getMoyenne();
				el.setMoyenne(e.getMoyenne());;
				el.setNom(e.getNom());;
				el.setPrenom(e.getPrenom());;
				el.setNum(e.getNum());;
			}
		}
		return el;
	}

}
