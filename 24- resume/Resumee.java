package e;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Resumee extends JFrame {
	JTable tableStage = new JTable();
	JTable tableProjet = new JTable();
	JTable tableComp = new JTable();
	JScrollPane tpanStage = new JScrollPane(tableStage);
	JScrollPane tpanProjet = new JScrollPane(tableProjet);
	JScrollPane tpanComp = new JScrollPane(tableComp);
	DefaultTableModel modelStage;
	DefaultTableModel modelProjet;
	DefaultTableModel modelComp;
	String[] TitreStage = { "Lieu", "periode", "tache effectuee" };
	String[] TitreProjet =  { "Titre du projet", "language utilisée" };
	String[] TitreComp =  { "Comptenece" };
	public Resumee(MyFrame f) {
		modelStage = new DefaultTableModel();
        modelStage=f.getModeleStage();
        modelStage.setColumnIdentifiers(TitreStage);
		tableStage.setModel(modelStage);
		
		modelProjet = new DefaultTableModel();
		modelProjet=f.getModeleProjet();
		modelProjet.setColumnIdentifiers(TitreProjet);
		tableProjet.setModel(modelProjet);
		
		modelComp = new DefaultTableModel();
		modelComp=f.getModeleComp();
		modelComp.setColumnIdentifiers(TitreComp);
		tableComp.setModel(modelComp);
		
        setLayout(new GridLayout(8,1));
        add(new JLabel("Information :"));
        add(new JLabel(f.getInfo()));
        add(new JLabel("liste des Stages :"));
        add(tpanStage);
        
        
        add(new JLabel("liste des Projet :"));
        add(tpanProjet);
        
        add(new JLabel("liste des competence :"));
        add(tpanComp);
        JOptionPane ad = new JOptionPane();
		ad.showMessageDialog(f,f.getInfo());
		setSize(700, 600);
		setVisible(true);

		
		
	}

}
