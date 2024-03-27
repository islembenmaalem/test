package tp1;

public class MonThread extends Thread {
	private String message;
	private int x;

	public MonThread(String message, int x) {
		this.message = message;
		this.x = x;
	}

	public void run() {
		if (x == 1) {
			for (int i = 1; i <= 1000; i++) {
				System.out.println(message + "i = " + i);
			}
		}
		if (x == 1000) {
			for (int i = 1; i <= 1000; i++) {
				System.out.println(message + "i = " +(1000- i+1)
						);
			}
		}
	}

}
