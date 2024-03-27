public class Test {
	public static void main(String arg[]) {
		Monthread t1= new Monthread("java1");
		t1.start();		
		Monthread t2= new Monthread("java2");
		t2.start();
		try {
			t1.join();
			t2.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("fin");
		
	}
}
