
public class Contractuel extends Employe {
	protected float salaireBase;

	public Contractuel(String nom, float salaireBase) {
		super(nom);
		this.salaireBase = salaireBase;

	}

	public void setSalaireBase(float salaireBase) {
		
		this.salaireBase = salaireBase;
	}

	public void calculerSalaire() {
		salaire=salaireBase;
	}

	public String toString() {
		calculerSalaire();
		return super.toString() + "\nsalaire = " + salaire ;
	}
}
