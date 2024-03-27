package td4;

public class Velo extends Vehicule {
	//private String marque;
	public Velo(String marque) {
		
		this.marque=marque;
	}
	public void SeDeplacer() {
		System.out.println("je pedale");
	}
	
	public String toString() {
		return super.toString()+" de type velo de marque "+marque;
	}


}
