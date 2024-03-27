import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Fenetre1 extends JFrame {
	JLabel l1, l2, l3;
	JTextField x, y, res;
	JButton b1, b2, b3;

	public Fenetre1() {

		l1 = new JLabel("X= ");
		l2 = new JLabel("Y= ");
		l3 = new JLabel("RESULTAT= ");

		x = new JTextField(10);
		y = new JTextField(10);
		res = new JTextField(10);

		b1 = new JButton(" + ");
		b2 = new JButton(" - ");
		b3 = new JButton(" EXIT ");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		b1.addActionListener(new Ajout());
		b2.addActionListener(new Ajout());
		JPanel p1 = new JPanel(new GridLayout(2, 2));
		p1.add(l1);
		p1.add(x);

		p1.add(l2);
		p1.add(y);

		JPanel p2 = new JPanel();
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);

		JPanel p3 = new JPanel();
		p3.add(l3);
		p3.add(res);

		this.getContentPane().add(p1, BorderLayout.NORTH);
		this.add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);

		setSize(400, 150);
		setVisible(true);

	}

	public class Ajout implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b1) {
				int a = Integer.parseInt(x.getText());
				int b = Integer.parseInt(y.getText());
				res.setText(String.valueOf(a + b));
			} else {
				if (e.getSource() == b2) {
					int a = Integer.parseInt(x.getText());
					int b = Integer.parseInt(y.getText());
					res.setText(String.valueOf(a - b));
				}
			}
		}
	}

}