package programa1;

import java.util.Scanner;

public class Programa2 {
    
    public int lerA(Scanner ler) {
        int a;
        System.out.println("digite o valor de a: ");
        a = ler.nextInt();
        return a;
    }
    public int lerB(Scanner ler) {
        int b;
        System.out.println("digite o valor de b: ");
        b = ler.nextInt();
        return b;
    }
    public int lerD(Scanner ler) {
        int d;
        System.out.println("digite o tipo de operação: ");
        d = ler.nextInt();
        return d;
    }
    
    public void calculadora(int d, int a, int b) {
        int c;
        switch(d){
            case 1:
                c = a+b;
                System.out.println("resultado: "+c);
                break;
            case 2:
                c = a-b;
                System.out.println("resultado: "+c);
                break;
            case 3:
                c = a*b;
                System.out.println("resultado: "+c);
                break;
            case 4:
                c = a/b;
                System.out.println("resultado: "+c);
                break;
        }
    
    
    }
}
