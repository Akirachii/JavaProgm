// Pau Gra
public class Ej {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        int c = -5;
        
        int res1 = a+b+c;
        int res2 = 2 * b + 3 * (a-c);
        int res3 = a/b;
        int res4 = a%b;
        int res5 = a + c / b;
        int res6 = a * (b / c);
        int res7 = a * c % b;
        int res8 = (a - 3 * b) % (c + 2 * a) / (a - c);
        int res9 = a - b - c * 2;
        System.out.println(res1 + " " + res2 + " " + res3 +  " " + res4 + " " + res5 + " " + res6 + " " + res7 + " " + res8 + " " + res9 );
    }
}