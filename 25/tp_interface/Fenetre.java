package tp_interface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;

public class Fenetre extends JFrame {
	public Fenetre() {
		// JFrame fen = new JFrame();
		this.setTitle("Ma premiere fenetre de java");
		this.setSize(400, 500);// largeur hauteur airgonomie
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l1 = new JLabel("Login");
		JTextField txt1 = new JTextField(20);
		JLabel l2 = new JLabel("Password");
		JPasswordField pwd1 = new JPasswordField(20);
		
		JPanel pan1 = new JPanel();
		pan1.setLayout(new GridLayout(0,2));
		pan1.add(l1);
		pan1.add(txt1);
		pan1.add(l2);
		pan1.add(pwd1);
		
		
		JPanel p2 = new JPanel();
		JButton b=new JButton("Ok");
		p2.add(b);
		JButton b1=new JButton("annuler");
		p2.add(b1);
		JButton b2=new JButton("set");
		p2.add(b2);
		
		
		this.getContentPane().add(pan1,BorderLayout.NORTH);
		this.getContentPane().add(p2,BorderLayout.SOUTH);
		
		//this.getContentPane().add(b1)
		this.setVisible(true);
		pack();
	}

}
// jframe jrootkane jlayredpane jmenuBar ,contentPane: contenir les composants graphiques
// glassPane: intercepter les evenements
