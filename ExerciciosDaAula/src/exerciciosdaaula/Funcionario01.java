package exerciciosdaaula;

import java.util.Scanner;

public class Funcionario01 {
    public static void main(String[] args) {
        int codigo;
        
        System.out.print("digite o codigo do funcionario: ");
        codigo = new Scanner(System.in).nextInt();
        
        System.out.println("------ Cargo ------");
        switch(codigo){
            case 1:
                System.out.println("1 - Escriturário(a)");
                break;
            case 2:
                System.out.println("2 - Secretário(a)");
                break;
            case 3:
                System.out.println("3 - Caixa");
                break;
            case 4:
                System.out.println("4 - Gerente");
                break;
            case 5:
                System.out.println("5 - Diretor(a)");
                break;
            default:
                System.out.println("invalido");
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
