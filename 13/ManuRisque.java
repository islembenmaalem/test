
public class ManuRisque extends Manutention implements aRisque {

	public ManuRisque(String nom, String prenom, int age, String date, float nbh) {
		super(nom, prenom, age, date, nbh);
		// TODO Auto-generated constructor stub
	}

	public float calulerSalaire() {
		return super.calulerSalaire()+prime;
	}

}
