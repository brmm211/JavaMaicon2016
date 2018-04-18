package cursoDeAluno;

import java.util.Random;
import java.util.Scanner;

public class Aula_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean acertou = false;
        int tentativas = 10;
        int numeroSecreto = random.nextInt(50);
        long chute = 0;
        
        System.out.println(numeroSecreto);
        while(tentativas > 0 && acertou == false){
            System.out.println("digite um numero: ");
            chute = input.nextLong();
            
            if(numeroSecreto == chute){
                System.out.println("voce acertou!!!");
                acertou = true;
            }else if(chute < numeroSecreto){
                --tentativas;
                System.out.println("numero muito pequeno " + tentativas + " restantes");
                acertou = false;
            }else{
                --tentativas;
                System.out.println("numero muito grande " + tentativas + " restantes");
            }
        }
        
    }
}
