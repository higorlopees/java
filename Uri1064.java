import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float n, soma = 0;
        int qtdPositivos = 0;

        for (int i = 0; i < 6; i ++) {
            n = teclado.nextFloat();
            
            if (n > 0) {
                soma += n;
                qtdPositivos ++;
            }
        }

        System.out.println(qtdPositivos + " valores positivos");
        System.out.printf("%.1f\n", soma / qtdPositivos);
    }
}