import java.util.Scanner;
public class Test {
	public static void main(String[]args) {
		Scanner Keyb = new Scanner(System.in);	
		Employe E1, E2, E3, E4;
		E1 = new Employe("Paul",1500);
		E2 =new Employe("Tom",1100);
		E3 =new Employe("Diego", 1400);
		E4 =new Employe("Lucas", 1100);
		
		Service S1,S2;
		S1 = new Service("Finance",10);
		S2 = new Service("Technique",10);
		System.out.println("etat initial : ");
		S1.afficher();
		S2.afficher();
		
		S1.affecterEmp(E1);
		S1.affecterEmp(E2);
		S2.affecterEmp(E4);
		S2.affecterEmp(E3);
		S2.setChef(E3);
		S1.setChef(E1);
		S1.eliminerEmp(E2);
		S2.eliminerEmp(E4);
		S1.affecterEmp(E4);
		S2.affecterEmp(E2);
		E2.augmenterSalaire(1.35);
		S1.augmenterSalaire(1.06);
		S2.augmenterSalaire(1.06);
		System.out.println("etat final : ");
		S1.afficher();
		S2.afficher();
		
		
	}
}
