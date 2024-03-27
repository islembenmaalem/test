
public class Permanent extends Contractuel {
	private float prime;

	public Permanent(String nom, float salaireBase, float prime) {
		super(nom, salaireBase);
		this.prime = prime;

	}

	public void setPrime(float prime) {
		
		this.prime = prime;
	}

	public void calculerSalaire() {
		salaire = salaireBase + prime;
	}
//	public String toString() {
		
	//	return "Permanent p :\n\t" + super.toString() + "\n";
//	}

}
