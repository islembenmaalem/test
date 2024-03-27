package TP2_arch_ex2;


public class ThreadDeposer extends Thread{
	
	private Compte c;
	static int etat = 0;
	public ThreadDeposer(Compte c) {
		this.c = c;
	}


	@Override
    public void run() {
		while (true) {
            c.deposer(10);
            System.out.print("deposer " );
            c.consulter();
            try {
				sleep((long) (Math.random()*100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
}


