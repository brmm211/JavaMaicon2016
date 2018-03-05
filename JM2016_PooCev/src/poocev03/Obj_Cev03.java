package poocev03;

public class Obj_Cev03 {
    private String modelo;
    private String cor;
    private int carga;
    private float ponta;

    public Obj_Cev03(int carga, float ponta, String modelo, String cor) {
        this.carga = carga;
        this.ponta = ponta;
        this.modelo = modelo;
        this.cor = cor;
    }
    
    public void status(){
        System.out.println("Modelo: "+getModelo());
        System.out.println("Cor: "+getCor());
        System.out.println("Carga: "+getCarga());
        System.out.println("Ponta: "+getPonta());
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

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    
    
    
    
    
    
    
    
    
}
