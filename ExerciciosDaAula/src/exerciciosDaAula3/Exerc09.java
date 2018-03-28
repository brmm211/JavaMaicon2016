package exerciciosDaAula3;

import java.util.Random;
import java.util.Scanner;

public class Exerc09 {

    public static void main(String[] args) {
//        Random ler = new Random();
        Scanner ler = new Scanner(System.in);

        int vetor = 5;
        int[] x = new int[vetor];
        int[] y = new int[vetor];
        int[] z = new int[vetor*2];
        int j = 0;
        
        for (int i = 0; i < x.length; i++) {
            x[i] = ler.nextInt();
            y[i] = ler.nextInt();

        }

        for (int i = 0; i < x.length; i++) {

            z[j] = x[i];
            j +=1;
            z[j] = y[i];
            j +=1;
            
        }

        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i]+" ");

        }
    }
}