package aulaprog2sem;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {
        Scanner lerNome = new Scanner(System.in);
        Scanner lerNota = new Scanner(System.in);
        int alunos = 7, notas = 5;
//        String[][] alunosNotas = new String[alunos][notas];
        String[] alunosNomes = new String[alunos];
        double[] notasAlunos = new double[notas];
        
        for (int i = 0; i < alunosNomes.length; i++) {
            System.out.printf("Digite o nome do %sº aluno: ", (i+1));
            alunosNomes[alunos] = lerNome.nextLine();
            System.out.println(i);
            for (int j = 0; j < notasAlunos.length; j++) {
                System.out.printf("digite a %dº nota do %sº aluno: ", (j+1), (i+1));
                notasAlunos[notas] = lerNota.nextDouble();
                System.out.println(j);
            }
            
        }
        
        
    }
    
}
