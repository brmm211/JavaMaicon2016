package cursoDeAluno;

import java.util.Scanner;


public class Aula_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o peso em gramas");
        int gramas = input.nextInt();
        
        int peso = gramas / 1000;
        gramas = gramas % 1000;
        
        System.out.println("quilos: " +peso);
        System.out.println("gramas: "+gramas);
    }
}
