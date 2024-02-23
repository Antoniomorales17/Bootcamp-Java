Ejercicio Nº 1 - Herencia, Polimorfismo y Encapsulamiento - Individual

Crear una clase "Animal" con los atributos: id, nombre, edad, tipo de piel y tipo de alimentación (con sus métodos y constructores correspondientes). Agregar también un método llamado saludar que emita un mensaje por pantalla que diga “Hola, soy un animal”. A partir de esto hacer lo siguientes pasos:

a) Crear sus clases hijas que compartan sus atributos y métodos:

"Mamífero" con atributos adicionales: número de patas, tipo de reproducción, color de pelaje, hábitat.

"Ave" con atributos adicionales: envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico.

"Reptil" con atributos adicionales: longitud, tipo de escamas, tipo de veneno, hábitat.

b)  Una vez creadas las clases, crear los siguientes métodos:

"Mamífero": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un mamífero".

"Ave": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un ave".

"Reptil": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un reptil".

c) En el método "main", crear un objeto de cada clase hija. Llamar a los 3 métodos saludar desde cada objeto.

d) Crear un objeto de tipo animal e intentar asignarle al Mamifero creado… ¿Qué sucede? ¿Es posible hacer esto? ¿Se aplica alguna propiedad para esto?

E) Cambiar el modificador de acceso de los métodos de "public" a "private". Intentar acceder desde el "main" a estos métodos. ¿Qué sucede? ¿Es posible hacer esto?