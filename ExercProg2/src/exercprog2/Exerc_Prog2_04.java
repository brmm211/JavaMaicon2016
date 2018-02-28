package exercprog2;

import java.util.Scanner;

public class Exerc_Prog2_04 {
    
    public static void main(String[] args) {
        int quantNotas;
        double notas, pesoNotas, mediaPonde = 0, multiPN, somaPN = 0, somaPeso = 0;
        System.out.print("digite a quantidade de notas: ");
        quantNotas = new Scanner(System.in).nextInt();
        
        for (int i = 0; i < quantNotas; i++) {
            System.out.print("digite a "+(i+1)+"º nota: ");
            notas = new Scanner(System.in).nextDouble();
            System.out.print("digite o peso da "+(i+1)+"º nota: ");
            pesoNotas = new Scanner(System.in).nextDouble();
            
            multiPN = notas * pesoNotas;
            somaPN += multiPN;
            somaPeso += pesoNotas;
            
            
            mediaPonde = somaPN / somaPeso;
        }
        
        
        
        System.out.println("Média ponderada: "+mediaPonde);
    }
}
