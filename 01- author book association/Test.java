import java.util.Scanner;
public class Test {
	public void afficher () {
		afficher();
	}
	public static void main(String[]args) {
		Scanner Keyb = new Scanner(System.in);	
	auteur A1=new auteur("A1");
	auteur A2=new auteur("A2");
	auteur A3=new auteur("A3");
    auteur[] tabAuteurs = new auteur[1];
    tabAuteurs[0]=A1;
	livre l1=new livre("l1" ,tabAuteurs);
	auteur[] s= {A1,A2};
	//tabAuteurs = new auteur[]{A1,A2}
	livre L2= new livre("l2",s); //replace s tabAuteurs
	auteur[] v= {A3,A2};
	livre L3= new livre("l3",v); //replace v auteur {A3,A2}
	l1.getPremierAuteur().afficher();
	System.out.println("Description des auteurs de L3:");
	for (int i=0;i<L3.getAuteurs().length;i++) {
		L3.getAuteurs()[i].afficher();
    System.out.println("nom du 1 auteur de l1");
    System.out.println(l1.getPremierAuteur().getNom());
	Keyb.close();
	}

}
	
}
//A1.ajouterLlivre(l1);
//A2.ajouterLlivre(L2);
//A2.ajouterLlivre(L3);
//A3.ajouterLlivre(L3);
//A1.afficher();
//A2.afficher();
//A3.afficher();

//for (auteur l : L3.getAuteurs()) {
//l.afficher();
//}
