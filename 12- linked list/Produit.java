public class Produit {
	private String libelle;
	private String designation;
	private int NumProd;
	private float PrixProd;
	public Produit(String libelle, String designation, int numProd, float prixProd) {
		this.libelle = libelle;
		this.designation = designation;
		NumProd = numProd;
		PrixProd = prixProd;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getNumProd() {
		return NumProd;
	}
	public void setNumProd(int numProd) {
		NumProd = numProd;
	}
	public float getPrixProd() {
		return PrixProd;
	}
	public void setPrixProd(float prixProd) {
		PrixProd = prixProd;
	}
	public String toString() {
		return  libelle + ", designation = " + designation + ", NumProd = " + NumProd + ", PrixProd = "
				+ PrixProd ;
	}
}
