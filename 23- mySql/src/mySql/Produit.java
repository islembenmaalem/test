package mySql;

public class Produit {
	private float prix;
	private int reference;
	private String nom;
	private String description;

	public Produit(float prix, int reference, String nom, String description) {
		super();
		this.prix = prix;
		this.reference = reference;
		this.nom = nom;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Produit [prix=" + prix + ", reference=" + reference + ", nom=" + nom + ", description=" + description
				+ "]";
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
