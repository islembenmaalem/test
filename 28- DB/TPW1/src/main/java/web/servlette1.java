package web; 

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet; 
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import metier.CreditMetierImp;
import metier.ICreditMetier;

@WebServlet (name="cs",urlPatterns= {"/credit","/calcul"}) 
public class servlette1 extends HttpServlet {
    ICreditMetier metier;

    @Override
    public void init() throws ServletException {
        metier = new CreditMetierImp();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        CreditModel model = new CreditModel();
        request.setAttribute("resultat", model);
        request.getRequestDispatcher("vuejsp.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        double m = Double.parseDouble(req.getParameter("montant"));
        int d = Integer.parseInt(req.getParameter("duree"));
        double t = Double.parseDouble(req.getParameter("taux"));
        CreditModel model = new CreditModel();
        model.setDuree(d);
        model.setMontant(metier.calculeMensu(m, t, d));
        model.setTaux(t);
        model.setCap(m);
        req.setAttribute("resultat", model);
        req.getRequestDispatcher("vuejsp.jsp").forward(req, resp);
    }
}
