public class factorial {
    public static long factorial(int n){
        long resultado = 1;
     
        for(int i= 1; i<= n; i++){
            resultado *=i;
        }
        return  resultado;
    }
    public static void main(String[] args) {
        System.out.println("factorial de 5:" + factorial(5));
    }
}