package exerciciosDaAula;

class ClasseExerc01 {
    private int soma;
    public int somar(int x1, int x2){
         int soma1 = soma;
        soma = x1 + x2;
        return soma1;
    }
    
    public void mostrar(){
        System.out.println("soma é: "+getSoma());
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }
}
