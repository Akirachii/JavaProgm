// Pau Gra

import java.util.Scanner; 

public class Act1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Introduce num1 : ");
            double num1 = sc.nextDouble();

            System.out.println("Introduce num2 : ");
            double num2 = sc.nextDouble();

            System.out.println("La variable aritmetica es : " + (num1 + num2 )/2);

        sc.close();
    }   
}