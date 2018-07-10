package classroom;

import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        double resultado, num1, num2;
        String op;
        
        System.out.println("digite o primeiro valor: ");
        num1 = ler.nextDouble();
        
        System.out.println("digite a operaçao: ");
        op = ler.next();
        
        System.out.println("digite o  valor: ");
        num2 = ler.nextDouble();
        
        switch (op) {
            case "+":
                resultado = num1 + num2;
                System.out.println("resultado: "+resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("resultado: "+resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("resultado: "+resultado);
                break;
            case "/":
                resultado = num1 / num2;
                System.out.println("resultado: "+resultado);
                break;
            default:
                throw new AssertionError();
        }
    }
}
