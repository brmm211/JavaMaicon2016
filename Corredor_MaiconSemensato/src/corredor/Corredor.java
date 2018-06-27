package corredor;

import java.util.Scanner;

public class Corredor {

    private String nome;
    private int numero;
    private double salto1;
    private double salto2;
    private double salto3;
    private double salto4;
    private double salto5;

    public Corredor(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.salto1 = 0;
        this.salto2 = 0;
        this.salto3 = 0;
        this.salto4 = 0;
        this.salto5 = 0;
    }

    public void nomeCorredor() {
        setNome(new Scanner(System.in).nextLine());
    }

    public void numeroCorredor() {
        setNumero(new Scanner(System.in).nextInt());
    }

    public void digiteSaltos() {
        System.out.println("Digite o 1º salto: ");
        setSalto1(new Scanner(System.in).nextDouble());
        System.out.println("Digite o 2º salto: ");
        setSalto2(new Scanner(System.in).nextDouble());
        System.out.println("Digite o 3º salto: ");
        setSalto3(new Scanner(System.in).nextDouble());
        System.out.println("Digite o 4º salto: ");
        setSalto4(new Scanner(System.in).nextDouble());
        System.out.println("Digite o 5º salto: ");
        setSalto5(new Scanner(System.in).nextDouble());
    }

    public double melhorPiorMedia() {
        double mediaPiorMelhor[] = {getSalto1(), getSalto2(), getSalto3(), getSalto4(), getSalto5()};

        for (int i = 0; i < mediaPiorMelhor.length; i++) {

            for (int j = 0; j < mediaPiorMelhor.length - 1; j++) {
                if (mediaPiorMelhor[j] > mediaPiorMelhor[j + 1]) {
                    double aux = mediaPiorMelhor[j];
                    mediaPiorMelhor[j] = mediaPiorMelhor[j + 1];
                    mediaPiorMelhor[j + 1] = aux;

                }

            }

        }
        double media;
        media = (mediaPiorMelhor[1] + mediaPiorMelhor[2] + mediaPiorMelhor[3]) / 3;
        return media;
    }

    public double piorSalto() {
        double mediaPiorMelhor[] = {getSalto1(), getSalto2(), getSalto3(), getSalto4(), getSalto5()};

        for (int i = 0; i < mediaPiorMelhor.length; i++) {

            for (int j = 0; j < mediaPiorMelhor.length - 1; j++) {
                if (mediaPiorMelhor[j] > mediaPiorMelhor[j + 1]) {
                    double aux = mediaPiorMelhor[j];
                    mediaPiorMelhor[j] = mediaPiorMelhor[j + 1];
                    mediaPiorMelhor[j + 1] = aux;

                }

            }

        }
        double piorSalto;
        piorSalto = mediaPiorMelhor[0];
        return piorSalto;
    }

    public double melhorSalto() {
        double mediaPiorMelhor[] = {getSalto1(), getSalto2(), getSalto3(), getSalto4(), getSalto5()};

        for (int i = 0; i < mediaPiorMelhor.length; i++) {

            for (int j = 0; j < mediaPiorMelhor.length - 1; j++) {
                if (mediaPiorMelhor[j] > mediaPiorMelhor[j + 1]) {
                    double aux = mediaPiorMelhor[j];
                    mediaPiorMelhor[j] = mediaPiorMelhor[j + 1];
                    mediaPiorMelhor[j + 1] = aux;

                }

            }

        }
        double melhorSalto;
        melhorSalto = mediaPiorMelhor[4];
        return melhorSalto;
    }

    public void mostrarMediaSaltos() {
        System.out.println("Média dos saltos: " + media());
    }

    public void mostrarMelhorPiorMedia() {
        System.out.println("Saltos validos: " + melhorPiorMedia());
    }

    public void mostrarPiorSalto() {
        System.out.println("Pior Salto: " + piorSalto());
    }

    public void mostrarMelhorSalto() {
        System.out.println("Melhor Salto: " + melhorSalto());
    }

    public double media() {
        double m = (getSalto1() + getSalto2() + getSalto3() + getSalto4() + getSalto5()) / 5;
        return m;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSalto1() {
        return salto1;
    }

    public void setSalto1(double salto1) {
        this.salto1 = salto1;
    }

    public double getSalto2() {
        return salto2;
    }

    public void setSalto2(double salto2) {
        this.salto2 = salto2;
    }

    public double getSalto3() {
        return salto3;
    }

    public void setSalto3(double salto3) {
        this.salto3 = salto3;
    }

    public double getSalto4() {
        return salto4;
    }

    public void setSalto4(double salto4) {
        this.salto4 = salto4;
    }

    public double getSalto5() {
        return salto5;
    }

    public void setSalto5(double salto5) {
        this.salto5 = salto5;
    }

    public void mostrarCorredor() {
        System.out.println("Nome do corredor: " + getNome());
        System.out.println("Numero do corredor: " + getNumero());
        mostrarMelhorPiorMedia();
        mostrarMediaSaltos();
        mostrarMelhorSalto();
        mostrarPiorSalto();

    }

}
