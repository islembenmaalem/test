package ecole;

public class eleve {
	private int num;
	private String prenom;
	private float moyenne;

	public eleve(int num, String prenom,float moyenne) {
		this.num = num;
		this.prenom = prenom;
		this.moyenne= moyenne;
	}

	public int getNum() {
		return num;
	}

	public void setId(int id) {
		this.num = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public float getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(float moyenne) {
		this.moyenne = moyenne;
	}

	public void setNum(int num) {
		this.num = num;
	}

	

}
