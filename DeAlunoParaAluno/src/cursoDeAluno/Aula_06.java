package cursoDeAluno;

import java.util.Scanner;

public class Aula_06 {

    public static void main(String[] args) {
        int x = 10;
        x += 5;

        System.out.println(x);

        Scanner input = new Scanner(System.in);

        System.out.println("qual seu nome: ");
        String nome = input.nextLine();

        System.out.println("qual seu sobrenome: ");
        String sobrenome = input.nextLine();

        System.out.println("qual sua idade: ");
        int idade = input.nextInt();

        System.out.println("Olá " + nome + " " + sobrenome + " de " + idade + " anos");

        if (idade < 1) {
            System.out.println("idade invalida");
        }else if((idade >= 1) && (idade < 18)){
            System.out.println("voce é menor de idade");
        }else{
            System.out.println("voce é maior de idade");
        }

    }
}
