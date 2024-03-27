package ds;

public class Ientersection {
	private String nom;
	Vehicule[] TVehicules;
	public static int  nb=0;
	public Ientersection(String nom) {
		this.nom = nom;
		TVehicules = new Vehicule[100];
	}
	public void entreeVehicule(Vehicule v) {
		if(nb>=100) 
			System.out.println("nbr max atteint");
		else {
		TVehicules[nb]=v;
		nb++;
	}}
	public void sortieVehicule(Vehicule v) {
		int i;
		for (i=0;i<nb;i++) 
			if (TVehicules[i].getImmat()==v.getImmat()) {
				for (int j =i;j<nb-1;j++) 
					TVehicules[j]=TVehicules[j+1];
				TVehicules[nb-1]=null;
				nb--;			
			}
		}
	public void sortieVehicule(String immat) {
		int i;
		for (i=0;i<nb;i++) 
			if (TVehicules[i].getImmat()==immat) {
				for (int j =i;j<nb-1;j++) 
					TVehicules[j]=TVehicules[j+1];
				TVehicules[nb-1]=null;
				nb--;			
			}
		}
	 public void accident(Ientersection this) {
		 int s;
		 for (int i =0;i<nb;i++) {
			 s=0;
			 for (int j=i;j<nb-1;j++) {
				if(TVehicules[i].getD()==this.TVehicules[j].getD()) {
					if ((TVehicules[i].getV()<0)&&(this.TVehicules[j].getV()>0)) {
						System.out.println("risque");
						s++;
					}
			 System.out.println("somme"+s);	
					}
			}
		}
	 }
public String toString() {
	String s = null;
	for (int i=0;i<nb;i++)
		s+="immat "+i+"= "+TVehicules[i].getImmat();
	return "nom = "+nom+s;

	
}


}
