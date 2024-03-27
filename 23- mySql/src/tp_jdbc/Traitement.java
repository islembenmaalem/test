package tp_jdbc;

import java.sql.*;
import java.util.ArrayList;

public class Traitement {
    public ArrayList<Produit> getAllProduits() {
    	ArrayList<Produit> listProduit = new ArrayList<>();
	     final String SELECT_ALL = "select * from produit";
        try {
        	Connect Connexion = new Connect();
			Connection con = Connexion.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SELECT_ALL);
            while (rs.next()) {
                Produit p = new Produit(rs.getInt(1), rs.getString(2), rs.getFloat(3));
                listProduit.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listProduit;
    }
	Produit save(Produit p) {
		try {
			Connect Connexion = new Connect();
			Connection con = Connexion.getConnection();
			int id = p.getId();
			String li = p.getLibelle();
			double prix = p.getPrix();
			String req = "INSERT INTO `produit`(`id`, `libelle`, `prix`) VALUES ("+id+",'" + li + "'," + prix + ")";
			PreparedStatement st = con.prepareStatement(req);
			st.execute();
			/* 			PreparedStatement st = con.prepareStatement("INSERT INTO `produit` VALUES (?,?,?));
			 * st.setInt(1,id);
			 * st.setString(2,li);
			 * st.setDouble(3,prix);
			 */
			System.out.println("produit ajouté");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	ArrayList<Produit> produitsParMC(String mc) {
		ArrayList<Produit> l = new ArrayList<Produit>();
		Connect Connexion = new Connect();
		Connection con = Connexion.getConnection();
		//String req = "SELECT * FROM `produit` WHERE"+ mc+"==libelle";
		

		//Statement st;
		try {
			PreparedStatement recherchePersonne = con.prepareStatement("SELECT * FROM `produit` WHERE libelle='"+mc+"'");
			//recherchePersonne.setString(1, mc);
			ResultSet resultats = recherchePersonne.executeQuery();

			//st = con.createStatement();
			//ResultSet res = st.executeQuery(req);
			while (resultats.next()) {
				Produit p = new Produit();
				p.setId(resultats.getInt(1));
				p.setLibelle(resultats.getString(2));
				p.setPrix(resultats.getDouble(3));
				l.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	Produit getProduit(int i) {
		String req = "SELECT * FROM `produit`  WHERE id="+i;
		Connect Connexion = new Connect();
		Connection con = Connexion.getConnection();
		Statement st;
		Produit p = new Produit();
		try {
			st = con.createStatement();
			ResultSet res = st.executeQuery(req);
			while (res.next()) {
				p.setId(res.getInt(1));
				p.setLibelle(res.getString(2));
				p.setPrix(res.getDouble(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	void updateProduit(Produit p) {
		int d = p.getId();
		String l = p.getLibelle();
		double pi = p.getPrix();
		Connect Connexion = new Connect();
		Connection con = Connexion.getConnection();
		String req = "UPDATE `produit` SET `libelle`=l,`prix`=pi WHERE `id`==d";
		Statement st;
		try {
			st = con.createStatement();
			ResultSet res = st.executeQuery(req);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
    public void deleteProduit(int id){
	    final String DELETE_PRODUCT = "delete from produit where id = ?";
        try {
        	Connect Connexion = new Connect();
			Connection con = Connexion.getConnection();
            PreparedStatement pd = con.prepareStatement(DELETE_PRODUCT);
            pd.setInt(1, id);
            pd.executeUpdate();
			System.out.println("produit supprimé");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
