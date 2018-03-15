package cursoDeAluno;

import java.util.Scanner;

public class Aula_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("digite um ano: ");
        int ano = input.nextInt();
        
        boolean x = ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0));
          
        if(x){
            System.out.println("é bissexto");
        }else{
            System.out.println("nao é bissexto");
        }
    }
}
