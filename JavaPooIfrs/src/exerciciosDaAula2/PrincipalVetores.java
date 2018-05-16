/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosDaAula2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 10070323
 */
public class PrincipalVetores {

    public static void main(String[] args) {
        int op = 1;
        while (op != 0) {
            menu();
            op = op();
            if (op == 0) {
                System.exit(0);
            }
            opcoes(op);
        }
    }

    public static void menu() {
        System.out.println("### Bem-vindo ###");
        System.out.println("vetor inicializado");
        System.out.println("[1] Exibir Vetor");
        System.out.println("[2] ordem crescente");
        System.out.println("[3] ordem decrescente");
        System.out.println("[0] Sair");
    }

    public static int op() {
        System.out.print("Escolha uma opçao: ");
        int op = new Scanner(System.in).nextInt();
        return op;
    }

    public static void opcoes(int op) {
        switch (op) {
            case 1:
                mostrarVetor();
                break;
            case 2:
                ordenaCrescente();
                break;
            case 3:
                ordenaDecrescente();
                break;
            case 0:
                System.exit(0);
                break;
        }

    }

    public static int[] inicializarVetor() {
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (1 + (Math.random() * 100));
        }
        return vetor;
    }

    public static void mostrarVetor() {
        int[] vet = inicializarVetor();
        System.out.println("Vetor: " + Arrays.toString(vet));
    }

    public static void ordenaCrescente() {
        int[] vet = inicializarVetor();
        int cont1, cont2, aux;
        for (cont1 = 0; cont1 < 10; cont1++) {
            for (cont2 = 0; cont2 < 9; cont2++) {
                if (vet[cont2] > vet[cont2 + 1]) {
                    aux = vet[cont2];
                    vet[cont2] = vet[cont2 + 1];
                    vet[cont2 + 1] = aux;
                }
            }
        }
        System.out.println("ordem Crescente: " + Arrays.toString(vet));
    }

    public static void ordenaDecrescente() {
        int[] vet = inicializarVetor();
        int cont1, cont2, aux;
        for (cont1 = 0; cont1 < 10; cont1++) {
            for (cont2 = 0; cont2 < 9; cont2++) {
                if (vet[cont2] < vet[cont2 + 1]) {
                    aux = vet[cont2];
                    vet[cont2] = vet[cont2 + 1];
                    vet[cont2 + 1] = aux;
                }
            }
        }
        System.out.println("ordem Decrescente: " + Arrays.toString(vet));
    }
}
