package exerciciosdaaula2;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int quantNum, quantNumNeg = 0, quantNumPos = 0;
        double numeros;
        
        System.out.println("digite a quantidade de numeros: ");
        quantNum = ler.nextInt();
        
        for (int i = 0; i <= quantNum; i++) {
            System.out.println("digite o numero desejado: ");
            numeros = ler.nextDouble();
            if (numeros < 0) {
                quantNumNeg+=1;
                System.out.println(quantNumNeg);
            }else{
                quantNumPos+=1;
                System.out.println(quantNumPos);
            }
        }
        
        
    }
}
