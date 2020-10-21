import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int n, alcool = 0, gasolina = 0, diesel = 0;

        do {
            n = teclado.nextInt();

            switch (n) {
                case 1:
                    alcool ++;
                    break;
                case 2:
                    gasolina ++;
                    break;
                case 3:
                    diesel ++;
                    break;
            }
        } while (n != 4);

        System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", alcool, gasolina, diesel);
    }
}