package exerciciosDaAula3;

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int vetor = 10;
        int[] x = new int[vetor];
        
        for (int i = 0; i < x.length; i++) {
            System.out.print("Digite um numero: ");
            x[i] = ler.nextInt();
            if (x[i]%2 != 0) {
                System.out.println("Programa encerrado!!");
                break;
            }
        }
        
        
        
    }
}
