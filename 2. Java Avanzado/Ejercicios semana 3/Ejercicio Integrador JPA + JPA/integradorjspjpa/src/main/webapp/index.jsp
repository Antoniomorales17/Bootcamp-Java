<%@page import="hackaboss.integradorjspjpa.logica.Equipo"%>
<%@page import="hackaboss.integradorjspjpa.logica.Partido"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Torneo de Baloncesto</title>
        <!-- Incluir Tailwind CSS -->
        <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
    </head>
    <body class="bg-gray-100 p-4">
        <h1 class="text-3xl mb-6">Torneo de Baloncesto</h1>

        <!-- Botones para gestionar equipos -->
        <div class="mb-8">
            <!-- Mostrar Equipos -->
            <div class="mt-8">
                <h2 class="text-xl mb-2">Equipos</h2>
                <br>
                <form action="SvEquipos" method="GET">
                    <button type="submit" class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded">Mostrar</button>
                </form>
                <br>
                <% if (request.getAttribute("equipos") != null) { %>
                <div class="overflow-x-auto">
                    <table class="table-auto border-collapse border border-gray-400">
                        <thead class="bg-gray-200 text-gray-700">
                            <tr>
                                <th class="px-4 py-2">Id</th>
                                <th class="px-4 py-2">Nombre</th>
                            </tr>
                        </thead>
                        <tbody class="text-gray-700">
                            <% for (Equipo equipo : (List<Equipo>) request.getAttribute("equipos")) {%>
                            <tr>
                                <td class="border px-4 py-2"><%= equipo.getId()%></td>
                                <td class="border px-4 py-2"><%= equipo.getNombre()%></td>
                            </tr>
                            <% } %>
                        </tbody>
                    </table>
                </div>
                <% } %>
            </div>



            <form action="crearEquipo.jsp" method="get">
                <button type="submit" class="bg-green-500 hover:bg-green-700 text-white font-bold py-2 px-4 rounded">Crear Nuevo Equipo</button>
            </form>
        </div>

        <!-- Formulario para registrar partido -->
        <div>
            <h2 class="text-xl mb-2">Registrar Partido</h2>
            <form action="SvPartidos" method="post" class="max-w-xs">
                <div class="mb-4">
                    <label for="fecha" class="block text-gray-700 text-sm font-bold mb-2">Fecha del partido:</label>
                    <input type="date" id="fecha" name="fecha" required class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>

                <div class="mb-4">
                    <label for="equipoLocal" class="block text-gray-700 text-sm font-bold mb-2">ID 1:</label>
                    <input type="text" id="equipoLocal" name="equipoLocal" required class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>

                <div class="mb-4">
                    <label for="equipoVisitante" class="block text-gray-700 text-sm font-bold mb-2">ID 2:</label>
                    <input type="text" id="equipoVisitante" name="equipoVisitante" required class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>

                <div class="mb-4">
                    <label for="resultadoLocal" class="block text-gray-700 text-sm font-bold mb-2">Resultado Local:</label>
                    <input type="text" id="resultadoLocal" name="resultadoLocal" required class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>

                <div class="mb-4">
                    <label for="resultadoVisitante" class="block text-gray-700 text-sm font-bold mb-2">Resultado Visitante:</label>
                    <input type="text" id="resultadoVisitante" name="resultadoVisitante" required class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>

                <button type="submit" class="bg-indigo-500 hover:bg-indigo-700 text-white font-bold py-2 px-4 rounded">Registrar Partido</button>
            </form>
        </div>

        <!-- Resultados -->
        <div class="mt-8">
            <h2 class="text-xl mb-2">Resultados</h2>
            <br>
            <form action="SvPartidos" method="GET">
                <button type="submit" class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded">Mostrar</button>
            </form>
            <br>
            <% if (request.getAttribute("partidos") != null) { %>
            <div class="overflow-x-auto">
                <table class="table-auto border-collapse border border-gray-400">
                    <thead class="bg-gray-200 text-gray-700">
                        <tr>
                            <th class="px-4 py-2">Fecha</th>
                            <th class="px-4 py-2">Local</th>
                            <th class="px-4 py-2">Visitante</th>
                            <th class="px-4 py-2">Resultado</th>
                        </tr>
                    </thead>
                    <tbody class="text-gray-700">
                        <% for (Partido partido : (List<Partido>) request.getAttribute("partidos")) {%>
                        <tr>
                            <td class="border px-4 py-2"><%= partido.getFecha()%></td>
                            <td class="border px-4 py-2"><%= partido.getEquipoLocal().getNombre()%></td>
                            <td class="border px-4 py-2"><%= partido.getEquipoVisitante().getNombre()%></td>
                            <td class="border px-4 py-2"><%= partido.getResultadoLocal()%> - <%= partido.getResultadoVisitante()%></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
            </div>
            <% }%>
        </div>

    </body>
</html>
