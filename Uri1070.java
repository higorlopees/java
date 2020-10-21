import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int n, i = 0;
        n = teclado.nextInt();

        while (true) {
            if (n % 2 != 0) {
                System.out.println(n);
                i ++;
            }

            n ++;

            if (i == 6) {
                break;
            }
        }
    }
}