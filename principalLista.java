import java.util.Scanner;

public class principalLista {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();

        int opcion;
        String dato, datoNuevo;

        do {
            System.out.println("\n=== MENÚ LISTA ENLAZADA ===");
            System.out.println("1. Agregar nodo al inicio");
            System.out.println("2. Agregar nodo al final");
            System.out.println("3. Eliminar nodo");
            System.out.println("4. Buscar nodo");
            System.out.println("5. Actualizar nodo");
            System.out.println("6. Mostrar lista");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar el búfer

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el dato: ");
                    dato = teclado.nextLine();
                    lista.agregarNodoInicio(dato);
                    System.out.println("Nodo agregado al inicio.");
                    break;

                case 2:
                    System.out.print("Ingrese el dato: ");
                    dato = teclado.nextLine();
                    lista.agregarFinal(dato);
                    System.out.println("Nodo agregado al final.");
                    break;

                case 3:
                    System.out.print("Ingrese el dato a eliminar: ");
                    dato = teclado.nextLine();

                    if (lista.eliminarNodo(dato)) {
                        System.out.println("Nodo eliminado.");
                    } else {
                        System.out.println("Nodo no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el dato a buscar: ");
                    dato = teclado.nextLine();

                    if (lista.buscarNodo(dato)) {
                        System.out.println("El nodo sí existe.");
                    } else {
                        System.out.println("El nodo no existe.");
                    }
                    break;

                case 5:
                    System.out.print("Dato a actualizar: ");
                    dato = teclado.nextLine();

                    System.out.print("Nuevo dato: ");
                    datoNuevo = teclado.nextLine();

                    if (lista.actualizarNodo(dato, datoNuevo)) {
                        System.out.println("Nodo actualizado.");
                    } else {
                        System.out.println("Nodo no encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("\nContenido de la lista:");
                    lista.recorrido();
                    break;

                case 7:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 7);

        teclado.close();
    }
}