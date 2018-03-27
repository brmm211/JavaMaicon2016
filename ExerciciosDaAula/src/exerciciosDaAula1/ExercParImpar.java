package exerciciosDaAula1;

import java.util.Scanner;

public class ExercParImpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int v;
        
        System.out.println("digite um valor: ");
        v = ler.nextInt();
        
        if (v % 2 == 0) {
            System.out.println("Par!");
        }else{
            System.out.println("Impar!");
        }
        
    }
}
