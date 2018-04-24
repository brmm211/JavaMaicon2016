package aulaprog2sem;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {
        Scanner lerNome = new Scanner(System.in);
        Scanner lerNota = new Scanner(System.in);
        int alunos = 2, notas = 3;
//        String[][] alunosNotas = new String[alunos][notas];
        String[] alunosNomes = new String[alunos];
        double[] notasAlunos = new double[notas];
        
        double somaNotas = 0, mediaTodosAlunos = 0;
        int quantNotas = 0;
        for (int i = 0; i < alunosNomes.length; i++) {
            System.out.printf("Digite o nome do %sº aluno: ", (i + 1));
            alunosNomes[i] = lerNome.nextLine();
//            System.out.println(i);
            for (int j = 0; j < notasAlunos.length; j++) {
                System.out.printf("digite a %dº nota do %sº aluno: ", (j + 1), (i + 1));
                notasAlunos[j] = lerNota.nextDouble();
//                System.out.println(j);
                somaNotas += notasAlunos[i];
                quantNotas += 1;
//                System.out.println(quantNotas);
            }
        }
            mediaTodosAlunos = somaNotas / quantNotas;
        
            for (int i = 0; i < alunosNomes.length; i++) {
            System.out.print(alunosNomes[i]+": ");
            for (int j = 0; j < notasAlunos.length; j++) {
                System.out.print(notasAlunos[j]+" ");
            }
            System.out.println("");
        }
        System.out.print(somaNotas);
        System.out.println("");
        System.out.print(mediaTodosAlunos);
    }
}
