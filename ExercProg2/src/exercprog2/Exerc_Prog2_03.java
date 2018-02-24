package exercprog2;

import java.util.Scanner;

public class Exerc_Prog2_03 {
   
    public static void main(String[] args) {
        double a, b, aux;
        
        System.out.println("Digite o valor de a: ");
        a = new Scanner(System.in).nextDouble();
        System.out.println("Digite o valor de b: ");
        b = new Scanner(System.in).nextDouble();
        
        aux = a;
        a=b;
        b=aux;
        
        System.out.println(a+" "+ b);
    }
}
