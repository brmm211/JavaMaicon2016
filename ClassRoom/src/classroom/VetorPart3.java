package classroom;

import java.util.Arrays;

public class VetorPart3 {

    public static void main(String[] args) {

        double[][] vetor = new double[3][4];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("vetor: ");
            for (int j = 0; j < vetor[i].length; j++) {
                System.out.print(vetor[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
