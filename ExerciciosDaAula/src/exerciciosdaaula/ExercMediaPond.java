package exerciciosdaaula;

import java.util.Scanner;

public class ExercMediaPond {
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
            if (mediaPonde < 3) {
                System.out.println("conceito E");
            } else if(mediaPonde >= 3 && mediaPonde <= 5){
                System.out.println("conceito D");
            }else if (mediaPonde >= 6 && mediaPonde <= 7) {
                System.out.println("conceito C");
            }else if (mediaPonde >= 8 && mediaPonde <= 9) {
                System.out.println("conceito B");
            }else{
                System.out.println("conceito A");
            }
        
        
        
        System.out.println("\nMédia ponderada: "+mediaPonde);
    
    }
}
