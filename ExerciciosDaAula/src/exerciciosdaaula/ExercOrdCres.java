package exerciciosdaaula;

import java.util.Scanner;

public class ExercOrdCres {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int quantNum;
        
        System.out.print("quantos numeros para ordenar? ");
        quantNum = ler.nextInt();
        
        int[] num = new int[quantNum];
        
        for (int i = 0; i < num.length; i++) {
            System.out.print("digite o "+(i+1)+"º numero: ");
            num[i] = ler.nextInt();
        }
        
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int aux = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = aux;
                }
                
            }
            
        }
        System.out.println("numeros ordenados de forma crescente");
        
        for (int i = 0; i < num.length; i++) {
            System.out.print(" - "+num[i]);
            
        }
        System.out.println("");
    }
}
