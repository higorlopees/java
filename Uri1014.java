import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X;
        float Y;

        X = teclado.nextInt();
        Y = teclado.nextFloat();

        System.out.printf("%.3f km/l\n", (X / Y));
    }
}