package exerciciosdaaula;

import java.util.Scanner;

public class ExercChar2 {

    public static void main(String[] args) {
        String palavra;
        
        System.out.println("digite uma palavra: ");
        palavra = new Scanner(System.in).next();
        
        int ind1 = 0, ind2 = 9;
        
        if (palavra.length() >= 10) {
        System.out.println("a palavra é: "+palavra+", tamanho: "+palavra.length());
        System.out.println("a primeira letra é: "+palavra.charAt(ind1)+", a decima é: "+palavra.charAt(ind2));
        }else {
        System.out.println("a palavra é: "+palavra+", tamanho: "+palavra.length());
        
            
        }
    }
}
