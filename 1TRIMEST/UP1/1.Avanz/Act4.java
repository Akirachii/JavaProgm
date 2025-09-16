// Pau Gra

import java.util.Scanner; 

public class Act4 {
    public static void main(String[] args) {
        //Llamada al scanner
        Scanner sc = new Scanner(System.in);
        //Introduccion a
        System.out.println("Introduce a: ");
        Double a = sc.nextDouble();
        //Introduccion b
        System.out.println("Introduce b: ");
        Double b = sc.nextDouble();
        //Introduccion c
        System.out.println("Introduce c: ");
        Double c = sc.nextDouble();
    
        double x1 = (-b + Math.sqrt(b*b -4 *a*c))/(2*a);
        double x2 = (-b - Math.sqrt(b*b -4 *a*c))/(2*a);
    
        System.out.println("Aqui tenemos ecuacion x1 " + x1 + " Aqui tenemos ecuacion x2 " + x2);
    
    
    }

}