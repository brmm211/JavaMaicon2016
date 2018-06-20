package lampadaDeMercado;

public class ClasseLampada {
    
    private String marca;
    private String modelo;
    private String tecnologia;
    private String cor;
    private int vidaUtil;
    private int potencia;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public void status(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Tecnologia: "+getTecnologia());
        System.out.println("Cor: "+getCor());
        System.out.println("Vida Util: "+getVidaUtil()+" Horas");
        System.out.println("Potencia: "+getPotencia()+" watts");
    }
    
    public boolean ligar(){
        return true;
    }
    
    public boolean desligar(){
        return false;
    }
    
}
