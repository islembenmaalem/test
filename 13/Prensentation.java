
public class Prensentation extends Commercial{
	
    private final static float pourcentage=0.2F;
    private final static float bonus=800;
	
	public Prensentation(String nom, String prenom, int age, String date, float ca) {
		super(nom, prenom, age, date, ca);
	}

	public String getTitre() {
		return "Represantant ";
	}

	public float calulerSalaire() {
		return getCa()*pourcentage+bonus;
	}

}
