package aula43;

public class Aula_43 {
    public static void main(String[] args) {
        
        TV tv1 = new TV();
        
        System.out.println("esta televisao é da marca "+tv1.fabricante+". "
                + "A televisao esta "+(tv1.ligado == true ? "ligada" : "desligada")+". O volume é "+tv1.volume);
        
        tv1.ligar();
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        
        System.out.println("esta televisao é da marca "+tv1.fabricante+". "
                + "A televisao esta "+(tv1.ligado == true ? "ligada" : "desligada")+". O volume é "+tv1.volume);
        
    }
    
}
