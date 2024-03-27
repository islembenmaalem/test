import java.util.Hashtable;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Delegation sakiet_ezzit = new Delegation(30, "sakiet ezzit");
		Delegation Menzel_Chaker = new Delegation(20, "Menzel chaker");
		Map<Integer, Delegation> s = new Hashtable<Integer, Delegation>();
		s.put(1, sakiet_ezzit);
		Ville sfax = new Ville(s, "sfax");
		sfax.ajouter_délégation(Menzel_Chaker);
		Delegation Chebba = new Delegation(50, "chebba");
		Delegation el_jam = new Delegation(10, "el jam");
		Map<Integer, Delegation> m = new Hashtable<Integer, Delegation>();
		m.put(0, Chebba);
		m.put(1, el_jam);
		m.put(4, sakiet_ezzit);
		Ville mahdia = new Ville(m, "mahdia");
		System.out.println(mahdia.toString());
		if (mahdia.recherche_delegation(sakiet_ezzit)) {
			mahdia.supprimer_delegation(sakiet_ezzit);
			System.out.println("apres supression la delegation " + sakiet_ezzit.getNom() + " :" + mahdia.toString());
			
		}
		mahdia.modifier_nombre_habitant_délégation(el_jam, 40);
		Map<Integer, Ville> t = new Hashtable<Integer, Ville>();
		t.put(11, mahdia);
		t.put(6, sfax);
		Pays Tunisie = new Pays("Tunisie", t);
		Ville paris = new Ville(m, "paris");
		Tunisie.ajouter_ville(paris);
		System.out.println(Tunisie.toString());
		if (Tunisie.recherche_ville(paris)) {
			Tunisie.supprimer_ville(paris);
			System.out.println("apres supression la ville " + paris.getNom_ville() + " :\n" + Tunisie.toString());
		}
		System.out.println("le nombre d'habitant en mahdia est " + mahdia.nbre_habitants_par_ville());
		System.out.println("le nombre d'habitant en tunisie est " + Tunisie.nbre_habitants_par_pays());
		mahdia.recherche_Max_delegation();
		sfax.recherche_Max_delegation();
		Tunisie.recherche_Max_ville();
	}
}
