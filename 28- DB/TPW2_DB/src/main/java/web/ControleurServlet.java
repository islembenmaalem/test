package web;

import java.io.IOException;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.ImetierCatalogue;
import metier.MetierImpl;
import metier.Produit;

@WebServlet(name = "cs", urlPatterns = { "/*.do" })
public class ControleurServlet extends HttpServlet {
	private ImetierCatalogue metier;

	@Override
	public void init() throws ServletException {
		metier = new MetierImpl();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();
		if (path.equals("/chercher.do")) {

			String mc = request.getParameter("motCle");
			ProduitModele mod = new ProduitModele();
			mod.setMotCle(mc);
			List<Produit> prods = metier.getProduitsParMotCle(mc);
			mod.setProduits(prods);
			request.setAttribute("modele", mod);// apporter request expression language definina get so ilawej aliha
												// wahdo modele.motcle fil jsp
			request.getRequestDispatcher("ProduitsView.jsp").forward(request, response);
		} else if (path.equals("/save.do")) {
			String nomprod = request.getParameter("nom");
			double prix = Double.parseDouble(request.getParameter("prix"));
			metier.addProduit(new Produit(nomprod, prix));
			request.getRequestDispatcher("comfirmation.jsp").forward(request, response);

		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Appel de la méthode doPost pour gérer la requête GET
		String path = request.getServletPath();
		if (path.equals("/saisie.do") || path.equals("/save.do")) {
			request.getRequestDispatcher("saisieProduit.jsp").forward(request, response);
		} else if (path.equals("/chercher.do") || path.equals("/index.do")) {
			request.getRequestDispatcher("ProduitsView.jsp").forward(request, response);
		}

	}
}
/*
 * @Override public void init() throws ServletException { metier = new
 * MetierImpl(); }
 * 
 * @Override protected void doPost(HttpServletRequest request,
 * HttpServletResponse response) throws ServletException, IOException { String
 * mc = request.getParameter("motCle"); ProduitModele mod = new ProduitModele();
 * mod.setMotCle(mc); List<Produit> prods = metier.getProduitsParMotCle(mc);
 * mod.setProduits(prods); request.setAttribute("modele", mod);
 * request.getRequestDispatcher("ProduitsView.jsp").forward(request, response);
 * }
 * 
 * @Override protected void doGet(HttpServletRequest request,
 * HttpServletResponse response) throws ServletException, IOException { // Appel
 * de la méthode doPost pour gérer la requête GET doPost(request, response); }
 */
