package e;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu extends JFrame implements ActionListener {
	// menubar
	static JMenuBar mb;

	// JMenu
	static JMenu x;

	public Menu() {
		mb = new JMenuBar();

		x = new JMenu("Menu");
		JMenuItem m1 = new JMenuItem("cv");
		m1.addActionListener(this);

		x.add(m1);
		mb.add(x);

		setJMenuBar(mb);
		setSize(500, 500);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new MyFrame();
	}
}
