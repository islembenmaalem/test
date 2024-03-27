import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

final class jamila extends JFrame implements ActionListener {
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
	int paire;
	 ImageIcon icon;

	jamila(String titre, HashMap<String, Integer> liste, int pa) {
		paire = pa;
		
		
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
		JPanel pan2 = new JPanel() ;
		
		    
		    
		
		
		
		l = new ArrayList<Object>();
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
			l1.get(0).requestFocus();
			for (i = 0; i < l1.size() - 1; i++) {
				l1.get(i).addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent EVT) {
						if ((EVT.getKeyChar() >= 'a' && EVT.getKeyChar() <= 'z')
								|| (EVT.getKeyChar() >= '0' && EVT.getKeyChar() <= '9')) {
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
			
			this.getContentPane().add(pan2, BorderLayout.SOUTH);
			b = new JButton("ok");
			b.addActionListener(this);
			pan2.add(b);
			this.getContentPane().add(b, BorderLayout.NORTH);
			l1.get(0).requestFocus();
			addWindowListener(new WindowAdapter() {
				@Override
				public void windowActivated(WindowEvent e) {
					if (isVisible()) {
						try {
							l1.get(0).requestFocus();
						} catch (Exception e1) {
						}
					}
				}
			});
		} catch (XPathExpressionException | SAXException | IOException | ParserConfigurationException e) {
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
					essai_game_jeu_fenetre qq = new essai_game_jeu_fenetre("j2 turn", liste, 1);
					System.out.println("count paire j1 : " + paire);
				} else {
					if (paire % 2 != 0) {
						liste.put("j2", liste.get("j2") + 1);
						System.out.println("count paire j2 : " + paire);
						essai_game_jeu_fenetre qq = new essai_game_jeu_fenetre("j1 turn", liste, 2);
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "Non");
				System.out.println("listee : " + liste + "  " + liste.get("j2"));
				if (paire % 2 == 0) {
					essai_game_jeu_fenetre qq = new essai_game_jeu_fenetre("j2 turn", liste, 1);
				} else {
					if (paire % 2 != 0) {
						essai_game_jeu_fenetre qq = new essai_game_jeu_fenetre("j1 turn", liste, 2);
					}
				}
			}
			System.out.println("listee : " + liste + liste.get("j2"));
			s = "";
		}
		if (liste.get("j2") > 2) {
			setVisible(false);
			JOptionPane.showMessageDialog(null, "j2 win");
		}
		if (liste.get("j1") > 2) {
			setVisible(false);
			JOptionPane.showMessageDialog(null, "j1 win");
		}
		setVisible(false);
	}

}
