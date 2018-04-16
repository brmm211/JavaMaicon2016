/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulado;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class teste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int maior = 0, menor = 0, media = 0, soma = 0, valor = 0;

        int[] vetor = new int[4];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor: ");
            vetor[i] = scan.nextInt();
            soma += vetor[i];
            media = soma / vetor.length;

        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
