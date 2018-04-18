package exerciciosloops;
import java.util.Scanner;
public class ExerciciosLoops07 {
    public static void main(String[] args) {
        String senha = "";
        while (!"computador".equals(senha)) {            
            System.out.println("digite sua senha: ");
            senha = new Scanner(System.in).next();
        }
        System.out.println("Senha correta");
    }
}
