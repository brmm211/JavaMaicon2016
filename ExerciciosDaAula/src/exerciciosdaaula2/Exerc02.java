package exerciciosdaaula2;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int quantNum, quantNumNeg = 0, quantNumPos = 0;
        double numeros;
        
        System.out.println("digite a quantidade de numeros: ");
        quantNum = ler.nextInt();
        
        while (quantNum > 0) {
            int fat = 1;
            System.out.println("digite o numero desejado: ");
            numeros = ler.nextDouble();
            if (numeros > 0) {
                quantNumPos+=1;
                for (int i = 2; i <= numeros ; i++) {
                    fat*= i;
                }
                    System.out.println("Fatorial de "+(numeros)+" é: "+fat);
                    quantNum--;
            }else{
                quantNumNeg+=1;
                quantNum--;
            }
        }
                System.out.println("Quantidade de numeros positivos: "+quantNumPos);
                System.out.println("Quantidade de numeros negativos: "+quantNumNeg);
        
    }
}
