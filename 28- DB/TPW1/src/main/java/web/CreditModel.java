package web;

public class CreditModel {
	private double montant;
	private double cap;
	private int duree;
	private double taux;
	public CreditModel(double montant, double cap, int duree, double taux) {
		super();
		this.montant = montant;
		this.cap = cap;
		this.duree = duree;
		this.taux = taux;
	}
	public CreditModel(double cap, int duree, double taux) {
		super();
		this.cap = cap;
		this.duree = duree;
		this.taux = taux;
	}
	public CreditModel() {
		super();
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public double getCap() {
		return cap;
	}
	public void setCap(double cap) {
		this.cap = cap;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	@Override
	public String toString() {
		return "CreditModel [montant=" + montant + ", cap=" + cap + ", duree=" + duree + ", taux=" + taux + "]";
	}
	
}
