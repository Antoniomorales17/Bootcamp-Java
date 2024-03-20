<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Nuevo Equipo</title>
        <!-- Incluir Tailwind CSS -->
        <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
    </head>
    <body class="bg-gray-100 p-4">
        <h1 class="text-3xl mb-6">Crear Nuevo Equipo</h1>

        <!-- Formulario para crear un nuevo equipo -->
        <form action="SvEquipos" method="post" class="max-w-xs">
            <div class="mb-4">
                <label for="nombre" class="block text-gray-700 text-sm font-bold mb-2">Nombre del equipo:</label>
                <input type="text" id="nombre" name="nombre" required class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
            </div>

            <div class="mb-4">
                <label for="ciudad" class="block text-gray-700 text-sm font-bold mb-2">Ciudad:</label>
                <input type="text" id="ciudad" name="ciudad" required class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
            </div>

            <button type="submit" class="bg-green-500 hover:bg-green-700 text-white font-bold py-2 px-4 rounded">Crear Equipo</button>
        </form>
    </body>
</html>
