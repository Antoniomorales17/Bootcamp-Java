import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class JBDC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/universidad"; // URL de la base de datos "clinica"
        String usuario = "root"; // Nombre de usuario de la base de datos (por defecto en XAMPP es 'root')
        String contraseña = ""; // Contraseña de la base de datos (en XAMPP por defecto no hay contraseña para 'root')


        //utilizamos excepciones para manejar posibles errores de conexión.
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            String sql = "SELECT * FROM estudiantes"; // Cambia el nombre de la tabla a "pacientes"
            ResultSet resultado = statement.executeQuery(sql);

            // Procesa los resultados
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                int edad = resultado.getInt("edad");
                double calificacion = resultado.getDouble("calificacion");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Calificacion: " + calificacion);
            }

            // Cierra la conexión y recursos
            resultado.close();
            statement.close();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}