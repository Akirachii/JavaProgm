import java.util.Scanner;

public class Ej788 {
    public static void main(String[] args) {
        // Iniciar Scanner
        Scanner sc = new Scanner(System.in);

        int rep = sc.nextInt();

        for (int i = 0; i < rep; i++) {
                int ladrones = sc.nextInt();
                int higos = sc.nextInt();

                int corr = higos/ladrones;
                int mas = higos%ladrones;

                System.out.println( corr + mas);
        }
    }
}
