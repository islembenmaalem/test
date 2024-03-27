package ex4_tp_1_iot;


public class JobSylvieEtBruno implements Runnable {
	private Compte compte;
	private String nom;
	private int montant;

	public JobSylvieEtBruno(Compte compte, int montant, String nom) {
		this.compte = compte;
		this.nom = nom;
		this.montant = montant;
	}

	public synchronized void effectuerRetrait(int montant) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// compte.retirer(montant);
		if (compte.getSolde() > montant) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			compte.retirer(montant);
			System.out.println(nom + " : " + compte.getSolde());

		} else {
			System.out.println("solde insufaisant");
		}

	}

	public void run() {

		for (int i = 0; i < 10; i++) {

			effectuerRetrait(montant);
			// System.out.println(nom + " : " + compte.getSolde());

		}

	}

}
