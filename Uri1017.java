import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int tempo, velocidadeMedia;

        tempo = teclado.nextInt();
        velocidadeMedia = teclado.nextInt();

        System.out.printf("%.3f\n", ((float)(tempo * velocidadeMedia) / 12));
    }
}