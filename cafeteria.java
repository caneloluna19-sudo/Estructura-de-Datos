import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class cafeteria {
    public static void main(String[] args) {

        Queue<String> colaClientes = new LinkedList<>();
        Stack<String> pedidosCancelados = new Stack<>();

        Scanner sc = new Scanner(System.in);
        int opcion;
        String nombre;

        do {
            System.out.println("\n=== MENÚ CAFETERÍA ===");
            System.out.println("1. Llegar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Cancelar pedido");
            System.out.println("4. Mostrar cola");
            System.out.println("5. Mostrar cancelaciones");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre del cliente: ");
                    nombre = sc.nextLine();

                    colaClientes.offer(nombre);
                    System.out.println(nombre + " se agregó a la cola.");
                    break;

                case 2:
                    if (!colaClientes.isEmpty()) {
                        System.out.println("Atendiendo a: " + colaClientes.poll());
                    } else {
                        System.out.println("No hay clientes en espera.");
                    }
                    break;

                case 3:
                    System.out.print("Nombre del pedido cancelado: ");
                    nombre = sc.nextLine();

                    pedidosCancelados.push(nombre);
                    System.out.println("Pedido cancelado registrado.");
                    break;

                case 4:
                    System.out.println("Cola de clientes: " + colaClientes);
                    break;

                case 5:
                    System.out.println("Pedidos cancelados: " + pedidosCancelados);
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 6);

        sc.close();
    }
}