package poocev06;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovado(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar(){
        if (this.isAprovado()) {
            System.out.println("---- desafiado ----");
            this.getDesafiado().apresentar();
            System.out.println("---- desafiante ----");
            this.getDesafiante().apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            switch(vencedor){
                case 0: //empate
                    System.out.println("empatou!!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    this.getDesafiado().status();
                    this.getDesafiante().status();
                    break;
                case 1: // vitoria desafiado
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    this.getDesafiado().status();
                    this.getDesafiante().status();
                    break;
                case 2: // vitoria desafiante
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().status();
                    this.getDesafiante().status();
                    break;
            }
            
        }else{
            System.out.println("a luta nao pode acontecer!!");
        }
        
        
    }
    
    
}
