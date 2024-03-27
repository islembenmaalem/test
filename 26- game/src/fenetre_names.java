import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.awt.Toolkit;
import java.awt.event.*;

/**
 *
 * @author Islem
 */
public class fenetre_names extends javax.swing.JFrame implements ActionListener {

	/**
	 * Creates new form NewJFrame
	 */
	// Variables declaration - do not modify
	private javax.swing.JButton btt;
	private javax.swing.JLabel jLabel1,jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JLabel nom1;
	private javax.swing.JLabel nom2;
	private javax.swing.JTextField txt_nom1;
	private javax.swing.JTextField txt_nom2;

	// End of variables declaration
	@SuppressWarnings("unchecked")
	public fenetre_names() {
		setBounds(300, 90, 900, 670);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		jLabel2 = new javax.swing.JLabel();
		jPanel9 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jPanel5 = new javax.swing.JPanel();
		jPanel4 = new javax.swing.JPanel();
		nom1 = new javax.swing.JLabel();
		txt_nom1 = new javax.swing.JTextField();
		jPanel8 = new javax.swing.JPanel();
		jPanel7 = new javax.swing.JPanel();
		nom2 = new javax.swing.JLabel();
		txt_nom2 = new javax.swing.JTextField();
		jPanel3 = new javax.swing.JPanel();
		jPanel6 = new javax.swing.JPanel();
		btt = new javax.swing.JButton();

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));
		jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Game Guessing");
		getContentPane().setLayout(new java.awt.GridLayout(5, 1));

		jPanel2.setBackground(new java.awt.Color(204, 204, 255));
		jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

		jLabel1.setFont(new java.awt.Font("Sitka Small", 3, 48)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(204, 0, 0));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("GAME");
		jPanel2.add(jLabel1);

		getContentPane().add(jPanel2);

		jPanel1.setBackground(new java.awt.Color(204, 204, 255));
		

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("z.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(794, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(27, Short.MAX_VALUE))
        );

		

	
		getContentPane().add(jPanel1);

		jPanel5.setBackground(new java.awt.Color(204, 204, 255));
		jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Players Name",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(204, 0, 204))); // NOI18N
		jPanel5.setLayout(new java.awt.GridLayout(2, 4));

		jPanel4.setBackground(new java.awt.Color(204, 204, 255));

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 189, Short.MAX_VALUE));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 22, Short.MAX_VALUE));

		jPanel5.add(jPanel4);

		nom1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		nom1.setText("Player 1 :");
		jPanel5.add(nom1);
		jPanel5.add(txt_nom1);

		jPanel8.setBackground(new java.awt.Color(204, 204, 255));

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 189, Short.MAX_VALUE));
		jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 22, Short.MAX_VALUE));

		jPanel5.add(jPanel8);

		jPanel7.setBackground(new java.awt.Color(204, 204, 255));

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 189, Short.MAX_VALUE));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 22, Short.MAX_VALUE));

		jPanel5.add(jPanel7);

		nom2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		nom2.setText("Player 2 :");
		jPanel5.add(nom2);
		jPanel5.add(txt_nom2);

		getContentPane().add(jPanel5);
		jPanel5.getAccessibleContext().setAccessibleName("");

		jPanel3.setBackground(new java.awt.Color(204, 204, 255));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 771, Short.MAX_VALUE));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 75, Short.MAX_VALUE));

		getContentPane().add(jPanel3);

		jPanel6.setBackground(new java.awt.Color(204, 204, 255));
		btt.setBackground(new java.awt.Color(204, 204, 255));
		btt.setFont(new java.awt.Font("Tahoma", 0, 18));
		//btt.setIcon(new javax.swing.ImageIcon(getClass().getResource("ss.png")));
        btt.setIcon(new javax.swing.ImageIcon(getClass().getResource("ss.png"))); // NOI18N
// NOI18N
		btt.setText("Suivant");
		btt.addActionListener(this);
		jPanel6.add(btt);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));

		getContentPane().add(jPanel6);
		liste=new HashMap<String,Integer>();
		setVisible(true);
	}// </editor-fold>

	/**
	 * @param args the command line arguments
	 */
	HashMap<String,Integer>liste ;
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btt) {
			if (txt_nom1.getText().equals("") || txt_nom2.getText().equals(""))
				JOptionPane.showMessageDialog(null, "fill the name please");
			else {
				Joueur j1=new Joueur(txt_nom1.getText());
				Joueur j2=new Joueur(txt_nom2.getText());
				liste.put("j1", j1.getScore());
				liste.put("j2", j2.getScore());
				System.out.println(liste);
				String data = " Nom : " + txt_nom1.getText() + "\n" + " Prenom : " + txt_nom2.getText() + "\n";
				System.out.println(data);
				setVisible(false);
				new jamila("j1 turn",liste,0);//battouna_jamila("j1 turn",liste,0);

			}

		}
	
	}
	public String getNom1() {
		return txt_nom1.getText();
	}	
	public String getNom2() {
		return txt_nom2.getText();
	}
	public HashMap getListe0() {
		Joueur j1=new Joueur(txt_nom1.getText());
		Joueur j2=new Joueur(txt_nom2.getText());
		HashMap<String,Integer> liste=new HashMap<String,Integer>();
		liste.put("j1", j1.getScore());
		liste.put("j2", j2.getScore());
		return liste;
	}

}