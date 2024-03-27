import java.util.ArrayList;
public class Test {
	public static void main(String[] arg) {
		Vacataire v=new Vacataire("ALI", 200, 3.9f);
		Contractuel c=new Contractuel("SALAH",900);
		Permanent p=new Permanent("MOHAMED",1100,150);
		ArrayList l=new ArrayList(3);
		l.add(v);
		l.add(c);
		l.add(p);
		System.out.println("l'affichage avant la modification : \n");
		for (int i=0;i<l.size();i++) {
			System.out.println(l.get(i).toString()+"\n");
		}
		v.setPrixHeure(4.1f);
		p.setPrime(230);
		c.setSalaireBase(1000);
		System.out.println("l'affichage apres modification : \n");
		for (int i=0;i<l.size();i++) {
			System.out.println(l.get(i)+"\n");
		}
		
	}
}
