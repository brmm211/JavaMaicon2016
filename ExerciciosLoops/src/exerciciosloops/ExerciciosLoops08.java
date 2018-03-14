package exerciciosloops;

import java.util.Scanner;

public class ExerciciosLoops08 {

    public static void main(String[] args) {
        String senha = "";

        for (int i = 0; i < 3; i++) {
            System.out.println("digite sua senha: ");
            senha = new Scanner(System.in).next();
            if ("computador".equals(senha)) {
                System.out.println("senha correta!");
                break;
            } else {
                if (i < 2) {
                    System.out.println("senha incorreta!!");
                } else {
                    System.out.println("esgotou as tentativas");
                }
            }

        }

    }
}
