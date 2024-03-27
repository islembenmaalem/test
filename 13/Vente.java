
public class Vente extends Commercial{
    private final static float pourcentage=0.2F;
    //final = ne change pas
    private final static float bonus=400;
	public Vente(String nom, String prenom, int age, String date, float ca) {
		super(nom, prenom, age, date, ca);   //ca=chiffre d'affaire
	}

	public String getTitre() {
		return "Vendeur " ;
	}
	public float calulerSalaire() {
		return getCa()*pourcentage+bonus;
	}
	

}
