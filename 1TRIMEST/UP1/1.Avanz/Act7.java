import java.util.Scanner;

public class Act7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Equipos: ");
        int equipos = sc.nextInt();

        // Pedimos plazas por confederación
        System.out.print("Plazas UEFA: ");
        int uefa = sc.nextInt();

        System.out.print("Plazas AFC: ");
        int afc = sc.nextInt();

        System.out.print("Plazas CAF: ");
        int caf = sc.nextInt();

        System.out.print("Plazas CONCACAF: ");
        int concacaf = sc.nextInt();

        System.out.print("Plazas CONMEBOL: ");
        int conmebol = sc.nextInt();

        System.out.print("Plazas OFC: ");
        int ofc = sc.nextInt();

        int totalAsignadas = uefa + afc + caf + concacaf + conmebol + ofc;
        int repesca = totalAsignadas - equipos;

        System.out.println("Plazas para la repesca: " + repesca);

        sc.close();
    }
}