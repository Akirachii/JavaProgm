// Pau Gra

import java.util.Scanner; 

public class Act3 {
    public static void main(String[] args) {
        //Llamada al scanner
        Scanner sc = new Scanner(System.in);
        //Introduccion el numero de ninyos
        System.out.println("Numero de alumnas: ");
        int chicas = sc.nextInt();
        //Introduccion de ninyas
        System.out.println("Numero de alumnos: ");
        int chicos = sc.nextInt();

        int total = chicos + chicas;
        int porc1 = (chicas*100)/total; 
        int porc2 = (chicos*100)/total;

        
        System.out.println("El porcentaje de chicas: " + porc1 + "%");
        System.out.println("El porcentaje de chicos: " + porc2 + "%");

    }    
}