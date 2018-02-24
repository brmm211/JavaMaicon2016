package exercprog2;

import java.util.Scanner;

public class Exerc_Prog2_02 {
    
    public static void main(String[] args) {
        double gF, gC;
        
        System.out.print("digite a temperatura em fahrenheit: ");
        gF = new Scanner(System.in).nextDouble();
        
        gC = (gF - 32) / 1.8000;
        
        System.out.println("A temperatura em Graus Celsius é: "+gC);
    }
}
