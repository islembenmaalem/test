package ex2td4;

public class Reel extends Affichage implements Operation{
	private double x;
	public Reel(double x) {
		this.x = x;
	}
	public Object plus(Object o) {
		return new Reel(x+((Reel)o).x);
	}
	public Object moins(Object o) {
		return new Reel(x-((Reel)o).x);
	}
	String affiche() {
		return "("+x+")";
	}

}
