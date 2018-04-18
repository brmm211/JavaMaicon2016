package exerciciosloops;
public class ExerciciosLoops03 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i < 100; i++) {
            if (i%3==0 && i%7==0) {
                total=i;
                System.out.println(total);
            }
        }
    }
}
