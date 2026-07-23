import java.util.Scanner;
import java.util.Stack;

public class SistemaCursos {
    private static ListaSimple listaSimple = new ListaSimple();
    private static ListaDoble listaDoble = new ListaDoble();
    private static Stack<String> historial = new Stack<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n===== SISTEMA DE GESTIÓN DE CURSOS UTC 2.0 =====");
            System.out.println("1. Agregar curso");
            System.out.println("2. Mostrar cursos");
            System.out.println("3. Buscar curso por clave");
            System.out.println("4. Eliminar curso");
            System.out.println("5. Inscribir estudiante a curso");
            System.out.println("6. Dar de baja estudiante de curso");
            System.out.println("7. Mostrar cursos de inicio a fin");
            System.out.println("8. Mostrar cursos de fin a inicio");
            System.out.println("9. Navegador de cursos");
            System.out.println("10. Contar cursos usando recursividad");
            System.out.println("11. Buscar curso usando recursividad");
            System.out.println("12. Mostrar historial de acciones");
            System.out.println("13. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1: agregarCurso(); break;
                case 2: listaSimple.mostrar(); break;
                case 3: buscarCurso(); break;
                case 4: eliminarCurso(); break;
                case 5: inscribirEstudiante(); break;
                case 6: darBajaEstudiante(); break;
                case 7: listaDoble.mostrarInicioFin(); break;
                case 8: listaDoble.mostrarFinInicio(); break;
                case 9: listaDoble.navegador(scanner); break;
                case 10: contarRecursivo(); break;
                case 11: buscarRecursivo(); break;
                case 12: mostrarHistorial(); break;
                case 13: System.out.println("Saliendo del sistema..."); break;
                default: System.out.println("Opción no válida.");
            }
        } while (opcion != 13);
    }

    private static void agregarCurso() {
        System.out.print("Clave: ");
        String clave = scanner.nextLine();

        if (listaSimple.buscar(clave) != null) {
            System.out.println("Error: Ya existe un curso con esa clave.");
            return;
        }

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Docente: ");
        String docente = scanner.nextLine();
        System.out.print("Cupo máximo: ");
        int cupo = scanner.nextInt();
        scanner.nextLine();

        Curso curso = new Curso(clave, nombre, docente, cupo);
        listaSimple.agregar(curso);
        listaDoble.agregarAlFinal(curso);
        historial.push("Se agregó el curso " + nombre);
        System.out.println("Curso agregado correctamente.");
    }

    private static void buscarCurso() {
        System.out.print("Ingrese la clave a buscar: ");
        String clave = scanner.nextLine();
        Curso curso = listaSimple.buscar(clave);

        if (curso != null) {
            System.out.println("Curso encontrado: " + curso);
        } else {
            System.out.println("Curso no encontrado.");
        }
    }

    private static void eliminarCurso() {
        System.out.print("Ingrese la clave del curso a eliminar: ");
        String clave = scanner.nextLine();
        Curso curso = listaSimple.buscar(clave);

        if (curso == null) {
            System.out.println("Error: El curso no existe.");
            return;
        }

        listaSimple.eliminar(clave);
        listaDoble.eliminar(clave);
        historial.push("Se eliminó el curso " + curso.getNombre());
        System.out.println("Curso eliminado del sistema.");
    }

    private static void inscribirEstudiante() {
        System.out.print("Ingrese la clave del curso: ");
        String clave = scanner.nextLine();
        Curso curso = listaSimple.buscar(clave);

        if (curso == null) {
            System.out.println("Curso no encontrado.");
            return;
        }

        if (curso.getNumeroInscritos() >= curso.getCupoMaximo()) {
            System.out.println("Error: El curso ya está lleno.");
            return;
        }

        curso.setNumeroInscritos(curso.getNumeroInscritos() + 1);
        historial.push("Se inscribió un estudiante en " + curso.getNombre());
        System.out.println("Estudiante inscrito con éxito.");
    }

    private static void darBajaEstudiante() {
        System.out.print("Ingrese la clave del curso: ");
        String clave = scanner.nextLine();
        Curso curso = listaSimple.buscar(clave);

        if (curso == null) {
            System.out.println("Curso no encontrado.");
            return;
        }

        if (curso.getNumeroInscritos() == 0) {
            System.out.println("Error: No hay estudiantes inscritos en este curso.");
            return;
        }

        curso.setNumeroInscritos(curso.getNumeroInscritos() - 1);
        historial.push("Se dio de baja un estudiante en " + curso.getNombre());
        System.out.println("Baja realizada con éxito.");
    }

    private static void contarRecursivo() {
        int total = listaSimple.contarRecursivo();
        System.out.println("Total de cursos (recursivo): " + total);
    }

    private static void buscarRecursivo() {
        System.out.print("Ingrese la clave a buscar: ");
        String clave = scanner.nextLine();
        Curso curso = listaSimple.buscarRecursivo(clave);

        if (curso != null) {
            System.out.println("Curso encontrado (recursivo): " + curso);
        } else {
            System.out.println("Curso no encontrado.");
        }
    }

    private static void mostrarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("El historial está vacío.");
            return;
        }
        System.out.println("\n--- HISTORIAL DE ACCIONES ---");
        @SuppressWarnings("unchecked")
        Stack<String> temp = (Stack<String>) historial.clone();
        while (!temp.isEmpty()) {
            System.out.println("- " + temp.pop());
        }
    }
}
