import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

final class essai_game_jeu_fenetre extends JFrame implements ActionListener {
	private int k = 0;
	private int p = 0;
	private javax.swing.JButton b;
	public static ArrayList<JTextField> l1 = new ArrayList<JTextField>(1);
	private static ArrayList<Object> l;
	private String reponseChiffree;
	private static int i;
	private HashMap<String, Integer> liste;
	static int q = 0;
	Timer timer;
	int counter = 10;
	String reponse;
	int paire ;

	essai_game_jeu_fenetre(String titre, HashMap<String, Integer> liste,int pa) {
		paire=pa;

		final JLabel label = new JLabel("10");
		/*
		 * timer = new Timer(1000, new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * label.setText(String.valueOf(counter)); counter--; if (counter == 0) {
		 * //timer.removeActionListener(this); timer.stop(); setVisible(false);
		 * JOptionPane.showMessageDialog(null, "temps passé");
		 * 
		 * essai_game_jeu_fenetre qq=new essai_game_jeu_fenetre("j2 turn", liste); } }
		 * }); timer.start();
		 */
		l1 = new ArrayList<JTextField>(1);
		this.liste = liste;
		this.setTitle(titre); // definir un titre
		this.setSize(400, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Jeu jeu = new Jeu();
		JPanel pan2 = new JPanel();
		l = new ArrayList<Object>();
		// l1 = new ArrayList<JTextField>();
		try {
			String question = jeu.question_aleatoire();
			reponse = jeu.getReponse(question);
			System.out.println(" reponse : " + reponse);
			this.reponseChiffree = jeu.getReponseChiffree(question);
			pan2.setLayout(new GridLayout(1, reponseChiffree.length()));
			for (int i = 0; i < reponseChiffree.length(); i++) {
				if ((reponseChiffree.charAt(i) == '_')) {
					JTextField t = new JTextField(1);
					l.add(t);
				} else {
					l.add(reponseChiffree.charAt(i));
				}
			}
			int j = 0;
			for (int i = 0; i < l.size(); i++) {
				if (reponseChiffree.charAt(i) == '_') {
					k++;
					JTextField txt = new JTextField(1);
					txt.setColumns(1);
					pan2.add(txt);
					txt.setBackground(new java.awt.Color(255, 204, 255));

					l1.add(txt);
					pan2.add(l1.get(j));
					j++;

				} else {
					String s = new String(String.valueOf((char) l.get(i)));
					JLabel l3 = new JLabel(s);
					pan2.add(l3);
				}
			}
			int mpl = l1.size();
			System.out.println("mpl : " + mpl);
			/*
			 * for (int i = 0; i < mpl-1; i++) { int mm=i; JTextField txt1 = l1.get(i);
			 * JTextField txt2 = l1.get(i+1); System.out.println("k : "+mm);
			 * (txt1).addKeyListener(new KeyAdapter( ) { //JTextField txt2 = l1.get(k);
			 * 
			 * public void keyPressed(KeyEvent e) { txt1.requestFocus();
			 * txt1.setEditable(true); if (txt1.getText().equals("")) { txt2.requestFocus();
			 * txt1.setEditable(false);}
			 * 
			 * /*}else txt2.requestFocus();
			 * 
			 * else { txt2.requestFocus(); if (e.getID() == KeyEvent. VK_SHIFT) {
			 * txt2.requestFocus(); txt2.requestFocus();}
			 * 
			 * 
			 * txt2.requestFocus(); txt1.setEditable(false);
			 * 
			 * 
			 * 
			 * 
			 * }} ); pan2.add(txt1);
			 * 
			 * } ;
			 */
			JTextField elt0 = l1.get(0);
			JTextField elt1 = l1.get(1);
			JTextField elt2 = l1.get(2);
			JTextField elt3 = l1.get(3);
			JTextField elt4 = l1.get(4);
			elt0.setText("");
			elt1.setText("");
			elt2.setText("");
			elt3.setText("");
			elt4.setText("");
			// elt0.setDocument((Document) new JTextField(1));

			l1.get(0).requestFocus();
			/*
			 * elt0.addKeyListener(new KeyAdapter() {
			 * 
			 * @Override public void keyPressed(KeyEvent EVT) { if (( EVT.getKeyChar() >=
			 * 'a' && EVT.getKeyChar() <= 'z' )) { // elt0.setEditable(true); //
			 * elt1.requestFocusInWindow();
			 * 
			 * elt0.setEditable(true); elt0.setText(elt0.getText()); elt1.requestFocus();
			 * 
			 * } else { elt0.requestFocus(); elt0.setEditable(false); }
			 * 
			 * 
			 * //elt0.setFocusable(false); }
			 * 
			 * }); elt1.addKeyListener(new KeyAdapter() {
			 * 
			 * @Override public void keyPressed(KeyEvent EVT) { if (( EVT.getKeyChar() >=
			 * 'a' && EVT.getKeyChar() <= 'z' )) { elt1.setEditable(true);
			 * elt1.setText(elt1.getText()); elt2.requestFocus(); } else {
			 * 
			 * elt1.requestFocus(); elt1.setEditable(false); }
			 * 
			 * 
			 * //elt1.setFocusable(false); }
			 * 
			 * }); elt2.addKeyListener(new KeyAdapter() {
			 * 
			 * @Override public void keyPressed(KeyEvent EVT) { if (( EVT.getKeyChar() >=
			 * 'a' && EVT.getKeyChar() <= 'z' )) { elt2.setEditable(true);
			 * elt2.setText(elt2.getText()); elt3.requestFocus();
			 * 
			 * } else { elt2.requestFocus(); elt2.setEditable(false); //
			 * elt2.setFocusable(false); // elt2.requestFocusInWindow(); //
			 * elt2.setEditable(false); }
			 * 
			 * 
			 * //elt2.setFocusable(false); } }); elt3.addKeyListener(new KeyAdapter() {
			 * 
			 * @Override public void keyPressed(KeyEvent EVT) { if (( EVT.getKeyChar() >=
			 * 'a' && EVT.getKeyChar() <= 'z' )) { elt3.setEditable(true);
			 * elt3.setText(elt3.getText()); elt4.requestFocus(); } else {
			 * elt3.requestFocus(); elt3.setEditable(false); // elt3.setFocusable(false); //
			 * elt3.requestFocusInWindow(); //elt3.setEditable(false); }
			 * 
			 * 
			 * //elt3.setFocusable(false); }
			 * 
			 * });
			 */
			for (i = 0; i < l1.size() - 1; i++) {
				l1.get(i).addKeyListener(new KeyAdapter() {

					@Override
					public void keyTyped(KeyEvent EVT) {
						if ((EVT.getKeyChar() >= 'a' && EVT.getKeyChar() <= 'z')
								|| (EVT.getKeyChar() >= '0' && EVT.getKeyChar() <= '9')) {
							// l1.get(i).setEditable(true);
							// l1.get(i).setText(l1.get(i).getText());
							// acctNo3.setText(acctNo2.getText());
							// acctNo2.setText(acctNo1.getText());
							// acctNo1.setText("");
							if (l1.get(i).getText() == "") {
								l1.get(i).requestFocus();
							} else {
								l1.get(++p).requestFocus();

							}
						} else {
							l1.get(i).requestFocus();
							l1.get(i).setEditable(false);
						}
					}
				});
			}
			l1.get(l1.size() - 1).addKeyListener(new KeyAdapter() {

				@Override
				public void keyTyped(KeyEvent EVT) {
					if ((EVT.getKeyChar() >= 'a' && EVT.getKeyChar() <= 'z')
							|| (EVT.getKeyChar() >= '0' && EVT.getKeyChar() <= '9')) {
						// l1.get(i).setEditable(true);
						// l1.get(i).setText(l1.get(i).getText());
						// acctNo3.setText(acctNo2.getText());
						// acctNo2.setText(acctNo1.getText());
						// acctNo1.setText("");
						if (l1.get(l1.size() - 1).getText() == "") {
							l1.get(l1.size() - 1).requestFocus();
						} else {
							l1.get(0).requestFocus();
						}
					} else {
						l1.get(l1.size() - 1).requestFocus();
						l1.get(l1.size() - 1).setEditable(false);
					}
				}
			});

			/*
			 * l1.get(0).addKeyListener(new KeyAdapter() {
			 * 
			 * @Override public void keyTyped(KeyEvent EVT) { int i=0; String str1=""; if (
			 * EVT.getKeyChar() >= 'a' && EVT.getKeyChar() <= 'z' ) {
			 * l1.get(0).setEditable(true); l1.get(0).setText(l1.get(0).getText()); //
			 * acctNo3.setText(acctNo2.getText()); // acctNo2.setText(acctNo1.getText()); //
			 * acctNo1.setText(""); if (l1.get(0).getText()=="") { l1.get(0).requestFocus();
			 * } else { l1.get(1).requestFocus(); } } else{ l1.get(0).requestFocus();
			 * l1.get(0).setEditable(false); } } });
			 * 
			 * l1.get(1).addKeyListener(new KeyAdapter() {
			 * 
			 * @Override public void keyTyped(KeyEvent EVT) { int i=0; String str1=""; if (
			 * EVT.getKeyChar() >= 'a' && EVT.getKeyChar() <= 'z' ) {
			 * l1.get(1).setEditable(true); l1.get(1).setText(l1.get(1).getText()); //
			 * acctNo3.setText(acctNo2.getText()); // acctNo2.setText(acctNo1.getText()); //
			 * acctNo1.setText(""); if (l1.get(1).getText()=="") { l1.get(1).requestFocus();
			 * } else { l1.get(2).requestFocus(); } } else{ l1.get(1).requestFocus();
			 * l1.get(1).setEditable(false); } } });
			 * 
			 * l1.get(2).addKeyListener(new KeyAdapter() {
			 * 
			 * @Override public void keyTyped(KeyEvent EVT) { int i=0; String str1=""; if (
			 * EVT.getKeyChar() >= 'a' && EVT.getKeyChar() <= 'z' ) {
			 * l1.get(2).setEditable(true); l1.get(2).setText(l1.get(2).getText()); //
			 * acctNo3.setText(acctNo2.getText()); // acctNo2.setText(acctNo1.getText()); //
			 * acctNo1.setText(""); if (l1.get(2).getText()=="") { l1.get(2).requestFocus();
			 * } else { l1.get(3).requestFocus(); } } else{ l1.get(2).requestFocus();
			 * l1.get(2).setEditable(false); } } });
			 * 
			 * l1.get(3).addKeyListener(new KeyAdapter() {
			 * 
			 * @Override public void keyTyped(KeyEvent EVT) { int i=0; String str1=""; if (
			 * EVT.getKeyChar() >= 'a' && EVT.getKeyChar() <= 'z' ) {
			 * l1.get(3).setEditable(true); l1.get(3).setText(l1.get(3).getText()); //
			 * acctNo3.setText(acctNo2.getText()); // acctNo2.setText(acctNo1.getText()); //
			 * acctNo1.setText(""); if (l1.get(3).getText()=="") { l1.get(3).requestFocus();
			 * } else { elt4.requestFocus(); } } else{ l1.get(3).requestFocus();
			 * elt3.setEditable(false); } } });
			 */

			/*
			 * elt4.addKeyListener(new KeyAdapter() {
			 * 
			 * @Override public void keyPressed(KeyEvent EVT) { if (( EVT.getKeyChar() >=
			 * 'a' && EVT.getKeyChar() <= 'z' )) { elt4.setEditable(true);
			 * elt4.setText(elt0.getText()); elt4.requestFocus(); } else {
			 * //elt4.requestFocus(); elt4.setEditable(false); // elt4.setFocusable(false);
			 * // elt4.requestFocusInWindow(); //elt4.setEditable(false); }
			 * 
			 * 
			 * //elt4.setFocusable(false);
			 * 
			 * }
			 * 
			 * });
			 */
			/*
			 * pan2.add(elt0); pan2.add(elt1); pan2.add(elt2); pan2.add(elt3);
			 * pan2.add(elt4);
			 */
			// pan2.add(label, BorderLayout.NORTH);

			this.getContentPane().add(pan2, BorderLayout.SOUTH);
			b = new JButton("ok");

			b.addActionListener(this);
			pan2.add(b);
			this.getContentPane().add(b, BorderLayout.NORTH);
			elt0.requestFocus();
			addWindowListener(new WindowAdapter() {
				@Override
				public void windowActivated(WindowEvent e) {
					if (isVisible()) {
						try {
							elt0.requestFocus();
						} catch (Exception e1) {
						}
					}
				}
			});

		} catch (XPathExpressionException | SAXException | IOException |

				ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.liste = liste;

		this.setVisible(true);

	}

	public HashMap<String, Integer> getListe() {
		return liste;
	}

	public void setListe(HashMap<String, Integer> liste) {
		this.liste = liste;
	}

	private String s_concat;

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b) {
			for (int i = 0; i < l1.size(); i++) {
				if (l1.get(i).getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Veillez remplir les cases vides");
					break;
				}
			}
		}
		if (e.getSource() == b) {
			s_concat = "";
			String s = "";
			for (int i = 0; i < l1.size(); i++) {
				s += ((JTextField) l1.get(i)).getText();
			}
			// String s_concat = "";
			int p = 0;
			for (int i = 0; i < reponseChiffree.length(); i++)
				if (reponseChiffree.charAt(i) != '_')
					s_concat += String.valueOf((char) l.get(i));
				else {
					s_concat += l1.get(p).getText();
					p++;
				}
			System.out.println("count paire  : " + paire);
			if (s_concat.equals(reponse)) {
				JOptionPane.showMessageDialog(null, "Correct");
				if (paire % 2 == 0) {
					liste.put("j1", liste.get("j1") + 1);
					essai_game_jeu_fenetre qq = new essai_game_jeu_fenetre("j2 turn", liste,1);
					System.out.println("count paire j1 : " + paire);

				} else {
					if (paire % 2 != 0) {
						liste.put("j2", liste.get("j2") + 1);
						System.out.println("count paire j2 : " + paire);
						essai_game_jeu_fenetre qq = new essai_game_jeu_fenetre("j1 turn", liste,2);

					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "Non");
				System.out.println("listee : " + liste + "  " + liste.get("j2"));
				if (paire % 2 == 0) {

					essai_game_jeu_fenetre qq = new essai_game_jeu_fenetre("j2 turn", liste,1);

				}

				else {
					if (paire % 2 != 0) {
					essai_game_jeu_fenetre qq = new essai_game_jeu_fenetre("j1 turn", liste,2);

				}}

			}
			System.out.println("listee : " + liste + liste.get("j2"));

			s = "";

		}
		if (liste.get("j2") > 2) {
			setVisible(false);
			JOptionPane.showMessageDialog(null, "j2 win");
		} /*
			 * else { // while (this.liste.get(1)==1) //System.out.println("dcd : " +
			 * s_concat + "      " + this.liste.get(1)); setVisible(false);
			 * 
			 * // essai_game_jeu_fenetre qq = new essai_game_jeu_fenetre("j2 turn", liste);
			 * if (liste.get("j2")> 3) qq.setVisible(false);
			 * 
			 * }
			 */

		if (liste.get("j1") > 2) {
			setVisible(false);
			JOptionPane.showMessageDialog(null, "j1 win");
		}
		// System.out.println("dcd : " + s_concat + " " + this.liste.get(1) + 1);

		// q++;
		setVisible(false);

	}
	
}
