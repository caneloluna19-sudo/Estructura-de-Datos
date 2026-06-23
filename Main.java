import java.util.Scanner;

public class Main {

    // Función con IVA por defecto del 21%
    public static double calcularFactura(double cantidad) {
        return cantidad * 1.21;
    }

    // Función con IVA personalizado
    public static double calcularFactura(double cantidad, double iva) {
        return cantidad + (cantidad * iva / 100);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el importe sin IVA: ");
        double cantidad = teclado.nextDouble();

        System.out.print("Ingrese el porcentaje de IVA (0 para usar 21%): ");
        double iva = teclado.nextDouble();

        double total;

        if (iva == 0) {
            total = calcularFactura(cantidad);
        } else {
            total = calcularFactura(cantidad, iva);
        }

        System.out.println("Total de la factura: $" + total);

        teclado.close();
    }
}