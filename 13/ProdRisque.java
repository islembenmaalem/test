
public class ProdRisque extends Production implements aRisque {

	public ProdRisque(String nom, String prenom, int age, String date, int nbu) {
		super(nom, prenom, age, date, nbu);
		// TODO Auto-generated constructor stub
	}

	public float calulerSalaire() {
		return super.calulerSalaire()+prime;
	}

}
