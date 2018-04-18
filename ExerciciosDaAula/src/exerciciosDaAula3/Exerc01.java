package exerciciosDaAula3;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vetor = 10;
        int[] x = new int[vetor];
        int[] y = new int[vetor];
        
        for (int i = 0; i < x.length; i++) {
            System.out.print("digite um numero: ");
            x[i] = ler.nextInt();
            y[i] = x[i];
        }
            System.out.println("Y: ");
        for (int i = 0; i < x.length; i++) {
//            System.out.println("X: "+x[i]);
            System.out.print(y[i]+" ");
        }
        
        
    }
}
