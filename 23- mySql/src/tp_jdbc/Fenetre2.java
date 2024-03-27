package tp_jdbc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Fenetre2 extends JFrame implements ActionListener {
	JLabel l1=new JLabel("ID ");
	JLabel l2=new JLabel("LIBELLE");
	JLabel l3=new JLabel("PRIX");
	JTextField txt1=new JTextField(20);
	JTextField txt2=new JTextField(20);
	JTextField txt3=new JTextField(20);
	JButton b1=new JButton("Ajouter");
	JButton b2=new JButton("Supprimer");
	JButton b3=new JButton("Quitter");
	JTable table=new JTable();
	String[]Titre={"ID","LIBELLE","PRIX"};
	
	DefaultTableModel model;
	JScrollPane tpan=new JScrollPane(table);

	Traitement tr=new Traitement();

	
	
	public Fenetre2()
	{
	
		model=new DefaultTableModel();
		model.setColumnIdentifiers(Titre);
		ArrayList<Produit>liste=tr.getAllProduits();
		for (Produit x:liste) {
			model.addRow(new String[] {String.valueOf(x.getId()),x.getLibelle(),String.valueOf(x.getPrix())});
		}
	table.setModel(model);
	
	JPanel p1=new JPanel();
	p1.setLayout(new GridLayout(0,2));
	p1.add(l1);
	p1.add(txt1);
	p1.add(l2);
	p1.add(txt2);  
	p1.add(l3);
	p1.add(txt3);
	
	JPanel p2=new JPanel();
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
	this.getContentPane().add(p1,BorderLayout.CENTER);
	this.getContentPane().add(p2,BorderLayout.SOUTH);
	
	setSize(700,600);
	setVisible(true);
	
	
	}
	public void refresh() {
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			Produit p=new Produit(Integer.parseInt(txt1.getText()),String.valueOf(txt2.getText())
					,Double.parseDouble(txt3.getText()));
			tr.save(p);
			
		}
		else {
			if (e.getSource()==b2) {
				tr.deleteProduit(Integer.parseInt(txt1.getText()));
			}
		}
			
		
			
		}
	
}
		
	
