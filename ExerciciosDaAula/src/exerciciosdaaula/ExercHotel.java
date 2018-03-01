package exerciciosdaaula;

import java.util.Scanner;

public class ExercHotel {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double diaria = 115;
        int dias;
        String nome;
        
        System.out.println("Qual seu nome? ");
        nome = ler.nextLine();
        
        System.out.println("quantos dias quer ficar? ");
        dias = ler.nextInt();
        
        if (dias < 15) {
            diaria+= 12;
            System.out.println("o/a hospede "+nome+" pagará "+diaria+" a diaria");
        } else if (dias == 15) {
            diaria+= 10.50;
            System.out.println("o/a hospede "+nome+" pagará "+diaria+" a diaria");
            
        } else if (diaria > 15) {
            diaria+= 9;
            System.out.println("o/a hospede "+nome+" pagará "+diaria+" a diaria");
        }

        
        
        
        
        
    }
}
