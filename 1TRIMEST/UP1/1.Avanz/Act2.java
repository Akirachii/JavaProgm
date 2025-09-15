// Pau Gra

import java.util.Scanner; 

public class Act2 {
    public static void main(String[] args) {
        //LLamada al Scanner
        Scanner sc = new Scanner(System.in);
        //Introduccion del peso
        System.out.println("Peso en kg: ");
        double kg = sc.nextDouble();
        //Introduccion de la altura
        System.out.println("Altura en metros: ");
        double m = sc.nextDouble();
        //Calculo y sacada a pantalla
        System.out.println("Tu indice de masa corporal es: " + (kg / (m * m)));
    }
}