package exerciciosloops;

import java.util.Scanner;

public class ExerciciosLoops05 {
    public static void main(String[] args) {
        
        int num = 1;
        
        while (num > 0) {            
                System.out.println("digite um numero");
                num = new Scanner(System.in).nextInt();
            
            if (num%2==1) {
                System.out.println(num+": impar");
            }
            
            
        }
        System.out.println("programa encerrado");
        
        
    }
}
