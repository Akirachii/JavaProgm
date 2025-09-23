import java.util.Scanner;

public class Ej682 {
    public static void main(String[] args) {
        // Iniciar Scanner
        Scanner sc = new Scanner(System.in);

        int pollitos = sc.nextInt();

        for (int i = 0; i < pollitos; i++) {
            int cantidad = sc.nextInt();

            System.out.println("Seran: " +  (cantidad*2) + " patas y " + cantidad + " picos");
        }


        sc.close();
    }
}
