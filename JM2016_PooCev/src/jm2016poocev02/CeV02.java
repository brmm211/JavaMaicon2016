package jm2016poocev02;

public class CeV02 {

    public static void main(String[] args) {
        Obj_Cev02 obj1 = new Obj_Cev02();
//        obj1.modelo = "big cristal";
//        obj1.cor = "azul";
//        obj1.ponta = 0.5f;
//        obj1.carga = 90;
//        obj1.destampar();
//
//        obj1.status();
//        obj1.rabiscar();


        obj1.setModelo("big cristal");
        obj1.setCor("azul");
        obj1.setPonta(0.5f);
        obj1.setCarga(90);
        
        obj1.status();
        obj1.rabiscar();
    }
}
