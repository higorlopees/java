import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N;

        N = teclado.nextInt();

        System.out.println((N / 3600) + ":" + ((N % 3600) / 60) + ":" + ((N % 3600) % 60));
    }
}