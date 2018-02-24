package exercprog2;

import java.util.Scanner;

public class Exerc_Prog2_05 {
    
    public static void main(String[] args) {
        double salFunc, porAumento, valorPor, porNovoSal;
        
        System.out.println("Digite o salario do funcionario: ");
        salFunc = new Scanner(System.in).nextDouble();
        
        System.out.println("Digite o percentual de aumento: ");
        porAumento = new Scanner(System.in).nextDouble();
        
        valorPor = salFunc * porAumento / 100;
        porNovoSal = salFunc + valorPor;
        
        System.out.println("Aumento:"+valorPor+"\nNovo salario: "+porNovoSal);
        
    }
}
