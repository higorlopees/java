import java.util.Scanner;

public class Uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int n;

        do {
            n = teclado.nextInt();

            if (n == 2002) {
                System.out.println("Acesso Permitido");
            } else {
                System.out.println("Senha Invalida");
            }
        } while (n != 2002);
    }
}