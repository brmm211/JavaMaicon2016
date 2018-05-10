package exerciciosDaAula;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        int op = 1;
        while (op != 0) {
            menu();
            op = opcao();
            if (op == 0) {
                System.exit(0);
            }
            int x = n1(), y = n2();
            calcular(op, x, y);
        }
    }

    public static void menu() {
        System.out.println("[1] Somar\n"
                + "[2] Subtrair\n"
                + "[3] Dividir\n"
                + "[4] Multiplicar\n"
                + "[0] Sair");
    }

    public static int n1() {
        int x = 0;
        while (x == 0) {
            System.out.print("digite o primeiro numero: ");
            x = new Scanner(System.in).nextInt();
        }
        return x;
    }

    public static int n2() {
        int y = 0;
        while (y == 0) {
            System.out.print("digite o segundo numero: ");
            y = new Scanner(System.in).nextInt();
        }
        return y;
    }

    public static void calcular(int op, int x, int y) {
        int resultado = 0;
        switch (op) {
            case 1:
                resultado = x + y;
                System.out.println("resultado: " + resultado);
                break;
            case 2:
                resultado = x - y;
                System.out.println("resultado: " + resultado);
                break;
            case 3:
                resultado = x * y;
                System.out.println("resultado: " + resultado);
                break;
            case 4:
                resultado = x / y;
                System.out.println("resultado: " + resultado);
                break;
        }
//        return "resultado: " + resultado;
    }

    public static int opcao() {
        System.out.print("Escolha uma opçao? '0' para sair: ");
        int op = new Scanner(System.in).nextInt();
        return op;
    }

}
