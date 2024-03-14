public class OrganizadorTareas {
    public static void main(String[] args) {
        // Crear tareas principales
        Tarea proyecto = new Tarea("Proyecto: Desarrollo de Software");

        // Agregar subtareas al proyecto
        Tarea tareaPrincipal1 = new Tarea("Tarea Principal: Diseño de la Aplicación");
        Tarea tareaPrincipal2 = new Tarea("Tarea Principal: Implementación del Código");
        Tarea tareaPrincipal3 = new Tarea("Tarea Principal: Pruebas y Depuración");

        proyecto.agregarSubTareas(tareaPrincipal1);
        proyecto.agregarSubTareas(tareaPrincipal2);
        proyecto.agregarSubTareas(tareaPrincipal3);

        // Agregar subtareas a Diseño de la Aplicación
        Tarea subTarea1_1 = new Tarea("Subtarea: Crear Prototipo");
        Tarea subTarea1_2 = new Tarea("Subtarea: Diseñar Interfaz");
        Tarea subTarea1_2_1 = new Tarea("Sub-subtarea: Definir Esquema de Colores");
        Tarea subTarea1_2_2 = new Tarea("Sub-subtarea: Diseñar Diseño Responsivo");
        Tarea subTarea1_3 = new Tarea("Subtarea: Documentar Requisitos");

        tareaPrincipal1.agregarSubTareas(subTarea1_1);
        tareaPrincipal1.agregarSubTareas(subTarea1_2);
        tareaPrincipal1.agregarSubTareas(subTarea1_3);

        subTarea1_2.agregarSubTareas(subTarea1_2_1);
        subTarea1_2.agregarSubTareas(subTarea1_2_2);

        // Agregar subtareas a Implementación del Código
        Tarea subTarea2_1 = new Tarea("Subtarea: Desarrollar Backend");
        Tarea subTarea2_1_1 = new Tarea("Sub-subtarea: Configurar Base de Datos");
        Tarea subTarea2_1_2 = new Tarea("Sub-subtarea: Crear Lógica de Negocios");
        Tarea subTarea2_2 = new Tarea("Subtarea: Desarrollar Frontend");
        Tarea subTarea2_2_1 = new Tarea("Sub-subtarea: Codificar Interfaz de Usuario");
        Tarea subTarea2_2_2 = new Tarea("Sub-subtarea: Integrar con Backend");

        tareaPrincipal2.agregarSubTareas(subTarea2_1);
        tareaPrincipal2.agregarSubTareas(subTarea2_2);

        subTarea2_1.agregarSubTareas(subTarea2_1_1);
        subTarea2_1.agregarSubTareas(subTarea2_1_2);

        subTarea2_2.agregarSubTareas(subTarea2_2_1);
        subTarea2_2.agregarSubTareas(subTarea2_2_2);

        // Agregar subtareas a Pruebas y Depuración
        Tarea subTarea3_1 = new Tarea("Subtarea: Ejecutar Pruebas de Integración");
        Tarea subTarea3_2 = new Tarea("Subtarea: Solucionar Errores");

        tareaPrincipal3.agregarSubTareas(subTarea3_1);
        tareaPrincipal3.agregarSubTareas(subTarea3_2);

        // Mostrar estructura de tareas con arte ASCII
        System.out.println("Estructura de tareas:");
        proyecto.mostrarTareas(0);
    }
}