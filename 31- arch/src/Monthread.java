
public class Monthread extends Thread {
	private String message;

	public  Monthread(String message) {
		this.message = message;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(message);
			try {
				sleep(1000);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
