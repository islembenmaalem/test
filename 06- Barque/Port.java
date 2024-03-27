package tp3;

public class Port {
	private String nom;
	private int capacite_barque;
	private Barque barques[];
	private float taxe;
	private int nb = 0;

	public Port(String nom, int capacite_barque, float taxe) {
		this.nom = nom;
		this.capacite_barque = capacite_barque;
		this.barques = new Barque[capacite_barque];
		this.taxe = taxe;
	}

	public void ajouter_barque(Barque b) {
		if (nb >= capacite_barque)
			System.out.println("port sature");
		else {
			barques[nb++] = b;
		}
	}

	public void sorti_barque(Barque b) {
		int i;
		for (i = 0; i < nb; i++)
			if (barques[i].getNum().equals(b.getNum())) {
				for (int j = i; j < nb - 1; j++)
					barques[j] = barques[j + 1];
				barques[nb - 1] = null;
				nb--;
				break;
			}
	}

	public float cal_mont() {
		for (int i = 0; i < barques.length; i++) {
			if (barques[i] instanceof BarqueMoteur) {
				if (((BarqueMoteur) barques[i]).getPuissance() < 5)
					taxe *= 1.1f;
				else
					taxe *= 1.2f;
			}
		}
		return taxe;
	}

	public String toString() {
		String s = "";
		String ch = "nom=" + nom + "capacite_barque=" + capacite_barque + ",taxe=" + cal_mont() + "\nbarques=";
		for (int i = 0; i < nb; i++) {
			s += barques[i].toString();
		}
		return ch + s;
	}
}

//polymophisme 
//le contraire declari barque moteur b3 ; b3=new barque jai pas le droit 
//intansi niveua suivant ... superier la
