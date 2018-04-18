package exerciciosDaAula2;

import java.util.Scanner;

public class Exerc04 {

    public static void main(String[] args) {
        System.out.println("Digite o número");
        int numero = new Scanner(System.in).nextInt();
        tipoPiramide(numero, false);
        tipoPiramide(numero, true);

    }

    /**
     * Método tipo de pirâmide
     *
     * @param 1 int recebe o número digitao
     * @param 2 boolean recebe o tipo de pirâmide inversa ou não inversa
     * @return void
     */
    private static void tipoPiramide(int numero, boolean inversa) {
        int iterador = inversa ? numero : 1;
        while (inversa ? iterador > 0 : iterador <= numero) {
            criaEspacos(numero, iterador);
            imprimeNumeros(iterador, true);
            imprimeNumeros(iterador, false);
            System.out.println("");
            int tipoIncremento = inversa ? iterador-- : iterador++;
        }
    }

    /**
     * Método imprime os números
     *
     * @param 1 int recebe o index do for
     * @param 2 boolean recebe o tipo da iteração Decrementada ou incrementada
     * @return void
     */
    private static void imprimeNumeros(int indexFor, boolean reverso) {
        int iterador = reverso ? indexFor : 2;
        while (reverso ? iterador > 0 : iterador <= indexFor) {
            System.out.print(!reverso ? ((iterador >= 11)
                    ? iterador : " " + iterador)
                    : (iterador >= 10) ? iterador : " " + iterador);
            int tipoIncremento = reverso ? iterador-- : iterador++;
        }
    }

    /**
     * Método criaEspaços
     *
     * @param 1 int recebe o número digitado
     * @param 2 int recebe o index do for
     * @return void
     */
    private static void criaEspacos(int numero, int indexFor) {
        for (int i = 1; i <= numero - indexFor; i++) {
            System.out.print("  ");
        }
    }
}
