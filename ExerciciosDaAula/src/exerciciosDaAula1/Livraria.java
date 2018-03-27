package exerciciosDaAula1;

import java.util.Scanner;

public class Livraria {
    public static void main(String[] args) {
//        tipo a - 10 pila
//        tipo b - 20 pila
//        tipo c - 30 pila
        
        int tipoA = 10, tipoB = 20, tipoC = 30, quantLivros, total = 0;
        String escolherTipo = "", afirma = "";
        
        System.out.println("Tipo A");
        System.out.println("Tipo B");
        System.out.println("Tipo C");
        
        while(!"sim".equals(afirma)){
        System.out.println("Escolha o tipo do livro: ");
        escolherTipo = new Scanner(System.in).next();
            if (null != escolherTipo) switch (escolherTipo) {
                case "A":
                    System.out.println("tipo A custa "+tipoA);
                    break;
                case "B":
                    System.out.println("tipo B custa "+tipoB);
                    break;
                case "C":
                    System.out.println("tipo C custa "+tipoC);
                    break;
                default:
                    break;
            }
            
            System.out.println("É esse que vc quer? ");
            afirma = new Scanner(System.in).next();
            
        }
        
        System.out.println("quantos livros vai querer? ");
        quantLivros = new Scanner(System.in).nextInt();
        
        switch(escolherTipo){
            case "A":
                total=quantLivros * tipoA;
                break;
            case "B":
                total=quantLivros * tipoB;
                break;
            case "C":
                total=quantLivros * tipoC;
        }
        
        System.out.println("total à pagar: "+total);
        
        if (quantLivros > 10) {
            System.out.println("vendeu "+quantLivros);
        }
        
    }
}
