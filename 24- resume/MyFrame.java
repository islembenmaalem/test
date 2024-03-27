package e;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {

	// Components of the Form
	String aa,bb,cc,dd,ee;
	DefaultTableModel mStage;
	DefaultTableModel mProjet,mComp;
	private Container c;
	private JLabel title;
	private JLabel name;
	private JTextField tname;
	private JLabel mno;
	private JTextField tmno;
	private JLabel gender;
	private JRadioButton male;
	private JRadioButton female;
	private ButtonGroup gengp;
	private JLabel dob;
	private JComboBox date;
	private JComboBox nationalite;
	private JComboBox month;
	private JComboBox year;
	private JLabel add;
	private JLabel loisirs;
	private JTextArea tadd;
	private JCheckBox term,L1,L2,L3;
	private JButton sub;
	JButton stage;
	JButton projet;
	JButton comp;
	JButton resumer;
	private JButton reset;
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;
	JTable tableStage = new JTable();
	JTable tableProjet = new JTable();
	JTable tableComp = new JTable();

	private String dates[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
			"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
	private String months[] = { "Jan", "feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sup", "Oct", "Nov", "Dec" };
	private String years[] = { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005",
			"2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018",
			"2019" };
	private String nationalites[] = { "Tunisien","Canadien","Algerien","Francais" };


	public MyFrame() {
		setTitle("Coordonnées");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Coordonnées");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		c.add(title);

		name = new JLabel("Nom :");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(100, 20);
		name.setLocation(50, 100);
		c.add(name);

		tname = new JTextField(); //box taa name
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(100, 20);
		tname.setLocation(120, 100);
		c.add(tname);

		mno = new JLabel("Prenom :");
		mno.setFont(new Font("Arial", Font.PLAIN, 20));
		mno.setSize(100, 20);
		mno.setLocation(250, 100);
		c.add(mno);

		tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 15));
		tmno.setSize(100, 20);
		tmno.setLocation(350, 100);
		c.add(tmno);

		gender = new JLabel("Gender : ");
		gender.setFont(new Font("Arial", Font.PLAIN, 20));
		gender.setSize(100, 20);
		gender.setLocation(50, 150);
		c.add(gender);

		male = new JRadioButton("Homme");
		male.setFont(new Font("Arial", Font.PLAIN, 15));
		male.setSelected(true);
		male.setSize(75, 20);
		male.setLocation(150, 150);
		c.add(male);

		female = new JRadioButton("Femme");
		female.setFont(new Font("Arial", Font.PLAIN, 15));
		female.setSelected(false);
		female.setSize(80, 20);
		female.setLocation(225, 150);
		c.add(female);

		gengp = new ButtonGroup();
		gengp.add(male);
		gengp.add(female);

		dob = new JLabel("date de naissance :");
		dob.setFont(new Font("Arial", Font.PLAIN, 20));
		dob.setSize(165, 20);
		dob.setLocation(50, 200);
		c.add(dob);

		date = new JComboBox(dates);
		date.setFont(new Font("Arial", Font.PLAIN, 15));
		date.setSize(50, 20);
		date.setLocation(230, 200);
		c.add(date);

		month = new JComboBox(months);
		month.setFont(new Font("Arial", Font.PLAIN, 15));
		month.setSize(60, 20);
		month.setLocation(280, 200);
		c.add(month);

		year = new JComboBox(years);
		year.setFont(new Font("Arial", Font.PLAIN, 15));
		year.setSize(60, 20);
		year.setLocation(340, 200);
		c.add(year);

		add = new JLabel("Address");
		add.setFont(new Font("Arial", Font.PLAIN, 20));
		add.setSize(100, 20);
		add.setLocation(50, 350);
		c.add(add);

		tadd = new JTextArea();
		tadd.setFont(new Font("Arial", Font.PLAIN, 15));
		tadd.setSize(200, 75);
		tadd.setLocation(150, 350);
		tadd.setLineWrap(true);
		c.add(tadd);
		
		loisirs = new JLabel("Loisirs :");
		loisirs.setFont(new Font("Arial", Font.PLAIN, 20));
		loisirs.setSize(100, 20);
		loisirs.setLocation(50, 250);
		c.add(loisirs);
		L1 = new JCheckBox("sports");
		L1.setFont(new Font("Arial", Font.PLAIN, 15));
		L1.setSize(70, 20);
		L1.setLocation(150, 250);
		c.add(L1);
		
		L2 = new JCheckBox("Musique");
		L2.setFont(new Font("Arial", Font.PLAIN, 15));
		L2.setSize(90, 20);
		L2.setLocation(250, 250);
		c.add(L2);
		
		L3 = new JCheckBox("Dance");
		L3.setFont(new Font("Arial", Font.PLAIN, 15));
		L3.setSize(70, 20);
		L3.setLocation(350, 250);
		c.add(L3);
		
		dob = new JLabel("Nationnalité : ");
		dob.setFont(new Font("Arial", Font.PLAIN, 20));
		dob.setSize(150, 20);
		dob.setLocation(50, 300);
		c.add(dob);

		nationalite = new JComboBox(nationalites);
		nationalite.setFont(new Font("Arial", Font.PLAIN, 15));
		nationalite.setSize(90, 20);
		nationalite.setLocation(180, 300);
		c.add(nationalite);
		

		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(150, 450);
		sub.addActionListener(this);
		c.add(sub);

		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(270, 450);
		reset.addActionListener(this);
		c.add(reset);
		//newwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
		stage = new JButton("Add Stage");
		stage.setFont(new Font("Arial", Font.PLAIN, 15));
		stage.setSize(120, 20);
		stage.setLocation(50, 500);
		stage.addActionListener(this);
		c.add(stage);
		
		projet = new JButton("Add projet");
		projet.setFont(new Font("Arial", Font.PLAIN, 15));
		projet.setSize(120, 20);
		projet.setLocation(200, 500);
		projet.addActionListener(this);
		c.add(projet);
		
		comp = new JButton("Competence");
		comp.setFont(new Font("Arial", Font.PLAIN, 15));
		comp.setSize(130, 20);
		comp.setLocation(340, 500);
		comp.addActionListener(this);
		c.add(comp);
		
		resumer = new JButton("resumer");
		resumer.setFont(new Font("Arial", Font.PLAIN, 15));
		resumer.setSize(100, 20);
		resumer.setLocation(200, 530);
		resumer.addActionListener(this);
		c.add(resumer);
		//endddddddddddddd
		
		

		tout = new JTextArea();
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(300, 400);
		tout.setLocation(500, 100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		c.add(tout);

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(100, 500);
		c.add(res);

		resadd = new JTextArea();
		resadd.setFont(new Font("Arial", Font.PLAIN, 15));
		resadd.setSize(200, 75);
		resadd.setLocation(580, 175);
		resadd.setLineWrap(true);
		c.add(resadd);

		setVisible(true);
	}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sub) {
				String data1;
				String d="\n Loisirs : ";
				String data = " Nom : " + tname.getText() + "\n" + " Prenom : " + tmno.getText() + "\n";
				if (male.isSelected())
					data1 = " Sexe : Homme" + "\n";
				else
					data1 = " Sexe : Femme" + "\n";
				String data2 = "date de naissance : " + (String) date.getSelectedItem() + "/" + (String) month.getSelectedItem() + "/"
						+ (String) year.getSelectedItem() + "\n";
				if (L1.isSelected())
					d +="\n     - sports";
				if (L2.isSelected())
					d +="\n     - musique";

				if (L3.isSelected())
					d +="\n     - dance";

				String data3 = " Addresse : " + tadd.getText();
				aa=data;
				bb=data1;
				cc=data2;
				dd=data3;
				ee=d;
						
				tout.setText(data + data1 + data2 + data3+d);
				tout.setEditable(false);
				System.out.println(data + data1 + data2 + data3+d);
				JOptionPane ad = new JOptionPane();
				ad.showMessageDialog(this,this.getInfo());

			
		}

		else if (e.getSource() == reset) {
			String def = "";
			tname.setText(def);
			tadd.setText(def);
			tmno.setText(def);
			res.setText(def);
			tout.setText(def);
			term.setSelected(false);
			date.setSelectedIndex(0);
			month.setSelectedIndex(0);
			year.setSelectedIndex(0);
			resadd.setText(def);
		}
		else if (e.getSource()==stage) {
			setVisible(false);
			Stage s=new Stage(this);

		}		
		else if (e.getSource()==projet) {
			setVisible(false);
			Projet s=new Projet(this);
			
		}		
		else if (e.getSource()==comp) {
			setVisible(false);
			Competence comp=new Competence(this);
		}		
		else if (e.getSource()==resumer) {
			String data1;
			String d="\n Loisirs : ";
			String data = " Nom : " + tname.getText() + "\n" + " Prenom : " + tmno.getText() + "\n";
			if (male.isSelected())
				data1 = " Sexe : Homme" + "\n";
			else
				data1 = " Sexe : Femme" + "\n";
			String data2 = "date de naissance : " + (String) date.getSelectedItem() + "/" + (String) month.getSelectedItem() + "/"
					+ (String) year.getSelectedItem() + "\n";
			if (L1.isSelected())
				d +="\n     - sports";
			if (L2.isSelected())
				d +="\n     - musique";

			if (L3.isSelected())
				d +="\n     - dance";

			String data3 = " Addresse : " + tadd.getText();
			aa=data;
			bb=data1;
			cc=data2;
			dd=data3;
			ee=d;
			Resumee r=new Resumee(this);

			
		}
	}
	public void setTableStage(JTable t) {
		tableStage =t;
	}
	public JTable getTableStage() {
		return tableStage ;
	}
	public void setModeleStage(DefaultTableModel mm) {
		mStage= mm ;
	}
	public DefaultTableModel getModeleStage() {
		return mStage;
	}
	
	public void setTableProjet(JTable t) {
		tableProjet =t;
	}
	public JTable getTableProjet() {
		return tableProjet ;
	}
	public void setModeleProjet(DefaultTableModel mm) {
		mProjet= mm ;
	}
	public DefaultTableModel getModeleProjet() {
		return mProjet;
	}
	
	public void setTableComp(JTable t) {
		tableComp =t;
	}
	public JTable getTableComp() {
		return tableComp;
	}
	public void setModeleComp(DefaultTableModel mm) {
		mComp= mm ;
	}
	public DefaultTableModel getModeleComp() {
		return mComp;
	}
	public String getInfo() {
		return aa+bb+cc+dd+ee;
	}
}
