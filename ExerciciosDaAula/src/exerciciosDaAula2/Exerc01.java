package exerciciosDaAula2;

public class Exerc01 {
    public static void main(String[] args) {
//      2005
        int ano = 2007;
        double func = 1000.00;
//      2006
        double aum = 0.015;
//      2007
        double aumTotal = func * aum;
        
        while (ano <= 2018) { 
        aumTotal=aumTotal*2;
//      System.out.println(aumTotal);
        ano++;
        }
        func+=aumTotal;
//      2018
        System.out.println(func);
        
        
        
    }
}
