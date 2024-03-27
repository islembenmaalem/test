package ex4_tp_1_iot;

public class Test {
	public static void main(String[] args) {
		int montant = 10;
		Compte c1 = new Compte();

		JobSylvieEtBruno sylvie = new JobSylvieEtBruno(c1, montant, "sylvie");
		JobSylvieEtBruno bruno = new JobSylvieEtBruno(c1, montant, "bruno");

		Thread tache1 = new Thread(sylvie, "sylvie");
		tache1.start();
		Thread tache2 = new Thread(bruno, "bruno");
		tache2.start();

System.out.println("fin");
	}


}
