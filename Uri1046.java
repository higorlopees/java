import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int horaInicio, horaFim;

        horaInicio = teclado.nextInt();
        horaFim = teclado.nextInt();

        if (horaInicio < horaFim){
            System.out.println("O JOGO DUROU " + (horaFim - horaInicio) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU " + (horaFim + (24 - horaInicio)) + " HORA(S)");
        }
    }
}