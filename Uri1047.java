import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int horaInicio, minutoInicio, horaFim, minutoFim;

        horaInicio = teclado.nextInt();
        minutoInicio = teclado.nextInt();
        horaFim = teclado.nextInt();
        minutoFim = teclado.nextInt();

        if (horaInicio < horaFim) {
            if (minutoInicio < minutoFim) {
                System.out.println("O JOGO DUROU " + (horaFim - horaInicio) + " HORA(S) E " + (minutoFim - minutoInicio) + " MINUTO(S)");
            } else if (minutoInicio > minutoFim) {
                System.out.println("O JOGO DUROU " + ((horaFim - horaInicio) - 1) + " HORA(S) E " + (minutoFim + (60 - minutoInicio)) + " MINUTO(S)");
            } else {
                System.out.println("O JOGO DUROU " + (horaFim - horaInicio) + " HORA(S) E 0 MINUTO(S)");
            }
        } else {
            if (minutoInicio < minutoFim) {
                if (horaInicio == horaFim) {
                    System.out.println("O JOGO DUROU 0 HORA(S) E " + (minutoFim - minutoInicio) + " MINUTO(S)");
                } else {
                    System.out.println("O JOGO DUROU " + (horaFim + (24 - horaInicio)) + " HORA(S) E " + (minutoFim - minutoInicio) + " MINUTO(S)");
                }
            } else if (minutoInicio > minutoFim) {
                System.out.println("O JOGO DUROU " + ((horaFim + (24 - horaInicio)) - 1) + " HORA(S) E " + (minutoFim + (60 - minutoInicio)) + " MINUTO(S)");
            } else {
                System.out.println("O JOGO DUROU " + (horaFim + (24 - horaInicio)) + " HORA(S) E 0 MINUTO(S)");
            }
        }
    }
}