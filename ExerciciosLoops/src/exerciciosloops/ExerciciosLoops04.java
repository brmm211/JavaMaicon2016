package exerciciosloops;

import java.util.Scanner;

public class ExerciciosLoops04 {
    public static void main(String[] args) {
        
        int num, total = 0;
        System.out.println("digite um numero: ");
        num = new Scanner(System.in).nextInt();
        
        for (int i = 0; i < num; i++) {
            if (i%2==1) {
                total+=i;
            }
            
        }
        System.out.println(total);
        
        
        
    }
}
