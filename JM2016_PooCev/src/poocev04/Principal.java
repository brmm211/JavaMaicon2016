package poocev04;

public class Principal {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(11111);
        c1.abrirConta("cc");
        c1.setDono("maicon");
        
        c1.estadoAtual();
        
        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(22222);
        c2.setSaldo(5);
        c2.fecharConta();
        c2.setDono("akira");
        
        c2.estadoAtual();
        
    }
}
