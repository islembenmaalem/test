import java.util.ArrayList;
public class Personnel {
	ArrayList<Employe>T=new ArrayList<Employe>();
	void ajouterEmploye(Employe e) {
		T.add(e);}
	void afficherSalaire() {
	/*	for (int i=0;i<T.size();i++) {
			System.out.println(T.get(i).calulerSalaire());	
		}*/
	    for (Employe e:T) {
	    	System.out.println(e.calulerSalaire());}}
	float slaireMoyen() {
		float x=0;
		for(Employe e:T) {
			x+=e.calulerSalaire();}
		return x/T.size();}
	void afficherEmp() {
		for(Employe e:T) {
	    	System.out.println(e.getNom());}}}

