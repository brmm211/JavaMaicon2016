package lampadaDeMercado;

public class TesteLampada {
    public static void main(String[] args) {
        ClasseLampada lampada1 = new ClasseLampada();
        
        lampada1.setMarca("philips");
        lampada1.setModelo("ph1122");
        lampada1.setTecnologia("led");
        lampada1.setCor("azul");
        lampada1.setVidaUtil(1000);
        lampada1.setPotencia(50);
        
        boolean ligada = lampada1.ligar();
        lampada1.status();
        System.out.println("ligada: "+ligada);
        
    }
}
