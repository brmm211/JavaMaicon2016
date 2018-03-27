package exerciciosDaAula1;

import java.util.Scanner;

public class Funcionario02 {

    public static void main(String[] args) {
        int codigo;
        double salario, aumento;
        System.out.print("digite o codigo do funcionario: ");
        codigo = new Scanner(System.in).nextInt();

        System.out.println("------ Cargo ------");
        switch (codigo) {
            case 1:
                salario = 1500;
                System.out.println("1 - Escriturário(a) - Salario: " + salario);
                aumento = salario * 0.5;
                salario += aumento;
                System.out.println("novo salario: " + salario);
                break;
            case 2:
                salario = 1000;
                System.out.println("2 - Secretário(a) - Salario: " + salario);
                aumento = salario * 0.35;
                salario += aumento;
                System.out.println("novo salario: " + salario);
                break;
            case 3:
                salario = 800;
                System.out.println("3 - Caixa - Salario: "+salario);
                aumento = salario*0.2;
                salario+=aumento;
                System.out.println("novo salario: "+salario);
                break;
            case 4:
                salario = 2000;
                System.out.println("4 - Gerente - Salario: "+salario);
                aumento = salario*0.1;
                salario+=aumento;
                System.out.println("novo salario: "+salario);
                break;
            case 5:
                salario = 5000;
                System.out.println("5 - Diretor(a) - Salario: "+salario);
                aumento = salario * 0;
                salario+=aumento;
                if (salario == 5000) {
                    System.out.println("nao teve aumento");
                }else{
                    System.out.println("novo salario: "+salario);
                }
                break;
            default:
                System.out.println("invalido");
        }
    }
}
