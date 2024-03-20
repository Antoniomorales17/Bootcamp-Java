<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados de la votación</title>

        <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
    </head>
    <body class="p-5">

        <h1 class="text-2xl mb-5">Resultados de la votación</h1>


        <table class="bg-blue-500 rounded-lg overflow-hidden">
            <thead>
                <tr class="bg-gray-200">
                    <th class="border border-blue-800 px-4 py-2">Partido</th>
                    <th class="border border-blue-800 px-4 py-2">Votos</th>
                </tr>
            </thead>
            <tbody>
                <%
                    Map<String, Integer> resultados = (Map<String, Integer>) request.getAttribute("resultados");
                    if (resultados != null) {
                        for (Map.Entry<String, Integer> entry : resultados.entrySet()) {
                            String partido = entry.getKey();
                            int votos = entry.getValue();
                %>
                <tr class="bg-gray-100">
                    <td class="border border-gray-800 px-4 py-2"><%= partido%></td>
                    <td class="border border-gray-800 px-4 py-2"><%= votos%></td>
                </tr>
                <%
                        }
                    }
                %>
            </tbody>
        </table>
    </body>
</html>
