package metier;

import junit.framework.TestCase;

public class TestCalcul extends TestCase {
	ICreditMetier metier;
	protected void setUp() throws Exception {
		metier=new CreditMetierImp();
	}

	public void testCalculeMensu() {
		double credit=200000;
		int duree=240;
		double taux=4.5;
		double resultatAttendu =1265.2987;
		double resultatObtenu =metier.calculeMensu(credit, taux, duree);
		assertEquals(resultatAttendu, resultatObtenu,0.0001);
	}

}
