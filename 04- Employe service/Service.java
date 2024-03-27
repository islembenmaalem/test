
public class Service {
	private String nom;
	private Employe chef;
	private int nbMax;
	private Employe[] tabEmp;
	private int nbEmp=0;
	public Service(String nom,int nbMax) {
		this.nom=nom;
		this.nbMax=nbMax;
		nbEmp=0;
		this.tabEmp=new Employe[nbMax];
	}
	public String getNom() {
		return nom;
	}
	public Employe getChef() {
		return chef;
	}
	public void setChef(Employe chef) {
		this.chef = chef;
	}
	public void affecterEmp(Employe e) {
		if (this.nbMax>nbEmp) {
			e.setService(this);
			this.tabEmp[nbEmp]=e;
			nbEmp++;
			}
		else 
			System.out.println("vous atteint le nombre maximale d'employes");
		}
	public void eliminerEmp(Employe e) {
		int i;
		for (i=0;i<nbEmp;i++) 
			if (tabEmp[i].getMat()==e.getMat()) 
				break;
		for (int j =i;j<nbEmp-1;j++)
			tabEmp[j]=tabEmp[j+1];
		nbEmp--;						
		}
	public void augmenterSalaire(double d) {
		for (int i=0;i<nbEmp;i++) {
			this.tabEmp[i].augmenterSalaire(d);
		}
	}
	public void afficher() {
		System.out.println("**********\n Service : "+nom+"\nChef : ");
		if (chef!=null)
			chef.afficher();
		System.out.println("Employes : ");
		for (int i=0;i<nbEmp;i++) {
			if(chef!=null)
			{
				if(tabEmp[i].getMat()!=chef.getMat())
					tabEmp[i].afficher();
			}
			else
				tabEmp[i].afficher();
		}
	}
	
}
