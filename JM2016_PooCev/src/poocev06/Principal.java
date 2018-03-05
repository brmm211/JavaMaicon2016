package poocev06;

public class Principal {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty boy", "brasil", 22, 1.80, 84.5, 10, 3, 6);
        l[1] = new Lutador("maicon", "brasileiro", 22, 1.93, 85.5, 12, 6, 8);
        l[2] = new Lutador("diogo", "viades", 11, 1.50, 90.1, 2, 10, 2);
        l[3] = new Lutador("rico", "libanes", 46, 1.70, 78.2, 9, 6, 5);
        l[4] = new Lutador("mae", "desconhecida", 60, 1.64, 75.3, 10, 0, 5);
        l[5] = new Lutador("akira", "javanes", 22, 1.80, 78.5, 12, 5, 6);
        
        Luta luta1 = new Luta();
        luta1.marcarLuta(l[0], l[1]);
        luta1.lutar();
    }
}
