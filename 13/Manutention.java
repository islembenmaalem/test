
public class Manutention extends Employe {
	private float nbh;
	private static final float val_h=65;
	public Manutention(String nom, String prenom, int age, String date,float nbh) {
		super(nom, prenom, age, date);
		this.nbh=nbh;
	}

	public String getTitre() {
		// TODO Auto-generated method stub
		return "Manutention ";
	}

	@Override
	public float calulerSalaire() {
		// TODO Auto-generated method stub
		return val_h*nbh;
	}
}
