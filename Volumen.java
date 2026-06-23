public class Volumen {
    
    public static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double volumenCilindro(double radio, double altura) {
        return areaCirculo(radio) * altura; 
    }

    public static void main(String[] args) {
        double radio = 3;
        double altura = 5;

        System.out.println("Area del circulo: " + areaCirculo(radio));
        System.out.println("Volumen del cilindro: " + volumenCilindro(radio, altura));
    }
}