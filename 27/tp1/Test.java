package tp1;

public class Test {
	public static void main(String arg[]) {
		MonThread TA= new MonThread("TA",1);
		TA.start();		
		MonThread TB= new MonThread("TB",1000);
		TB.start();
		try {
			TA.join();
			TB.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("fin");
		
	}
}