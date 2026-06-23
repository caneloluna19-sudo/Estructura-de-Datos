import java.util.Scanner;
public class primo {
 public static void main(String[] args) {
     Scanner leer =new Scanner(System.in);

     int numero ;
     Boolean esPrimo=true;

     System.out.print("ingrese un numero: ");
     numero=leer.nextInt();

     if (numero <=1){
        esPrimo = false;
     } else{
        for (int i=2; i <numero; i++) {
            if (numero % i ==0){
                esPrimo=false;
                break;

            }
            
        }

     }
     if(esPrimo){
         System.out.print("el numero es primo");
     }else{
         System.out.print("elnumero no es primo");
     }

 }   
}
