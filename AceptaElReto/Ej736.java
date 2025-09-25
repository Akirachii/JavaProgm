import java.util.Scanner;

public class Ej736 {
    public static void main(String[] args) {
        // Iniciar Scanner
        Scanner sc = new Scanner(System.in);

        int reps = sc.nextInt();

        for (int i = 0; i < reps; i++) {
            int escalones = sc.nextInt();
            int pasos = sc.nextInt();

            System.out.println("Seran : " + (escalones-1)/pasos);
        }

        sc.close();
    }
}
