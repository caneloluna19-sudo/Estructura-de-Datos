public class reto17 {
  
    public static void main(String[] args) {
        // Declaración de variables para los dos números enteros
        int n = 17;
        int m = 5;

        // Cálculo del cociente y el residuo
        int c = n / m; // Al ser tipo 'int', la división es entera automáticamente
        int r = n % m; // Operador módulo para obtener el residuo

        // Mostrar el resultado por pantalla
        System.out.println(n + " entre " + m + " da un cociente " + c + " y un residuo " + r + ".");
    }
}

