// Pau Gra

import java.util.Scanner;

public class Act5 {
    public static void main(String[] args) {
        //Llamada al scanner
        Scanner sc = new Scanner(System.in);
        // Lee cantdad de insectos
        System.out.println("cantdad de insectos");
        int ins = sc.nextInt();
        // Lee cantdad de aracnidos
        System.out.println("cantdad de aracnidos");
        int arac = sc.nextInt();
        // Lee cantdad de crustaceos
        System.out.println("cantdad de crustaceos");
        int crus = sc.nextInt();
        // Lee cantdad de ciempies
        System.out.println("cantdad de ciempies");
        int ciem = sc.nextInt();
        // Lee cantdad de secciones de ciempies
        System.out.println("cantdad de secciones");
        int secc1 = sc.nextInt();
        //Lee cantidad de milpies
        System.out.println("cantdad de milpies");
        int mil = sc.nextInt();
        // Lee cantdad de secciones de milpies
        System.out.println("cantdad de secciones");
        int secc2 = sc.nextInt();

        int patas = (ins*6) + (arac*8) + (crus*10) + ((secc1 * 2)* ciem) + ((secc2 * 4)* mil);
        System.out.println(patas);
    }
}