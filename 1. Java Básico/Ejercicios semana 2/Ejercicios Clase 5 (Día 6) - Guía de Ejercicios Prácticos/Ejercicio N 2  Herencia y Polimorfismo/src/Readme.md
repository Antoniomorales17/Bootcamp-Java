#Ejercicio Nº 2 - Herencia y Polimorfismo - Individual

Crear una clase llamada Vestimenta con los atributos: código, nombre, precio, marca, talla y color (con sus métodos y constructores correspondientes).

a) Crear las siguientes clases hijas que compartan sus atributos y métodos:

Zapato: material, tipoCierre

Pantalon: estilo, tipoTejido

Camiseta: manga, cuello

Sombrero: tipo, tamaño

b) Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta y almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero (crear un objeto con parámetros para cada uno de ellos).

c) Crear los siguientes métodos (en cada subclase correspondiente):

Zapato: método para mostrar un mensaje en pantalla que diga "Estos zapatos son de marca: " (mostrar marca).

Pantalon: método para mostrar un mensaje en pantalla que diga "Estos pantalones son de marca: " (mostrar estilo).

Camiseta: método para mostrar un mensaje en pantalla que diga "Esta camiseta es de marca: " (mostrar manga).

Sombrero: método para mostrar un mensaje en pantalla que diga "Este sombrero es de marca: " (mostrar tipo).

d) Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.

PISTA: Todos tendrán el mismo método, con el mismo nombre, pero únicamente cambia el mensaje que muestran. Tener en cuenta para esto la implementación de herencia y sobrescritura de métodos.