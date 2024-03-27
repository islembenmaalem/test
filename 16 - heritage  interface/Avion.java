package td4;

class Avion extends Vehicule implements Motorise {
	public double calculer() {
		return  prop*15;
	}
	//private String marque;
	public Avion(String marque) {
		this.marque=marque;
	}
	public void SeDeplacer() {
		System.out.println("je vole");
	}
	public String toString() {
		return super.toString()+" de type avion de marque "+marque;
	}

}
