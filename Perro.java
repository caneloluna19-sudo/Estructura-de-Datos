public class Perro {

    // Atributos
    String nombre;
    String raza;
    int edad;

    // Constructor
    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    // Método ladrar
    public void ladrar() {
        System.out.println(nombre + " dice: ¡Guau, guau!");
    }

    // Método presentarse
    public void presentarse() {
        System.out.println("Hola, soy " + nombre +
                           ", soy de raza " + raza +
                           " y tengo " + edad + " años.");
    }

    // Método principal
    public static void main(String[] args) {

        Perro perro1 = new Perro("Cuqui", "Meztiso", 6);

        perro1.presentarse();
        perro1.ladrar();
    }
}