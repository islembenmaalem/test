public class Point {
	private float abscisse, ordonnee;

	public Point(float abscisse, float ordonnee) {
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}

	public float getAbscisse() {
		return abscisse;
	}

	public float getOrdonnee() {
		return ordonnee;
	}

	public void deplacer(float dx, float dy) {
		abscisse += dx;
		ordonnee += dy;
	}

	public void afficher() {
		System.out.print("(" + abscisse + "," + ordonnee + ")");
	}

	public boolean coincide(Point p) {
		return ((p.abscisse == abscisse) && (p.ordonnee == ordonnee));
	}
}
