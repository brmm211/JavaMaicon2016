package exerpoocev;

public class ExerPooCev01 {

    public static void main(String[] args) {
        Pessoas[] p = new Pessoas[2];
        Livros[] l = new Livros[3];
        
        p[0] = new Pessoas("maicon", 22, "M");
        
        l[0] = new Livros("Poo", "guana", 200, p[0]);
        l[0].abrir();
        l[0].folhear(100);
        System.out.println(l[0].detalhes());
    }   
}
