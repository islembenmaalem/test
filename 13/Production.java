
public class Production extends Employe {
	private int nbu;
	public Production(String nom, String prenom, int age, String date,int nbu) {
		super(nom, prenom, age, date);
		this.nbu=nbu;
	}

	public String getTitre() {
		// TODO Auto-generated method stub
		return "producteur ";
	}

	@Override
	public float calulerSalaire() {
		// TODO Auto-generated method stub
		return nbu*5;
	}

}
