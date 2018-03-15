package cursoDeAluno;

import java.util.Scanner;

public class Aula_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("digite um numero de 0 a 10");
        int numero = input.nextInt();
        
        
        for (int i = 0; i <= 10; i++) {
           if(i == numero){
               System.out.println("o seu numero é " + i);
               break;
           }else{
               System.out.println("o seu numero nao é " + i);
               //continue; para pular o proximo codigo
           }
            
        }
        
        
        
    }
}
