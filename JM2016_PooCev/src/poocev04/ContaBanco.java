package poocev04;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public void estadoAtual(){
        System.out.println("--------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.isStatus());
        System.out.println("--------------------------");
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("cc".equals(t)) {
            this.setSaldo(50);
        } else if ("cp".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("conta aberta com sucesso");    
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta nao pode ser fechada porque ainda possui saldo");
        }else if (this.getSaldo() < 0) {
            System.out.println("conta nao pode ser fechada porque possui debito");
        }else{
            this.setStatus(false);
        System.out.println("conta fechada com sucesso");
        }
    }
    
    public void depositar(float v){
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
        }else{
            System.out.println("conta nao encontrada");
        }
        System.out.println("novo saldo"+this.getSaldo());
    }
    
    public void sacar(float v){
        if (this.isStatus()) {
            if (this.getSaldo() >= v) {
            this.setSaldo(this.getSaldo() - v);
            }
        }else{
            System.out.println("conta nao encontrada");
        }
        System.out.println("novo saldo: "+this.getSaldo());
    }
    
    public void pagarMensal(){
        int v = 0;
        if ("cc".equals(this.getTipo())) {
            v = 12;
        }else if ("cp".equals(this.getTipo())) {
            v = 20;
        }
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - v);
        }else{
            System.out.println("conta nao encontrada");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    
    
}
