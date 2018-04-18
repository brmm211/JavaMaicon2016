package cursoDeAluno;

import java.util.Scanner;

public class Aula_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("selecione um numero de 1 a 5");
        int num = input.nextInt();
        
        switch(num){
            case 1:
                System.out.println("vc escolheu 1");
                break;
            case 2: 
                System.out.println("vc escolheu 2");
                break;
            case 3: 
                System.out.println("vc escolheu 3");
                break;
            case 4: 
                System.out.println("vc escolheu 4");
                break;
            case 5: 
                System.out.println("vc escolheu 5");
                break;
            default:
                System.out.println("opçao invalida");
        }
    }
}
