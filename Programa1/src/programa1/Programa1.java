package programa1;

import java.util.Scanner;

public class Programa1 {

    public static void main(String[] args) {
//      pegue 2 valores inteiro 10 20 some e mostre na tela
        Programa2 programa2 = new Programa2();
        Scanner ler = new Scanner(System.in);

        int a = programa2.lerA(ler);
        int b = programa2.lerB(ler);
        int d = programa2.lerD(ler);

        programa2.calculadora(d, a, b);

    }
//      shift+alt+f
}
