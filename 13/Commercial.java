
public abstract class Commercial extends Employe { //on doit redefinir les methodes abstract
	private float ca;                              //mais  on ne connait encore le type de employe

	public Commercial(String nom, String prenom, int age, String date,float ca) {
		super(nom, prenom, age, date);
		this.ca=ca;
	}

	public float getCa() {
		return ca;
	}
	
}
