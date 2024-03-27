package ds;

import java.util.Scanner;

public class TraficRoutier {
	public static void main(String[] arg) {
		Scanner Keyb = new Scanner(System.in);
		System.out.println("donner I1 ");
		Ientersection I1= new Ientersection(Keyb.nextLine());
		Ientersection p2;
		System.out.println("donner I2 ");
		Ientersection I2= new Ientersection(Keyb.nextLine());
		Vehicule V1,V2;
		V1=new Vehicule("1",1,'n');
		V2=new Vehicule("1",1,'s');
		I1.entreeVehicule(V2);
		I1.entreeVehicule(V1);
		I1.accident();
		System.out.println(I1.toString());
		I1.sortieVehicule(V1);
		I2.entreeVehicule(V1);
		I1.sortieVehicule(V2.getImmat());
		I2.entreeVehicule(V2);
		I2.accident();

		

		
	}
}
