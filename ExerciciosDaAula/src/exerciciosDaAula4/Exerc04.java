package exerciciosDaAula4;

public class Exerc04 {
    public static void main(String[] args) {
        
        int valorM = 8;
        int [][] matriz8x8 = new int[valorM][valorM];
        
        int k = 0;
        for (int i = 0; i < matriz8x8.length; i++) {
            for (int j = 0; j < matriz8x8.length; j++) {
                    matriz8x8[i][j] = i;
            }
        }
        for (int i = 0; i < matriz8x8.length; i++) {
            for (int j = 0; j < matriz8x8.length; j++) {
                    System.out.print(matriz8x8[i][j]);
            }
            System.out.println("");
        }
        
    }
}
