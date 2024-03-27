
package TP2_arch_ex2;


public class ThreadRetirer extends Thread{
	
	private Compte c;
	static int etat = 0;
	public ThreadRetirer(Compte c) {
		this.c = c;
	}


	@Override
    public void run() {
        while(true) {
            c.retirer(200);
            System.out.print("retirer " );

            c.consulter();
            try {
				sleep((long) (Math.random()*200));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
	
	public static void main(String[] args) {
		Compte c= new Compte(100);
		ThreadDeposer deposer = new ThreadDeposer(c);
		ThreadRetirer retirer = new ThreadRetirer(c);
		Thread TD = new Thread(deposer);
		Thread TR  = new Thread(retirer);
		TD.start();
		TR.start();
		System.out.println("fin");

	}

}
