package escrevendoemtxt;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscrevendoEmTxt {

    public static void main(String[] args) throws IOException {
        int i, n;

        System.out.printf("digite o numero para a tabuada: \n");
        n = new Scanner(System.in).nextInt();

        try (FileWriter arq = new FileWriter("C:\\Users\\Maicon\\Documents\\GitHub\\JavaMaicon2016\\EscrevendoEmTxt\\src\\escrevendoemtxt\\tabuada.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.printf("+--Resultado--+%n");
            
            for (i = 1; i <= 10; i++) {
                gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i * n));
            }
            gravarArq.printf("+-------------+%n");
        }

        System.out.printf("\nTabuada do %d foi gravada com sucesso em \"C:\\Users\\Maicon\\Documents\\GitHub\\JavaMaicon2016\\EscrevendoEmTxt\\src\\escrevendoemtxt\\tabuada.txt.\n", n);

    }

}
