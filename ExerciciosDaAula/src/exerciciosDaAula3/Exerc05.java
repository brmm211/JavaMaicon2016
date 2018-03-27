package exerciciosDaAula3;

import java.util.Scanner;

public class Exerc05 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int vetor = 5;
        int[] y = new int[vetor];
        double media = 0;
        
        System.out.println("### Obtendo valores ###");
        for (int i = 0; i < y.length; i++) {
            System.out.print("Digite o valor "+(i+1)+": ");
            y[i] = ler.nextInt();

            media += y[i];

        }
        System.out.println("### vetor ###");
        for (int i = 0; i < y.length; i++) {
            System.out.println("Valores "+(i+1)+": "+y[i]);
        }
            System.out.println("### Obtendo media ###");
            System.out.println("media: " + (media/y.length));
    }

}
