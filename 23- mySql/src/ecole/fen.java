package ecole;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class fen extends JFrame implements ActionListener {
	JButton b ;
	ecole ec=new ecole();
	JTextField num,moyenne ,prenom,niveau;
	public fen() {
		ec = ec;
		setSize(500, 300);
		 num = new JTextField(20);
		 prenom = new JTextField(20);
		 moyenne = new JTextField(20);
		 niveau = new JTextField(20);
		JLabel ni = new JLabel("niveau");
		JLabel nu = new JLabel("num");
		JLabel pe = new JLabel("prenom");
		JLabel mo = new JLabel("moyenne");
		JPanel pan = new JPanel();
		pan.setLayout(new GridLayout(4, 2));
		pan.add(ni);
		pan.add(niveau);
		pan.add(nu);
		pan.add(num);
		pan.add(pe);
		pan.add(prenom);
		pan.add(mo);
		pan.add(moyenne);
		setLayout(new GridLayout(2, 1));
		add(pan);
		JPanel pan2 = new JPanel();
		pan2.setLayout(new GridLayout(4, 2));
		b = new JButton("add");
		b.addActionListener(this);
		pan2.add(b);
		add(pan2);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b) {
			

			int na=Integer.parseInt(num.getText());
			int ni=Integer.parseInt(niveau.getText());
			String pre=num.getText();
			float moyenn=Float.parseFloat(moyenne.getText());
			eleve el = new eleve(na,pre,moyenn);
			ec.ajouter(ni, el);
			System.out.println(ec);
			

		}
	}

}
