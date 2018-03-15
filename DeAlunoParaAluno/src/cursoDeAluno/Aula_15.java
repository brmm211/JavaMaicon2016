package cursoDeAluno;

public class Aula_15 {
    public static void main(String[] args) {
        double[][] vetor = new double[3][3];
        
        for (int i = 0; i < vetor.length; i++) {
            
            for (int j = 0; j < vetor[i].length; j++) {
                System.out.print(vetor[i][j] +" ");
                
            }
            System.out.println("\n");
        }
    }
}
