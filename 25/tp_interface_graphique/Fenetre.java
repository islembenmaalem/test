package tp_interface_graphique;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	public Fenetre() {
		this.setTitle("Ma premiere fenetre JAVA"); // definir un titre
		this.setSize(400, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l1 = new JLabel("Login");
		JTextField txt1 = new JTextField(20); // 20 carcteres visibles
		JLabel l2 = new JLabel("Password");
		JPasswordField pwd1 = new JPasswordField(20);
		JButton b1 = new JButton("ok");
		JButton b2 = new JButton("Annuler");
		JButton b3 = new JButton("Fermer");

		JPanel pan1 = new JPanel();
		pan1.setLayout(new GridLayout(2, 2));

		pan1.add(l1);
		pan1.add(txt1);
		pan1.add(l2);
		pan1.add(pwd1);
		JPanel pan2 = new JPanel();

		pan2.add(b1);
		pan2.add(b2);
		pan2.add(b3);
		this.setLayout(new GridLayout(2, 1));
		this.getContentPane().add(pan1);
		this.getContentPane().add(pan2);

		// pan.setBackground(Color.BLUE);

		this.setVisible(true);
	}

}
