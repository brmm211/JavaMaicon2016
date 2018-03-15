package cursoDeAluno;

import java.util.Scanner;

public class Aula_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final int TOTAL_ALUNOS = 4;
        final int TOTAL_BIMESTRES = 4;
        final double NOTA_MINIMA = 70.0;
        
        String[] nomesAlunos = new String[TOTAL_ALUNOS];
        double[][] notasAlunos = new double[TOTAL_ALUNOS][TOTAL_BIMESTRES];
        double[] mediasAlunos = new double[TOTAL_ALUNOS];
        
        //obter nomes dos alunos
        for (int i = 0; i < TOTAL_ALUNOS; i++) {
            System.out.print("Digite o nome do "+(i+1)+"º aluno: ");
            nomesAlunos[i] = input.nextLine();
        }
        System.out.println("");
        
        //obter notas dos alunos todos os bimestres
        for (int i = 0; i < TOTAL_ALUNOS; i++) {
            for (int j = 0; j < TOTAL_BIMESTRES; j++) {
                System.out.println("digite a nota do aluno: " + nomesAlunos[i] + " para o " +(j+1)+ "º bimestre");
                notasAlunos[i][j] = input.nextDouble();
            }
            
        }
        System.out.println("");
        
        //calcular media dos alunos
        for (int i = 0; i < TOTAL_ALUNOS; i++) {
            for (int j = 0; j < TOTAL_BIMESTRES; j++) {
               mediasAlunos[i] += notasAlunos[i][j];
                
            }
            mediasAlunos[i] /= TOTAL_BIMESTRES;
            
        }
        System.out.println("");
        
        //mostrar a situaçao dos alunos
        System.out.println("======= Resultado Final ========");
        
        for (int i = 0; i < TOTAL_ALUNOS; i++) {
            if (mediasAlunos[i] >= NOTA_MINIMA) {
                System.out.println("Nome: " + nomesAlunos[i] + " Media: " + mediasAlunos[i] + " Situaçao: Aprovado");
            }else{
                System.out.println("Nome: " + nomesAlunos[i] + " Media: " + mediasAlunos[i] + " Situaçao: Reprovado");
                
            }
            
        }
    }
}
