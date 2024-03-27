package TP2_arch_ex2;

public class Compte {
	 private double solde = 100;

	public Compte(double m) {
		solde=m;
	}

	public synchronized void retirer(double montant) {
		if (solde<montant){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		    solde -= montant;
	}

	public synchronized void deposer (double montant ) {
		solde+=montant;
		notify();
	}
	public void consulter() {
		System.out.println("solde = "+ solde);
	}

}
