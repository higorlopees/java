import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int n, qtdpares = 0, qtdImpares = 0, qtdPositivos =0, qtdNegativos = 0;

        for (int i = 0; i < 5; i ++) {
            n = teclado.nextInt();
            
            if (n % 2 == 0) {
                qtdpares ++;
            } else {
                qtdImpares ++;
            }

            if (n > 0) {
                qtdPositivos ++;
            } else if (n < 0) {
                qtdNegativos ++;
            }
        }

        System.out.println(qtdpares + " valor(es) par(es)");
        System.out.println(qtdImpares + " valor(es) impar(es)");
        System.out.println(qtdPositivos + " valor(es) positivo(s)");
        System.out.println(qtdNegativos + " valor(es) negativo(s)");
    }
}