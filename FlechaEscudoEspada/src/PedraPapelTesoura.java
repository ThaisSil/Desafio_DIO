import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int jogadaJogador = leitor.nextInt();
        int jogadaInimigo = leitor.nextInt();

        int resultado = jogadaJogador - jogadaInimigo;

        if (resultado == -1 || resultado == 2) {
            System.out.println("Perdeu");
        } else if (resultado == -2 || resultado == 1) {
            System.out.println("Ganhou");
        }
        if (resultado == 0) {
            System.out.println("Empatou");
        }

//comentando código  - "Ctrl +/"

    }
}