public class Fibonacci {
 
    public static void main(String[] args) {
        
        int a = 0;
        int b = 1;
        int siguente;

        for (int i = 1; i <= 50; i++) {
            System.out.println(a);

            siguente = a + b;
            a = b;
            b = siguente; 
        }
    
    }
}
