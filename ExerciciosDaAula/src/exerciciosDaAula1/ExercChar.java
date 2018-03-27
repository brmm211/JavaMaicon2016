package exerciciosDaAula1;

import java.util.Scanner;

public class ExercChar {

    public static void main(String[] args) {
        String palavra;
        
        System.out.println("digite uma palavra que tenha mais de 10 letras: ");
        palavra = new Scanner(System.in).next();
        
        int ind1 = palavra.charAt(0), ind2 = palavra.charAt(9);
        System.out.println("a palavra é: "+palavra+", tamanho: "+palavra.length());
        System.out.println("a primeira letra é: "+(char)ind1+", a decima é: "+(char)ind2);
    }

}
