import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int cod1, qtd1, cod2, qtd2;
        float valor1, valor2, valorAPagar;

        cod1 = teclado.nextInt();
        qtd1 = teclado.nextInt();
        valor1 = teclado.nextFloat();

        cod2 = teclado.nextInt();
        qtd2 = teclado.nextInt();
        valor2 = teclado.nextFloat();


        valorAPagar = (valor1 * qtd1) + (valor2 * qtd2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorAPagar);
    }
}