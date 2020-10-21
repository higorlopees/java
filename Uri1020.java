import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N;

        N = teclado.nextInt();

        System.out.println((N / 365) + " ano(s)");
        System.out.println(((N % 365) / 30) + " mes(es)");
        System.out.println(((N % 365) % 30) + " dia(s)");
    }
}