package exerpoocev;

public class Livros implements Publicacao {

    private String livro;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoas leitor;

    public Livros(String livro, String autor, int totalPag, Pessoas leitor) {
        this.livro = livro;
        this.autor = autor;
        this.totalPag = totalPag;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livros{" + "livro=" + livro + ", autor=" + autor
                + ", \ntotalPag=" + totalPag + ", pagAtual=" + pagAtual
                + ", aberto=" + aberto + ", \nleitor=" + leitor.getNome() + '}';
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPag() {
        return totalPag;
    }

    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoas getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoas leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p > this.getTotalPag()) {
            this.setPagAtual(0);
        } else {
            this.setPagAtual(p);
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(getPagAtual() - 1);

    }

}
