package hackaboss.javaavanzadoejercicio1.servlets;

import hackaboss.javaavanzadoejercicio1.logica.Controladora;
import java.io.IOException;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "VotacionesSv", urlPatterns = {"/VotacionesSv"})
public class VotacionesSv extends HttpServlet {

    private Controladora controladora = new Controladora();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        if ("mostrarResultados".equals(action)) {

            Map<String, Integer> resultados = controladora.obtenerResultados();
            request.setAttribute("resultados", resultados);
            request.getRequestDispatcher("resultados.jsp").forward(request, response);
        } else {

            response.sendRedirect("index.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String opcionVoto = request.getParameter("voto");
        controladora.guardarVoto(opcionVoto);

        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Servlet para gestionar las votaciones";
    }
}
