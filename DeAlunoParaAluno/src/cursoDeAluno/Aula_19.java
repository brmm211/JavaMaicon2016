package cursoDeAluno;

public class Aula_19 {
    public static void main(String[] args) {
        
        double[] aaa = {12.0, 32.8, 43.5, 89.2};
        double[] ccc = inverterVetor(aaa);
        
        for (int i = 0; i < ccc.length; i++) {
            System.out.println(ccc[i]);
            
        }
        
        
        
        
    }
    public static double[] inverterVetor(double[] abc){
        double[] xyz = new double[abc.length];
        
        for (int i = 0, j = xyz.length -1; i < abc.length; i++, j--) {
            xyz[j] = abc[i];
            
        }
        return xyz;
    }
}
