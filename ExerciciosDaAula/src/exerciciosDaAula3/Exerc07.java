package exerciciosDaAula3;

import java.util.Scanner;

public class Exerc07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int vetor = 10;
        int[] a = new int[vetor];
        int[] b = new int[vetor];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite um numero: ");
            a[i] = ler.nextInt();
            if (a[i] % 2 != 0) {
                b[i] = 0;
            } else {
                b[i] = 1;
            }
        }
        System.out.println("Vetor A");
        for (int i = 0; i < a.length; i++) {
            System.out.print("|"+a[i]+"|");
        }
        System.out.println("");
        System.out.println("vetor B");
        for (int i = 0; i < b.length; i++) {
            System.out.print("|"+b[i]+"|");

        }

    }
}
