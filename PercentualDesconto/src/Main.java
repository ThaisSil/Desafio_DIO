import jdk.jfr.Percentage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = 0, D = 0;

        M = input.nextInt();
        D = input.nextInt();
        int Porcentagem;


        Porcentagem = (int) (100 - (D * 100 / M));

        System.out.println("O desconto foi de " + Porcentagem + "%");
    }
}