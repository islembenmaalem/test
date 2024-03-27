package tp_interface_graphique;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Exercice extends JFrame {
	public Exercice() {
		this.setTitle("titre"); // definir un titre
		this.setSize(400, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTable Table = new JTable();
		Object[][] donnees = { { 1, "PRODUIT 1", 100 }, { 2, "PRODUIT 2", 150 }, { 3, "PRODUIT 3", 32 },
				{ 4, "PRODUIT 4", 26 }, };
		String[] titreColonnes = { "id", "Libelle", "Prix" };
		DefaultTableModel model = new DefaultTableModel(donnees, titreColonnes);
		Table.setModel(model);

		JScrollPane pan1 = new JScrollPane(Table);

		this.getContentPane().add(pan1, BorderLayout.NORTH);

		String[] liste = { "dispo", "en repture" };
		JComboBox<String> combo = new JComboBox<String>(liste);

		JPanel pan2 = new JPanel();
		pan2.setLayout(new GridLayout(5, 2));
		JLabel l1 = new JLabel("id");
		JLabel l2 = new JLabel("Libelle");
		JLabel l3 = new JLabel("Prix");
		JLabel l4 = new JLabel("Etat");
		JCheckBox c = new JCheckBox("show", false);
		JTextField txt1 = new JTextField(20);
		JTextField txt2 = new JTextField(20);
		JTextField txt3 = new JTextField(20);

		pan2.add(l1);
		pan2.add(txt1);
		pan2.add(l2);
		pan2.add(txt2);
		pan2.add(l3);
		pan2.add(txt3);
		pan2.add(l4);
		pan2.add(combo);
		pan2.add(c);

		JButton b1 = new JButton("ok");
		JButton b2 = new JButton("Annuler");
		JButton b3 = new JButton("Fermer");
		JPanel pan3 = new JPanel();
		pan3.add(b1);
		pan3.add(b2);
		pan3.add(b3);
		JPanel pan4 = new JPanel();
		pan4.setLayout(new GridLayout(2, 1));
		pan4.add(pan2);
		pan4.add(pan3);
		this.getContentPane().add(pan4, BorderLayout.SOUTH);

		this.setVisible(true);

	}
}
