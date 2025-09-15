// Pau Gra

import java.util.Scanner; 

public class Act1 {
    public static void main(String[] args) {
        // Llamada del Scanner
        Scanner sc = new Scanner(System.in);
            //Introduccion del numero 1
            System.out.println("Introduce num1 : ");
            double num1 = sc.nextDouble();
            //Introduccion del numero 2
            System.out.println("Introduce num2 : ");
            double num2 = sc.nextDouble();
            //Echo y calculo
            System.out.println("La variable aritmetica es : " + (num1 + num2 )/2);

        sc.close();
    }   
}