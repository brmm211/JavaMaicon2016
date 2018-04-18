package simulado;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {
        int numVet = 10;
        int[] vetor = new int[numVet];
        int[] vetor1 = new int[numVet];
        
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("digite um valor: ");
            vetor[i] = new Scanner(System.in).nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]%2==0) {
                vetor1[i] = vetor[i] * 2;
            }else{
                vetor1[i] = vetor[i] * 3;
            }
            
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor1[i]+" ");
        }
        
        
        
    }
}
