package jm2016poocev;

public class Poo_Objeto {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        
        if (tampada) {
        System.out.println("Esta tampada!");
        }else{
        System.out.println("nao esta tampada");
        
        
        }
    }
    
    void rabiscar(){
        if (tampada) {
            System.out.println("nao posso rabiscar!");
        }else{
            System.out.println("estou rabiscando!");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
    
}
