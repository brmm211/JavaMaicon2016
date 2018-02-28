package exerciciosdaaula;

import java.util.Scanner;

public class ExercNotas {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int nota;

        System.out.println("digite a nota: ");
        nota = ler.nextInt();

        if (nota <= 19) {
            System.out.println("Reprovado");
        } else if (nota >= 20 && nota <= 59) {
            System.out.println("Recuperaçao");

        } else {
            System.out.println("Aprovado");
        }

    }
}
