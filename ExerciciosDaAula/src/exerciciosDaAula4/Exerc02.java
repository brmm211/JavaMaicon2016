package exerciciosDaAula4;

public class Exerc02 {
    public static void main(String[] args) {
        int linha = 5;
        int coluna = 5;
        int[][] num = new int[linha][coluna];
        
        int k = 1;
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                num[i][j] = k++;
            }
        }
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
