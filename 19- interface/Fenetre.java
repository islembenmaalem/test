package exemen_tp_java;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Fenetre extends JFrame implements ActionListener {
	JButton Quitter;
	JButton creer;
	JButton Afficher;
	JButton Ajouter;
	JTextField moy, pre, no, nu, ni;
	Ecole ecole = new Ecole();

	public Fenetre() {
	//	ecole = new Ecole();
		setTitle("Gestion de l'ecole");
		JPanel pan = new JPanel();
		JPanel pan2 = new JPanel();
		JLabel niveau = new JLabel("niveau");
		JLabel Numero = new JLabel("Numero");
		JLabel Nom = new JLabel("Nom");
		JLabel Prenom = new JLabel("Prenom");
		JLabel Moyenne = new JLabel("Moyenne");
		ni = new JTextField(20);
		nu = new JTextField(20);
		no = new JTextField(20);
		pre = new JTextField(20);
		moy = new JTextField(20);
		creer = new JButton("creer");
		Ajouter = new JButton("Ajouter Niveau");
		Afficher = new JButton("Afficher Premier");
		Quitter = new JButton("Quiter");
		creer.addActionListener(this);
		Quitter.addActionListener(this);
		Ajouter.addActionListener(this);
		Afficher.addActionListener(this);
		pan.setLayout(new GridLayout(5, 2));
		pan.add(niveau);
		pan.add(ni);

		pan.add(Numero);
		pan.add(nu);

		pan.add(Nom);
		pan.add(no);

		pan.add(Prenom);
		pan.add(pre);
		pan.add(Moyenne);
		pan.add(moy);
		pan2.setLayout(new GridLayout(4, 1));

		pan2.add(creer);
		pan2.add(Ajouter);
		pan2.add(Afficher);
		pan2.add(Quitter);

		this.add(pan, BorderLayout.WEST);
		this.add(pan2, BorderLayout.EAST);

		setSize(530, 150);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Quitter) {
			System.exit(0);
		}
		if (e.getSource() == creer) {
				ecole.AjouterNiveau(ni.getText());
			System.out.println(" niveau ajouté ");
				
		}

		if (e.getSource() == Ajouter) {
			int num = Integer.parseInt(nu.getText());
			String nom = no.getText();
			ecole.Ajouter(ni.getText(), new Eleve(num, nom, pre.getText(), Float.parseFloat(moy.getText())));
			System.out.println(" eleve ajouté ");
			ecole.Affiche();


		}

		if (e.getSource() == Afficher) {
			System.out.println(ecole.Premier(ni.getText()));

		}

	}

}
