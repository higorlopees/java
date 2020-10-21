import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero, qtdHoras;
        float valorPorHora, salario;

        numero = teclado.nextInt();
        qtdHoras = teclado.nextInt();
        valorPorHora = teclado.nextFloat();

        salario = valorPorHora * qtdHoras;
        
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}