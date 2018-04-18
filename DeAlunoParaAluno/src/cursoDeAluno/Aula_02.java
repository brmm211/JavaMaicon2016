package cursoDeAluno;

import java.util.Scanner;

public class Aula_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, altura, areaRetangulo;
        
        
        System.out.print("digite a base: ");
        base = input.nextDouble();
        System.out.print("digite a altura: ");
        altura = input.nextDouble();
        areaRetangulo = base * altura;
        System.out.print("Area: " + areaRetangulo + "\n");
        
    }
    
}
