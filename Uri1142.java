import java.util.Scanner;

public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int n, x = 1;
        n = teclado.nextInt();

        for (int i = 1; i <= n; i ++) {
            System.out.println(x + " " + (x + 1) + " " + (x + 2) + " PUM");
            x += 4;
        }
    }
}