package ecole;

public class main {
	public static void main(String []args) {
		eleve e = new eleve(1,"ali",12);
		ecole ec=new ecole();
		ec.ajouter(2, e);
		eleve eA= new eleve(1,"ali",18);
		ec.ajouter(5, eA);
		System.out.println(ec);
		new fen();
	}

}
