package ex4_tp_1_iot;

public class Compte {
	private int solde;

	public Compte() {
		this.solde = 100;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	public int retirer(int montant) {
		setSolde(solde - montant);
		return solde;
	}

}

