package ex4_tp_1_v2;

public class JobSylvieEtBruno implements Runnable {
	private Compte c;
	private String nom;

	public JobSylvieEtBruno(String nom) {
		this.nom = nom;
		c = new Compte();
	}

	public JobSylvieEtBruno(String nom, int solde) {
		this.nom = nom;
		c = new Compte();
	}

	public void effectuerRetrait(int montant) throws InterruptedException {
		if (c.getSolde() >= montant) {
			Thread.sleep(500);
			if (c.getSolde() > 10) {
				c.retirer(montant);
				System.out.println(nom + " : " + c.getSolde());
			} else
				System.out.println("solde insuffisant");
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				effectuerRetrait(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		JobSylvieEtBruno sylvie = new JobSylvieEtBruno("Sylvie");
		JobSylvieEtBruno bruno = new JobSylvieEtBruno("Bruno");
		Thread TS = new Thread(sylvie);
		Thread TB = new Thread(bruno);
		TS.start();
		TB.start();
		System.out.println("fin");

	}
}