package ex2tp5;

public class Test {
	public static void main(String[] args) {
		try {
	     Personne P= new Personne("une personne","355");
		}
		catch(AgeInvExc | NomInv e) {
			e.printStackTrace();
		}
	
	}
}


