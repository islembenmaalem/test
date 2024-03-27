package ds;
public class Vehicule {
	private String Immat;
	private int v;
	private char d;
	public String getImmat() {
		return Immat;
	}
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
	public char getD() {
		return d;
	}
	public Vehicule(String immat, int v, char d) {
		this.Immat = immat;
		this.v = v;
		//do {
		this.d = d;
		//}while((d!='o')||(d!='n')||(d!='s')||(d!='e'));
	}
	

}
