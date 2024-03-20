package servlets;

import hackaboss.integradorjspjpa.logica.Controladora;
import hackaboss.integradorjspjpa.logica.Equipo;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvEquipos", urlPatterns = {"/SvEquipos"})
public class SvEquipos extends HttpServlet {

    private final Controladora controladora = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        // Obtener lista de equipos
        List<Equipo> equipos = controladora.obtenerTodosLosEquipos();

        // Enviar lista para mostrar
        request.setAttribute("equipos", equipos);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombreEquipo = request.getParameter("nombre");
        Equipo equipo = new Equipo();
        equipo.setNombre(nombreEquipo);

        controladora.crearEquipo(equipo);

        
        List<Equipo> equipos = controladora.obtenerTodosLosEquipos();

       
        request.setAttribute("equipos", equipos);
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
