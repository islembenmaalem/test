package td4;

class Voiture extends Vehicule implements Motorise {
	public double calculer() {
		return  prop*2;
	}
	//private String marque;
	public Voiture(String marque) {
		this.marque=marque;
	}

	public void SeDeplacer() {  
		System.out.println("je roule");
	}

	public String toString() {
		return super.toString()+" de type voiture de marque"+ marque;
	}

	
	

}
