//Pau Gra

import java.util.Scanner;

public class Act6 {
    public static void main(String[] args) {
        // Iniciar Scanner
        Scanner sc = new Scanner(System.in);
        //Pedir los datos
        System.out.println("Cuantos huevos caben en la cazuela :");
        int capacidad = sc.nextInt();
        System.out.println("Cuantos huevos quieres cocer: ");
        int huevos = sc.nextInt();

        //Calculamos el numero de tandas ----- uso el math.ceil para redondear hacia arriba, si la division da 2.3 serian 3 no 2, asi no sobra
        int tandas = (int) Math.ceil((double)huevos/capacidad);

        //Calculamos el tiempo total
        int tiempoTotal = tandas * 10;



        //          En caso de no saber usar el math.ceil se puede hacer de esta otra manera:
            int tiemporeal = ((huevos+capacidad-1)/capacidad);
            System.out.println(tiemporeal);
         //
    
        System.out.println("Te costara : " + tiempoTotal + " minutos cocer todos los huevos");
        sc.close();
    }
}