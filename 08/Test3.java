package ex3;

public class Test3 {
	 public static void main(String[] args) {
	 Personne T[] = new Personne[2];
	 T[0] = new Enseignant("BEN MOHAMED", "Ali", "Maître Assistant");
	 T[1] = new Etudiant("BEN FLEN", "Foulen", 12341234);
	 Departement dep = new Departement("IDSD", T);
	 System.out.println("Departement : " + dep.getNom());
	 System.out.println("Liste des personnes :");
	 for (int i = 0; i < dep.getTabPersonnes().length; i++) {
	 System.out.print("\t" + dep.getTabPersonnes()[i].getNom() + ",\t"+ dep.getTabPersonnes()[i].getPrenom());
	if (dep.getTabPersonnes()[i] instanceof Etudiant)
	 System.out.println(",\t"+ ((Etudiant)dep.getTabPersonnes()[i]).getMatricule());
	else
	 System.out.println(",\t"+ ((Enseignant) dep.getTabPersonnes()[i]).getGrade());
	 }
	 }
	}
