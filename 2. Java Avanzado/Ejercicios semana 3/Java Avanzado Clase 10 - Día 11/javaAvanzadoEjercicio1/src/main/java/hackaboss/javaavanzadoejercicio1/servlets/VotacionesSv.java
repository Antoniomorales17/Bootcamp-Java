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
        // Verificar si se solicitó mostrar los resultados
        String action = request.getParameter("action");
        if ("mostrarResultados".equals(action)) {
            // Obtener resultados y enviarlos a la página JSP
            Map<String, Integer> resultados = controladora.obtenerResultados();
            request.setAttribute("resultados", resultados);
            request.getRequestDispatcher("resultados.jsp").forward(request, response);
        } else {
            // Si no se solicitó mostrar resultados, redirigir a la página de inicio
            response.sendRedirect("index.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener el voto seleccionado y guardarlo
        String opcionVoto = request.getParameter("voto");
        controladora.guardarVoto(opcionVoto);

        // Redirigir de nuevo a la página de votación
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Servlet para gestionar las votaciones";
    }
}
