import java.util.Scanner;

public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double N;

        N = teclado.nextDouble();

        if (N >= 0 && N <= 400) {
            System.out.printf("Novo salario: %.2f\n", N * 1.15);
            System.out.printf("Reajuste ganho: %.2f\n", N * 0.15);
            System.out.println("Em percentual: 15 %");
        } else if (N > 400 && N <= 800){
            System.out.printf("Novo salario: %.2f\n", N * 1.12);
            System.out.printf("Reajuste ganho: %.2f\n", N * 0.12);
            System.out.println("Em percentual: 12 %");
        } else if (N > 800 && N <= 1200){
            System.out.printf("Novo salario: %.2f\n", N * 1.10);
            System.out.printf("Reajuste ganho: %.2f\n", N * 0.10);
            System.out.println("Em percentual: 10 %");
        } else if (N > 1200 && N <= 2000){
            System.out.printf("Novo salario: %.2f\n", N * 1.07);
            System.out.printf("Reajuste ganho: %.2f\n", N * 0.07);
            System.out.println("Em percentual: 7 %");
        } else if (N > 2000){
            System.out.printf("Novo salario: %.2f\n", N * 1.04);
            System.out.printf("Reajuste ganho: %.2f\n", N * 0.04);
            System.out.println("Em percentual: 4 %");
        }
    }
}