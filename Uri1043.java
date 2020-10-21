import java.util.Scanner;

public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A, B, C;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        if (Math.abs(B - C) < A && A < (B + C) && Math.abs(A - C) < B && B < (A + C) && Math.abs(A - B) < C && C < (A + B)) {
            System.out.printf("Perimetro = %.1f\n", (A + B + C));
        } else {
            System.out.printf("Area = %.1f\n", (((A + B) * C) / 2));
        }
    }
}