import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int cod, qtd;

        cod = teclado.nextInt();
        qtd = teclado.nextInt();

        switch(cod) {
            case 1:
                System.out.printf("Total: R$ %.2f\n", qtd * 4.0f);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f\n", qtd * 4.5f);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f\n", qtd * 5.0f);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f\n", qtd * 2.0f);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f\n", qtd * 1.5f);
                break;
        }
    }
}