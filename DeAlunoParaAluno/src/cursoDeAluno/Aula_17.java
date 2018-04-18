package cursoDeAluno;

import java.util.Scanner;

public class Aula_17 {
    public static void main(String[] args) {
        double areaRetangulo = retangulo();
        
        System.out.println(areaRetangulo);
    }
    
    public static double retangulo(){
        Scanner input = new Scanner(System.in);
        double base, altura, areaRetangulo;
        
        System.out.println("digite a base: ");
        base = input.nextDouble();
        System.out.println("digite a altura");
        altura = input.nextDouble();
        
        areaRetangulo = base * altura;
        
        return areaRetangulo;
    }
}

