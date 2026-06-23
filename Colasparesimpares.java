import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Colasparesimpares {
    public static void main(String[] args) {

        Queue<Integer> cola = new LinkedList<>();
        Queue<Integer> colapares = new LinkedList<>(); 
        Queue<Integer> colaimpares = new LinkedList<>();

        Random random = new Random ();

        for (int i = 0; i < 20; i++) {
            int numero = random.nextInt(100) + 1;
            cola.offer(numero);

            if (numero % 2 == 0) {
                colapares.offer(numero);
            } else {
                colaimpares.offer(numero);
            }
        } 

        System.out.println("Cola original: ");
        System.out.println(cola);

        System.out.println("\nCola de numeros pares:");
        System.out.println(colapares);

        System.out.println("\nCola de numeros impares");
        System.out.println(colaimpares);
    }
}
