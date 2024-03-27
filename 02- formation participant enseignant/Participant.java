public class Participant {
	private String nom;
	private String specialite;
	private Formation Form ;
	public Participant (String a , String b) {
		nom = a ; specialite = b;
	}
	public void affecterFormation(Formation f) {
	    if (f.getEns() != null && specialite.equals(f.getEns().getSpecialite())) {
	        Form = f;
	    } else {
	        Form = null;
	    }
	}

	public void afficher() {
		if(Form==null)
			System.out.println("pas de formation");
		else {
			System.out.println("nom du participant: "+nom);
		    Form.afficher();
}
}
	}
