package e;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
//- le troisième est réservé pour les compétences sous forme aussi de tableau.
public class Competence extends JFrame implements ActionListener {
		JLabel l1 = new JLabel("Competence : ");
		JTextField txt1 = new JTextField(20);
		JButton b1 = new JButton("Ajouter");
		JButton b2 = new JButton("retourner");
		JButton b3 = new JButton("Quitter");
		JTable table = new JTable();
		String[] Titre = { "Competences" };

		DefaultTableModel model;
		JScrollPane tpan = new JScrollPane(table);
	MyFrame f;
		public Competence(MyFrame f) {
			this.f=f;
			model = new DefaultTableModel();
			model.setColumnIdentifiers(Titre);
			// model.addRow(Titre);

			table.setModel(model);
			this.f.setTableComp(table);
			JPanel p1 = new JPanel();
			p1.setLayout(new GridLayout(0, 2));
			p1.add(l1);
			p1.add(txt1);
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

				model.addRow(new String[] { txt1.getText() });
				f.setModeleComp(model);

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


