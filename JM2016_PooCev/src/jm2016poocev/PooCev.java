package jm2016poocev;

public class PooCev {

    public static void main(String[] args) {
        Poo_Objeto obj1 = new Poo_Objeto();
        obj1.modelo = "bic";
        obj1.cor = "azul";
        obj1.ponta = 0.5f;
        obj1.carga = 100;
        obj1.tampar();
        
        obj1.status();
        obj1.rabiscar();
    }
    
}
