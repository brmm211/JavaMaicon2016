package exerciciosloops;

public class ExerciciosLoops02 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < 200; i++) {
            if (i%4==0) {
                total+=i;
            }
            
        }
        
        System.out.println(total);
        
        
    }
}
