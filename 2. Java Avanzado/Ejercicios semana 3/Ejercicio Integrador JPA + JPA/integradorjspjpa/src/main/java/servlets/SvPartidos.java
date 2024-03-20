package servlets;

import hackaboss.integradorjspjpa.logica.Controladora;
import hackaboss.integradorjspjpa.logica.Equipo;
import hackaboss.integradorjspjpa.logica.Partido;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvPartidos", urlPatterns = {"/SvPartidos"})
public class SvPartidos extends HttpServlet {

    private Controladora controladora = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        List<Partido> partidos = controladora.obtenerTodosLosPartidos();

        request.setAttribute("partidos", partidos);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int idLocal = Integer.parseInt(request.getParameter("equipoLocal"));
            int idVisitante = Integer.parseInt(request.getParameter("equipoVisitante"));
            LocalDate fecha = LocalDate.parse(request.getParameter("fecha"));
            int resultadoLocal = Integer.parseInt(request.getParameter("resultadoLocal"));
            int resultadoVisitante = Integer.parseInt(request.getParameter("resultadoVisitante"));

            Partido partido = new Partido();

            partido.setFecha(fecha);
            partido.setResultadoLocal(resultadoLocal);
            partido.setResultadoVisitante(resultadoVisitante);

            Equipo equipoLocal = controladora.obtenerEquipoPorId(idLocal);
            Equipo equipoVisitante = controladora.obtenerEquipoPorId(idVisitante);

            partido.setEquipoLocal(equipoLocal);
            partido.setEquipoVisitante(equipoVisitante);

            controladora.crearPartido(partido);
            response.sendRedirect("index.jsp");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
