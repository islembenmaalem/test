package ex3;

public class Enseignant extends Personne { 
	private String grade;
	public Enseignant(String nom, String prenom, String grade) {
		super(nom, prenom);
		this.grade = grade;
	}
	public String getGrade() {
		return grade;
	}
	
	

}
