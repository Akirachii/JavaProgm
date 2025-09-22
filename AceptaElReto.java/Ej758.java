import java.util.Scanner;

public class Ej758 {
    public static void main(String[] args) {
        // Iniciar Scanner
        Scanner sc = new Scanner(System.in);

        int reps = sc.nextInt();

        for (int i = 0; i < reps; i++) {
            int in = sc.nextInt();

            /*
             *  Formula es=  in*4=x-4+1    seria area - esquinas + punto central
             *  Siguiente es= in/2 = y*4  para sacar los segmentos 
             *  Ahora = x+y = losetas negras    (in*in)-(x+y) losetas blancas
             */

            int lnegras = ((in*4)-3)+(((int)in/2)-1)*4;
            int blancas = (in*in)-lnegras;
            System.out.println(lnegras+ " " +blancas);
        }

        sc.close();
    }
}
