package Exercice3_arch;

public class Consommateur extends Thread {
	private String m;

	public Consommateur(String m) {
		this.m = m;
	}

	public void run() {
		while (true) {
			try {
				String message = m;
				System.out.println("Consommateur a consommé le message : " + message);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// BlockingQueue<String> queue = new LinkedBlockingQueue<>(5); // file d'attente
		// de taille maximale 5
		String s = "bonjour";
		String s1 = "hi";
		String[] tab = { s, s1 };

		Producteur producteur = new Producteur(tab, 2);
		Consommateur consommateur = new Consommateur(s);

		producteur.start();
		consommateur.start();
	}
}
