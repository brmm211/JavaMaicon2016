package exerciciosDaAula2;

import java.util.Scanner;

public class Exerc03 {

    public static void main(String[] args) {
        System.out.println("Digite o número");
        int numero = new Scanner(System.in).nextInt();

//        i = 1  para i menor ou igual x incrementa
        for (int i = 1; i <= numero; i++) {
//            j = 1 para menor igual x -1 decrementa
//              usado para dar os  espaços para formar a
//              pirâmide sempre imprime um a menos que o número escolhido
            for (int j = 1; j <= numero - i; j++) {
                System.out.print("  ");
            }
//            k = i para k menor ou igual 1 decrementa 
            for (int k = i; k >= 1; k--) {
//                se k maior ou igual a dez ele imprime apenas o k se não ele imprime o espaço a esquerda depois o k
                System.out.print((k >= 10) ? +k : " " + k);
            }
            for (int k = 2; k <= i; k++) {
//                esse for começa no dois pois o da esquerda se encarrega de colocar imprimir o 1
//                se k maior ou igual a dez ele imprime apenas o k se não ele imprime o espaço a esquerda depois o k
                System.out.print((k >= 11) ? +k : " " + k);
            }
            System.out.println();
        }

    }
}

