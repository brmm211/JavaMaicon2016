package aulaswitch;

import java.util.Scanner;

public class AulaSwitch01 {

    public static void main(String[] args) {
        String operacao;
        int a, b;

        System.out.print("digite um numero: ");
        a = new Scanner(System.in).nextInt();

        System.out.println("\n----- Escolha uma das operações ------");
        System.out.println("+. soma");
        System.out.println("-. subtraçao");
        System.out.println("*. multiplicaçao");
        System.out.println("/. divisao");

        System.out.print("\ndigite a operaçao: ");
        operacao = new Scanner(System.in).next();
        System.out.println("");
        System.out.print("digite um numero: ");
        b = new Scanner(System.in).nextInt();
        System.out.println("");

        operacoes(operacao, a, b);

    }

    public static void operacoes(String operacao, float a, float b) {
        switch (operacao) {
            case "+":
                double soma = a + b;
                System.out.println("Resultado: " + soma);
                break;
            case "-":
                double sub = a - b;
                System.out.println("Resultado: " + sub);
                break;
            case "*":
                double multi = a * b;
                System.out.println("Resultado: " + multi);
                break;
            case "/":
                double div = a / b;
                System.out.println("Resultado: " + div);
                break;
            default:
                System.out.println("nenhuma");
        }
    }
}
