package exercfundestatistica;

import java.util.Scanner;

public class ExercFundEstatistica01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String estuda, trabalha, sim1 = "sim", sim2 = "Sim", oqueTrabalhaValor = "", oqueEstudaValor = "";
        int oqueEstuda = 0, oqueTrabalha = 0;

        System.out.println("Voce estuda? sim ou nao: ");
        estuda = input.next();

        oqueEstuda = seEstuda(estuda, sim1, sim2, oqueEstuda, input);

        oqueEstudaValor = switchEstuda(oqueEstuda, oqueEstudaValor);

        System.out.println("Voce trabalha? Sim ou Nao");
        trabalha = input.next();

        oqueTrabalha = seTrabalha(trabalha, sim1, sim2, oqueTrabalha, input);

        oqueTrabalhaValor = switchTrabalha(oqueTrabalha, oqueTrabalhaValor, input);

        System.out.println("Estuda: " + oqueEstudaValor + ", Trabalha: " + oqueTrabalhaValor);

    }

    public static String switchTrabalha(int oqueTrabalha, String oqueTrabalhaValor, Scanner input) {
        String oqueTrabalhaSe;
        switch (oqueTrabalha) {
            case 1:
                oqueTrabalhaValor = "(1)analista de sistemas";
                break;
            case 2:
                oqueTrabalhaValor = "(2)engenheiro";
                break;
            case 3:
                oqueTrabalhaValor = "(3)eletricista";
                break;
            case 4:
                oqueTrabalhaValor = "(4)mecanico";
                break;
            case 5:
                System.out.println("se outro, qual? Escreva sem usar espaços!");
                oqueTrabalhaSe = input.next();
                oqueTrabalhaValor = oqueTrabalhaSe;
                break;
            default:
                System.out.println("nada");
        }
        return oqueTrabalhaValor;
    }

    public static int seTrabalha(String trabalha, String sim1, String sim2, int oqueTrabalha, Scanner input) {
        if ((trabalha.equals(sim1)) || (trabalha.equals(sim2))) {
            System.out.println("Use os numeros nos parenteses para indicar!!");
            System.out.println("(1)analista de sistemas");
            System.out.println("(2)engenheiro");
            System.out.println("(3)eletricista");
            System.out.println("(4)mecanico");
            System.out.println("(5)outro");
            System.out.println("-----------------------");
            System.out.print("No que vc trabalha? ");
            oqueTrabalha = input.nextInt();
        }
        return oqueTrabalha;
    }

    public static String switchEstuda(int oqueEstuda, String oqueEstudaValor) {
        switch (oqueEstuda) {
            case 1:
                oqueEstudaValor = "(1)ensino fundamental";
                break;
            case 2:
                oqueEstudaValor = "(2)ensino medio";
                break;
            case 3:
                oqueEstudaValor = "(3)ensino tecnico";
                break;
            case 4:
                oqueEstudaValor = "(4)ensino superior";
                break;
            default:
                System.out.println("nada");
        }
        return oqueEstudaValor;
    }

    public static int seEstuda(String estuda, String sim1, String sim2, int oqueEstuda, Scanner input) {
        if ((estuda.equals(sim1)) || (estuda.equals(sim2))) {
            System.out.println("Use os numeros nos parenteses para indicar!!");
            System.out.println("(1)ensino fundamental");
            System.out.println("(2)ensino medio");
            System.out.println("(3)ensino tecnico");
            System.out.println("(4)ensino superior");
            System.out.println("-----------------------");
            System.out.print("O que vc esta cursando? ");
            oqueEstuda = input.nextInt();
        }
        return oqueEstuda;
    }

}
