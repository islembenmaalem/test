package ex2td4;

public class Complexe extends Affichage implements Operation {
	private double im,re;
	
	public Complexe(double re, double im) {
		this.im = im;
		this.re = re;
	}
	public Object plus(Object o) {
		return new Complexe(re+((Complexe)o).re,im+((Complexe)o).im);
	}
	public Object moins(Object o) {
		return new Complexe(re-((Complexe)o).re,im-((Complexe)o).im);
	}

	String affiche() {
		return "("+re+","+im+")";
	}
	

}
