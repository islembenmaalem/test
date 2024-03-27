package ex1;

public class Client {
	private String nom;
	private String prenom;
	private int nbComp;
	// private Compte[] tabComp;
	Compte[] tabComp;
	public static int nb = 0;

	public Client(String nom, String p) {
		this.nom = nom;
		prenom = p;
		tabComp = new Compte[10];
	}

	public void Ouvrir_Compte() {
		if (nb >= 10)
			System.out.println("nbr max atteint");
		else {
			Compte c = new Compte();
			tabComp[nb++] = c;
		}
	}

	public void Fermer_Compte(String num) {
		int i;
		for (i = 0; i < nb; i++)
			if (tabComp[i].verif(num)) {
				for (int j = i; j < nb - 1; j++)
					tabComp[j] = tabComp[j + 1];
				tabComp[nb - 1] = null;
				nb--;
			}
	}

	public void Deposer(float val, String num) {
		int i;
		for (i = 0; i < nb; i++)
			if (tabComp[i].verif(num))
				tabComp[i].Crediter(val);
	}

	public void Retirer(String num, float x) {
		int i;
		for (i = 0; i < nb; i++)
			if (tabComp[i].verif(num))
				tabComp[i].Debiter(x);
	}

	public void Affiche() {
		float som = 0;
		System.out.println("Client : " + "Nom : " + nom + " Prenom : " + prenom + " nbComp : " + nbComp);
		for (int i = 0; i < nb; i++) {
			som += tabComp[i].getSolde();
			tabComp[i].affiche();
		}
		System.out.println("le total : " + som);
	}

	public boolean Verif(String num) {
		for (int i = 0; i < nb; i++) {
			if (tabComp[i].verif(num))
				return true;
		}
		return false;
	}
}
