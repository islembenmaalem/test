package tp3;

public class TestPort {
	public static void main(String[] arg) {
	Barque b1=new Barque("monir","M");
	Barque b2=new Barque("nour","N");
	BarqueMoteur m1=new BarqueMoteur("sami","S",3);
	BarqueMoteur m2=new BarqueMoteur("mohamed","M",2);
	System.out.println("barque 1= "+b1.toString()+"\n------------");
	Port p1=new Port("nom_port 2",5,6);
	p1.ajouter_barque(m2);
	p1.ajouter_barque(m1);
	p1.ajouter_barque(b2);
	System.out.println("port 1 = \n"+p1.toString()+"\n------------");
	//supprimer_barque
	p1.sorti_barque(b1);
	p1.sorti_barque(m1);
	System.out.println("\np1 apres modification ");
	System.out.println("port 1 = \n\t"+p1.toString());


	

	
	
	
	
	
	
	
	}
}
