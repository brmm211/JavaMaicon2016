package exerciciosDaAula3;

import java.util.Scanner;

public class Exerc03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vetor = 10;
        int[] x = new int[vetor];
        int[] y = new int[vetor];

        for (int i = 0; i < x.length; i++) {
            System.out.print("digite um numero: ");
            x[i] = ler.nextInt();
        }
        for (int i = 0; i < x.length; i++) {
            if (x[i]%2 == 0) {
            System.out.print("["+i+"]: "+x[i]+"\n");
            }
        }

    }

}
