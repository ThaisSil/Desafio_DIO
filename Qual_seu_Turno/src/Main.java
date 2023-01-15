import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            }
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual é o seu turno?");
        char turno = leitor.next().toUpperCase().charAt(0);

        //TODO: Implemente um condição de verifique a média de idade da turma conforme a descrição do desafio:

        //if (turno == 'M')
         //   System.out.println("Bom Dia!");
       // else if (turno == 'V')
          //  System.out.println("Boa Tarde!");
       // else if (turno == 'N') {
          //  System.out.println("Boa Noite!");
       // } else {
        //    System.out.println("Valor Inválido!");
       // }

        switch (turno){
            case :
                System.out.println("Bom dia");
            case 'V':
                System.out.println("Boa Tarde!");
            case 'N':
                System.out.println("Boa Noite!");
            default:
                continue;
        }

    }
}





