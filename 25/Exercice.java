import java.awt.*;
public class Exercice extends Frame {
	public Exercice() {

		Frame f = new Frame("ApplicationComplexe");
		Panel p0 = new Panel();
		p0.setBounds(10, 30, 170, 30);
		p0.setLayout(new FlowLayout());
		p0.add(new Button("B1"));
		p0.add(new Button("B2"));
		p0.add(new Button("B3"));
		p0.add(new Button("B4"));
		f.add(p0);

		Panel panel = new Panel();
		panel.setBounds(10, 60, 170, 60);
		panel.setBackground(Color.gray);
		panel.setLayout(new GridLayout(2, 2));
		for (int i = 1; i < 5; i++)
			panel.add(new Button("GR" + Integer.toString(i)));

		f.add(panel);
		Panel p = new Panel();
		p.setBounds(22, 120, 150, 30);
		p.setLayout(new FlowLayout());

		// create a choice
		Choice c = new Choice();

		// add element to the list
		c.add(" ");
		c.add("A");
		c.add("B");
		p.add(c, BorderLayout.CENTER);
		TextField tf = new TextField("Un texte");
		p.add(tf);

		f.add(p);
		f.setSize(190, 160);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		Exercice ex = new Exercice();
	}
}
