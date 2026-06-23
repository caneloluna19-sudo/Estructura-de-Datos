import java.util.LinkedList;
import java.util.Queue;

public class Filapersonas {
    public static void main(String[] args) {
        
        Queue<String> Fila = new LinkedList<>();

        Fila.offer("Juan");
        Fila.offer("Maria");
        Fila.offer("Carlos");
        Fila.offer("Ana");
        Fila.offer("Luis");

        System.out.println("Fila inicial: " + Fila);
        
        System.out.println("Persona al frente: " + Fila.peek());
        
        System.out.println("Atendiento a: " + Fila.poll());
        System.out.println("Atendiento a: " + Fila.poll());
        
        System.out.println("Fila restande: " + Fila);
    }
}