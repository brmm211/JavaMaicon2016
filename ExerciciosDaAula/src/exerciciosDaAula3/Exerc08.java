package exerciciosDaAula3;

import java.util.Random;

public class Exerc08 {
    public static void main(String[] args) {
        Random v = new Random();
        
        int vetor = 5;
        int[] y = new int[vetor];
        double media = 0;
        double maior = 0;
        double menor = 50;
        System.out.println("### Obtendo valores ###");
        for (int i = 0; i < y.length; i++) {
//            System.out.print("Digite o valor "+(i+1)+": ");
            y[i] = v.nextInt(50);
            if (y[i] > maior) {
                maior = y[i];
            }
            if (y[i] < menor) {
                menor = y[i];
            }
            media += y[i];

        }
        System.out.println("\n### vetor ###");
        for (int i = 0; i < y.length; i++) {
            System.out.println("Valores "+(i+1)+": "+y[i]);
        }
            System.out.println("### Obtendo media ###");
            System.out.println("media: " + (media/y.length));
            System.out.println("### obtendo menor ###");
            System.out.println("menor: "+menor);
            System.out.println("### obtendo maior ###");
            System.out.println("maior: "+maior);
    }
}
