package aulaprog2;

import java.util.Scanner;

public class AulaProg2_01 {
    
    public static void main(String[] args) {
        int quantAlunos;
        String nomeAlunos;
        double notasAlunos;
        double somaNotas = 0, mediaAlunos = 0;
        System.out.println("digite a quantidade de alunos: ");
        quantAlunos = new Scanner(System.in).nextInt();
        
        for (int i = 0; i < quantAlunos; i++) {
            System.out.println("digite o nome do aluno: ");
            nomeAlunos = new Scanner(System.in).nextLine();
            
            System.out.println("digite a nota do aluno: ");
            notasAlunos = new Scanner(System.in).nextDouble();
            
            somaNotas += notasAlunos;
        }
        
            mediaAlunos = somaNotas / quantAlunos;
        
        System.out.println("soma das notas: " + somaNotas + " media: " + mediaAlunos);
    }
    
}
