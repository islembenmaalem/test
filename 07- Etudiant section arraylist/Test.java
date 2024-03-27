package exercice;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Etudiant e1 = new Etudiant("SLIM", "M", 100);
		Etudiant e2 = new Etudiant("Ali", "AA", 200);
		Etudiant e3 = new Etudiant("Sami", "SS", 350);
		ArrayList<Double> l1 = new ArrayList<Double>();
		ArrayList<Double> l2 = new ArrayList<Double>();
		ArrayList<Double> l3 = new ArrayList<Double>();
		l1.add(15.0);
		l1.add(16.0);
		l1.add(17.0);
		l2.add(8.5);
		l2.add(9.5);
		l3.add(11.0);
		l3.add(14.5);
		l3.add(15.0);
		e1.setListe_notes(l1);
		e2.setListe_notes(l2);
		e3.setListe_notes(l3);
		System.out.println("Etudiant 1 :" + e1.toString() + "\n\t resultat : " + e1.Resultat());
		System.out.println("Etudiant 2 :" + e2.toString() + "\n\t resultat : " + e2.Resultat());
		System.out.println("Etudiant 3 :" + e3.toString() + "\n\t resultat : " + e3.Resultat());
		ArrayList<Etudiant> l = new ArrayList<Etudiant>();
		l.add(e1);
		l.add(e3);
		l.add(e2);
		Section s = new Section(1);
		s.ajouter(e3);
		s.ajouter(e2);
		s.ajouter(e1);
		s.supprimer(e2);
		System.out.println("section 1 :" + s.toString());

	}

}
