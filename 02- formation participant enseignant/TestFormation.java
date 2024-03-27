import java.util.Scanner;

public class TestFormation {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        
        System.out.println("Donner le nom du premier enseignant:");
        String nomEnseignant1 = keyb.nextLine();
        
        System.out.println("Donner la spécialité du premier enseignant:");
        String specialiteEnseignant1 = keyb.nextLine();
        
        Enseignant enseignant1 = new Enseignant(nomEnseignant1, specialiteEnseignant1);
        enseignant1.afficher();
    }
}
