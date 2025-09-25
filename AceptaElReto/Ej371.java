import java.util.Scanner;

public class Ej371 {

    public static void main(String[] args) {
        //Inicio Scanner
        Scanner sc = new Scanner(System.in);


        int num=1;
        while (num!=0) {
            num=sc.nextInt();
            int cerillas = ((num*(num+1))/2)*3;

            System.out.println(cerillas);
        }

    }
}