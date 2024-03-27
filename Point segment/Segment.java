public class Segment {
	private Point ext1;
	private Point ext2;

	public Segment(Point ext1, Point ext2) {
		this.ext1 = ext1;
		this.ext2 = ext2;
	}

	public Segment(float a, float b, float c, float d) {
		ext1 = new Point(a, b);
		ext2 = new Point(c, d);
	}
	public void deplacerext1(float dx, float dy) {
		ext1.deplacer(dx, dy);
	}
	public void deplacerext2(float dx, float dy) {
		ext2.deplacer(dx, dy);
	}
	public double longeur() {
		// float x1 = ext1.getAbscisse();
		// float x2 = ext2.getAbscisse();
		float y1 = ext1.getOrdonnee();
		float y2 = ext2.getOrdonnee();
		return Math.sqrt(Math.pow(ext1.getAbscisse() - ext2.getAbscisse(), 2) + (y1 - y2) * (y1 - y2));
	}
	public void afficher() {
		System.out.println("les coordonnes sont :");
		ext1.afficher();
		ext2.afficher();
		//System.out.println("la longeur de la segment est : " + Math.round(longeur()*100/100));
		System.out.format("%.2f",longeur());
	}
}