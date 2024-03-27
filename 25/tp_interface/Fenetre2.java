package tp_interface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Fenetre2 extends JFrame {
	public Fenetre2() {
		this.setTitle("Ma premiere fenetre JAVA"); //definir un titre
		this.setSize(400,200);
		this.setLocationRelativeTo(null);
		String[] columnNames = { "ID", "LIBELLE", "PRIX", };
		Object[][] data = { { "1", "PRODUIT1", "100" }, { "2", "PRODUIT2", "150" }, { "3", "PRODUIT3", "32" },
				{ "4", "PRODUIT4", "26" } };
		JTable table = new JTable();
		DefaultTableModel model = new DefaultTableModel(data,columnNames);
		table.setModel(model);
		JScrollPane tpan = new JScrollPane(table);
		
		this.setLayout(new BorderLayout());
		this.add(tpan, BorderLayout.NORTH);

		JButton b1 = new JButton("ok");
		JButton b2 = new JButton("Annuler");
		JButton b3 = new JButton("Fermer");
		JCheckBox cb=new JCheckBox("show");
		
		JTextField txt1=new JTextField(20);
		JTextField txt2=new JTextField(20); 
		JTextField txt3=new JTextField(20); 
		
		JLabel l1 =new JLabel("id");
		JLabel l2 =new JLabel("Libelle");
		JLabel l3 =new JLabel("Prix");
		JLabel l4 =new JLabel("Etat");
		JPanel pan2= new JPanel();
		pan2.setLayout(new GridLayout(5,2));

		
		String[] liste= {"dispo","en repture"};
		JComboBox <String>combo=new JComboBox<String>(liste);
		
		
		
		
		
		
		
		
		
		
		
		
		
		this.setVisible(true);

		

	}
}
