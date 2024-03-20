<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Votación</title>
        <!-- Agrega el enlace al archivo de estilos de Tailwind CSS -->
        <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
    </head>
    <body class="p-5">
        <!-- Encabezado -->
        <h1 class="text-2xl mb-5">Seleccione su opción de voto:</h1>

        <!-- Formulario de votación -->
        <form action="VotacionesSv" method="post" class="mb-5">
            <input type="radio" name="voto" value="opcion1" class="mr-2">
            <label class="mr-5">Opción 1</label>
            <input type="radio" name="voto" value="opcion2" class="mr-2">
            <label class="mr-5">Opción 2</label>
            <input type="radio" name="voto" value="opcion3" class="mr-2">
            <label class="mr-5">Opción 3</label>
            <input type="submit" value="Votar" class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded">
        </form>

        <!-- Botón para mostrar resultados -->
        <form action="VotacionesSv" method="get">
            <input type="hidden" name="action" value="mostrarResultados">
            <input type="submit" value="Mostrar resultados" class="bg-gray-300 hover:bg-gray-400 text-gray-800 font-bold py-2 px-4 rounded">
        </form>
    </body>
</html>