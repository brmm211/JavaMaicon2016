package livrodelivraria;

public class ClasseLivro {

//PESO	0.223 Kg
//PRODUTO SOB ENCOMENDA	Não
//MARCA	Gryphus
//I.S.B.N.	9788583110552
//ALTURA	21.00 cm
//LARGURA	14.00 cm
//PROFUNDIDADE	1.50 cm
//NÚMERO DE PÁGINAS	224
//IDIOMA	Português
//ACABAMENTO	Capa dura
//CÓD. BARRAS	9788583110552
//NÚMERO DA EDIÇÃO	2
//ANO DA EDIÇÃO	2016
//SELLER ID	1
    private String autor;
    private String marca;
    private String titulo;
    private String dimensoes;
    private int numeroPaginas;
    private String idioma;
    private String acabamento;
    private int anoEdicao;
    private String categoria;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getAcabamento() {
        return acabamento;
    }

    public void setAcabamento(String acabamento) {
        this.acabamento = acabamento;
    }

    public int getAnoEdicao() {
        return anoEdicao;
    }

    public void setAnoEdicao(int anoEdicao) {
        this.anoEdicao = anoEdicao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void status(){
        System.out.println("Autor: "+getAutor());
        System.out.println("Marca: "+getMarca());
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Dimençoes: "+getDimensoes());
        System.out.println("Numero de paginas: "+getNumeroPaginas());
        System.out.println("Idioma: "+getIdioma());
        System.out.println("Acabamento: "+getAcabamento());
        System.out.println("Ano de ediçao: "+getAnoEdicao());
        System.out.println("Categoria: "+getCategoria());
    }
    
    
}
