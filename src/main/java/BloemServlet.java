import be.ucll.abdulhannan_rojeeh.domain.db.BloemDB;
import be.ucll.abdulhannan_rojeeh.domain.model.Bloem;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "BloemServlet", value = "/BloemServlet")
public class BloemServlet extends HttpServlet {
    private BloemDB bloemDB = new BloemDB();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String naam = request.getParameter("fname");
        String kleur = request.getParameter("fcolor");
        int aantal = Integer.parseInt("flower");
        Bloem bloem = new Bloem(naam,kleur,aantal);
        request.setAttribute("Bloemen",bloemDB.getBloemen());

        RequestDispatcher view = request.getRequestDispatcher("overzicht.jsp");
        view.forward(request,response);

    }



}
