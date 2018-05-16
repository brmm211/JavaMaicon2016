package controleBancario;

import java.util.Scanner;

public class ClassConta {
    private int conta, saques;
    private double saldo;
    
    public void exibirMenu(){
        System.out.println("-----Menu controle bancario-----");
        System.out.println("1. Efetuar deposito");
        System.out.println("2. Efetuar saque");
        System.out.println("3. Transferencia");
        // (isto é, o somatório dos saldos de todos os clientes)
        System.out.println("4. Consultar o ativo bancario");
        System.out.println("5. Finalizar");
    }
    
    public void opcao(){
        int opcao;
        System.out.println("digite a opçao: ");
        opcao = new Scanner(System.in).nextInt();
        escolherOpcao(opcao);
    }
    
    public void escolherOpcao(int opcao){
        double valor;
        
        switch(opcao){
            case 1:
                System.out.println("digite o valor que deseja depositar: ");
                valor = new Scanner(System.in).nextDouble();
                depositar(valor);
                break;
            case 2:
                if(saques<3){
                    System.out.println("digite o valor do saque: ");
                    valor = new Scanner(System.in).nextDouble();
                    sacar(valor);
                }else{
                    System.out.println("limite de saques");
                }
                break;
            case 5: 
                System.exit(0);
        }
    }
    
    public void depositar(double valor){
        saldo+=valor;
    }
    
    public void sacar(double valor){
        if(saldo >= valor){
            saldo-=valor;
            saques++;
        }else{
            System.out.println("saldo insulficiente");
        }
    }
    
    public void status(){
        System.out.println("numero da conta "+getConta());
        System.out.println("saldo "+getSaldo());
        
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getSaques() {
        return saques;
    }

    public void setSaques(int saques) {
        this.saques = saques;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
