package question3;


public class Employe {
	private String id;
	private String firstname;
	private String lastname;
	private int age;
	private float salaire;
	public Employe(String id, String firstname, String lastname,int age, float salaire) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age=age;
		this.salaire = salaire;
	}
    public String getAge() {
        return Integer.toString(age);
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getSalaire() {
        return Float.toString(salaire);
    }
    public String getId() {
        return id;
    }	
}
