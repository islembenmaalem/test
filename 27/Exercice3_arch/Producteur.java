package Exercice3_arch;

public class Producteur extends Thread {
    private  int[] tompon;
    private  int max_size;
    private int queue;
    private int tete;
    private int NbPleins=0;
private int N;
private String[] messages;
    public Producteur(String[] messages, int max_size) {
        this.messages = messages;
        this.max_size = max_size;
    }

public synchronized void deposer(int m) {
	while (NbPleins==N) {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tompon[queue]=m;
	}
}
	public void run() {
        for (int i = 0; i < 10; i++) {
            String message = messages[tete];
          
            tete+=1;
            if (tete==max_size) {
            	try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
            if (queue==0) {
            	try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
                System.out.println("Producteur a produit le message : " + message);
            }
        }
    
             
        
    
}

