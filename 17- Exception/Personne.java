package ex2tp5;

public class Personne {
	String nom;
	int age;

	public Personne(String nom, String x) throws AgeInvExc, NomInv {
		if ((nom == null) || (nom.isEmpty()))
			throw new NomInv();
		this.nom = nom;
		try {
			this.age = Integer.parseInt(x);
		} catch (NumberFormatException e) {
			age = 0;
		}
		if ((age < 0) || (age > 120))
			throw new AgeInvExc("age invalide");
	}
}

