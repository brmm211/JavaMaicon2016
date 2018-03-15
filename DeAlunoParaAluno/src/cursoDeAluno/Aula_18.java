package cursoDeAluno;

import java.util.Scanner;

public class Aula_18 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        
        System.out.println("digite a base: ");
        double base = new Scanner(System.in).nextDouble();
        System.out.println("digite a altura: ");
        double altura = new Scanner(System.in).nextDouble();
        
        double areaRetangulo = retangulo(base, altura);
        
        System.out.println(areaRetangulo);
    }
    
    public static double retangulo(double base, double altura){
        
        return base * altura;
    }
}


