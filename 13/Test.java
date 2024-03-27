
public class Test {
	public static void main(String[] args) {
		Personnel p=new Personnel();
		p.ajouterEmploye(new Vente("pierre","Busniss",45,"1995",30000));
		p.ajouterEmploye(new Prensentation("Leon","Vendout",25,"2001",20000));
		p.ajouterEmploye(new Production("Yves","Bosseur",32,"1998",1000));
		p.ajouterEmploye(new Manutention("Jeanne","Stockeout",32,"1998",45));
		p.ajouterEmploye(new ProdRisque("Jean","Filippe",28,"2000",1000));
		p.ajouterEmploye(new ManuRisque("AL","Abordage",30,"2001",45));
		p.afficherSalaire();
		System.out.println("salaire moyen : "
				+p.slaireMoyen());
		p.afficherEmp();
	}

}
