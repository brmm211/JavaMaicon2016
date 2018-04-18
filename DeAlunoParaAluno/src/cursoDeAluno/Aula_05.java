package cursoDeAluno;

public class Aula_05 {
    public static void main(String[] args) {
        
        long totalMilisegundos = System.currentTimeMillis()-10800000;
        long totalSegundos = totalMilisegundos / 1000;
        long segundosAtuais = totalSegundos % 60;
        
        long totalMinutos = totalSegundos / 60;
        long minutosAtuais = totalMinutos % 60;
        
        long totalHora = totalMinutos / 60;
        long horasAtuais = totalHora % 24;
        System.out.println(horasAtuais + ":" + minutosAtuais +":" + segundosAtuais);
        
    }
}
