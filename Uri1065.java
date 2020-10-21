import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int n, qtdpares = 0;

        for (int i = 0; i < 5; i ++) {
            n = teclado.nextInt();
            
            if (n % 2 == 0) {
                qtdpares ++;
            }
        }

        System.out.println(qtdpares + " valores pares");
    }
}