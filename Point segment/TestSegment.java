import java.util.Scanner;
public class TestSegment {
	public void afficher () {
		afficher();
	}
	public static void main(String[]args) {
		Scanner Keyb = new Scanner(System.in);
		System.out.println("donner p1 ");
		Point p1= new Point(Keyb.nextFloat(),Keyb.nextFloat());
	Point p2;
	do {
		System.out.println("donner p2 ");
		p2 = new Point(Keyb.nextFloat(),Keyb.nextFloat());
	}while(p1.coincide(p2));
	Segment s = new Segment(p1,p2);
	s.afficher();
	s.deplacerext1(Keyb.nextFloat(), Keyb.nextFloat());
	s.deplacerext2(Keyb.nextFloat(), Keyb.nextFloat());
	}
}