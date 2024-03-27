
public class Delegation {
	private int nombre;
	private String nomd;

	public Delegation(int nombre, String nom) {
		this.nombre = nombre;
		this.nomd = nom;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public String getNom() {
		return nomd;
	}

	public void setNom(String nom) {
		this.nomd = nom;
	}

	public String toString() {
		return nomd + " de nombres " + nombre;
	}

}
