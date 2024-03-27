package ex4_tp_1_v2;

import java.util.concurrent.Semaphore;

public class Compte {
	private int solde = 100;
	static Semaphore semaphore;// =new Semaphore(1,true);
	public Compte() {
		semaphore = new Semaphore(1);
	}

	public void retirer(int montant) {
		solde -= montant;
	}
	public int getSolde() {
		return solde;
	}
	public int setSolde(int solde) {
		return this.solde = solde;
	}

}
