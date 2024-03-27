
public class Temps {
//Attributs
	private int heures, minutes, secondes;
//Constructeur
	public Temps(int h, int m, int s) throws TempsException {
		if (h < 0 || h > 23)
			throw new TempsException();
		if (m < 0 || m > 59)
			throw new TempsException();
		if (s < 0 || s > 59)
			throw new TempsException();
		heures = h;
		minutes = m;
		secondes = s;
	}
}

