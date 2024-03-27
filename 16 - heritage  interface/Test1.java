package td4;

import java.util.ArrayList;
public class Test1 {
	public static void main(String[]args) {
		//Vehicule[] l=new Vehicule[3];
		ArrayList <Vehicule>l=new ArrayList<>();
		l.add(new Voiture("Fiat"));
		l.add(new Avion("Boeing"));
		l.add(new Velo("VTT"));
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i).toString());
			l.get(i).SeDeplacer();
		//	if(l.get(i) instanceof Voiture)
			      // System.out.println("propriete : "+((Voiture)l.get(i)).calculer()));
			if(l.get(i) instanceof Motorise)
				System.out.println("propriete : "+((Motorise)l.get(i)).calculer());
		}
		Motorise V[]= new Motorise[2];
		V[0]=new Voiture(" Mercedes");
		V[1]=new Avion("Airbus");
		for(int i=0;i<V.length;i++) {
			System.out.println(V[i].toString());
		//	if(V[i] instanceof Voiture)
			//	((Voiture)V[i]).SeDeplacer();
			((Vehicule)V[i]).SeDeplacer();
			System.out.println("propriete : "+V[i].calculer());

		}
		}
        //System.out.print(v.toString());
		
	}


