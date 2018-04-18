package cursoDeAluno;

import java.util.Scanner;

public class Aula_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner nota = new Scanner(System.in);
        int numAlunos = 2;
        String[] nomesAlunos = new String[numAlunos];
        double[] notasAlunos = new double[numAlunos];
        
        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.println("digite o nome do " +(i+1)+"º aluno");
            nomesAlunos[i] = input.nextLine();
            
            System.out.println("digite a nota do "+(i+1)+"º aluno: ");
            notasAlunos[i] = nota.nextDouble();
            
        }
        for (int i = 0; i < notasAlunos.length; i++) {
        System.out.println("a nota do aluno " + nomesAlunos[i] + " é " + notasAlunos[i]);
        
        }
    }
}
