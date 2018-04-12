package aulaprog2sem;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String[] alunos = new String[7];
        double[] notas = new double[5];
        
        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("Digite o nome do %sº aluno: ", (i+1));
            alunos[i] = ler.next();
            System.out.println(i);
            for (int j = 0; j < notas.length; j++) {
                System.out.printf("digite a %dº nota do %sº aluno: ", (j+1), (i+1));
                notas[i] = ler.nextDouble();
                System.out.println(j);
            }
            
        }
        
        
    }
    
}
