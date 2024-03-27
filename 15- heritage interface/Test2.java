package ex2td4;

public class Test2 {
	public static void main(String[]args) {
		Reel A = new Reel(3.4);
		System.out.println("A :"+A.affiche());
		Reel B=new Reel(0.7);
		System.out.println("B :"+B.affiche());
		Reel S = (Reel)A.plus(B);
		System.out.println("S :"+S.affiche());
		Complexe c = new Complexe(3.4,7.8);
		Complexe e = new Complexe(-0.8,1.8);
		
		System.out.println("C :"+c.affiche());
		System.out.println("E :"+e.affiche());
		Complexe Q = (Complexe)c.plus(e);
		System.out.println("Q :"+Q.affiche());





	
	}
}
