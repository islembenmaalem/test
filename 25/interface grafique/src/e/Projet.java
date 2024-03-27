package e;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
//- le deuxième est réservé pour l'ajout de projets réalisés. Un champ texte est affiché pour
//saisir le titre du projet et un autre pour le langage utilisé, ensuite un bouton "+" permet de sauvegader la saisie, 
//d'effacer les champs pour saisir un autre projet ...

public class Projet extends JFrame implements ActionListener {
	JLabel l1 = new JLabel("Titre du projet : ");
	JLabel l2 = new JLabel("language utilisée :");
	JTextField txt1 = new JTextField(20);
	JTextField txt2 = new JTextField(20);
	JButton b1 = new JButton("Ajouter");
	JButton b2 = new JButton("retourner");
	JButton b3 = new JButton("Quitter");
	JTable table = new JTable();
	String[] Titre = { "Titre du projet", "language utilisée" };

	DefaultTableModel model;
	JScrollPane tpan = new JScrollPane(table);
MyFrame f;
	public Projet(MyFrame f) {
		this.f=f;
		model = new DefaultTableModel();
		model.setColumnIdentifiers(Titre);
		// model.addRow(Titre);

		table.setModel(model);
		this.f.setTableProjet(table);
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(0, 2));
		p1.add(l1);
		p1.add(txt1);
		p1.add(l2);
		p1.add(txt2);

		JPanel p2 = new JPanel();
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		this.getContentPane().add(tpan, BorderLayout.NORTH);
		this.getContentPane().add(p1, BorderLayout.CENTER);
		this.getContentPane().add(p2, BorderLayout.SOUTH);

		setSize(700, 600);
		setVisible(true);

	}

	public void refresh() {

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {

			model.addRow(new String[] { txt1.getText(), txt2.getText()});
			f.setModeleProjet(model);

		} else {
			if (e.getSource() == b2) {
				setVisible(false);
				f.setVisible(true);
				
			}
		}

	}
	public JTable getTable() {
		return table;
	}
	public DefaultTableModel getmodel() {
		return model;
	}

}

