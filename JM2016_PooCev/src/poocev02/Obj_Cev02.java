package poocev02;

public class Obj_Cev02 {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Modelo: "+getModelo());
        System.out.println("Uma caneta: "+getCor());
        System.out.println("Ponta: "+getPonta());
        System.out.println("Carga:"+getCarga());
        System.out.println("Está tampada? "+isTampada());
    }
    
    public void rabiscar(){
        if (this.tampada == true) {
            System.out.println("Nao posso rabiscar");
        }else{
            System.out.println("posso rabiscar");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    
    
    
    
}
