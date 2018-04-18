package cursoDeAluno;

import java.util.Scanner;


public class Aula_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.1415;
        
        System.out.println("digite o raio: ");
        double raio = input.nextDouble();
        
        double area = raio * raio * PI;
        
        System.out.println("o valor do raio é: " + area);
    }
}
