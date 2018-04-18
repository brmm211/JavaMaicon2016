package exerciciosDaAula4;

public class Exerc01 {
    public static void main(String[] args) {
        int linha = 10;
        int coluna = 10;
        int[][] num = new int[linha][coluna];
        
        
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                num[i][j] = 0;
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
