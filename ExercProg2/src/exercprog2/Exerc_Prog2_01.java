package exercprog2;

import java.util.Scanner;

public class Exerc_Prog2_01 {

    public static void main(String[] args) {
        double x, y, z, total;
        
        System.out.print("digite o valor de X: ");
        x = new Scanner(System.in).nextDouble();
        System.out.print("digite o valor de X: ");
        y = new Scanner(System.in).nextDouble();
        System.out.print("digite o valor de X: ");
        z = new Scanner(System.in).nextDouble();
        
        total = x - 5 * y - z;
        
        System.out.println("Total: "+total);
    }
    
}
