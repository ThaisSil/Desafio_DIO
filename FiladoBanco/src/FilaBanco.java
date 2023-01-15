import java.util.Scanner;

public class FilaBanco {
    public static void main(String[] args) {

        String[] nomesFila = new String[3];
        Scanner nome = new Scanner(System.in);


       for (int count=0;count<=nomesFila.length-1;count++) {
            nomesFila[count] = nome.next();

            System.out.println(nomesFila[count] +  " - esta na posicao: " + (count+1));
       }
    }
}


