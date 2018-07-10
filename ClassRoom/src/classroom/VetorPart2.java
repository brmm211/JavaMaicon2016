package classroom;

import java.util.Arrays;
import java.util.Scanner;

public class VetorPart2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] vetor = new double[3];
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("digite o valor do vetor: ");
            vetor[i] = ler.nextDouble();
        }
            System.out.println("vetor: "+Arrays.toString(vetor));
        
    }
}
