package exerciciosloops;

import java.util.Scanner;

public class ExerciciosLoops06 {

    public static void main(String[] args) {

        int num1 = 0, num2 = 0, i = 0;
        float total = 0;
        String operacao = "sim";

        do {
            System.out.println("###Inicio###");
            while (num1 == 0) {
                System.out.println("digite o primeiro numero: ");
                num1 = new Scanner(System.in).nextInt();
            }
            while (num2 == 0) {
                System.out.println("digite o segundo numero: ");
                num2 = new Scanner(System.in).nextInt();
            }

            total = (float) num1 / (float) num2;

            System.out.println("Calculando resultado...");
            System.out.println("----> " + num1 + " / " + num2 + " = " + total);
            
            num1 = 0;
            num2 = 0;
            System.out.println("voce deseja fazer outra operaçao? Sim / nao");
            operacao = new Scanner(System.in).next();
            i++;
            
        }while ("sim".equals(operacao));
            System.out.println("###Programa encerrado###");
            System.out.println("Numero de calculos: " + i);

        
    }
}

