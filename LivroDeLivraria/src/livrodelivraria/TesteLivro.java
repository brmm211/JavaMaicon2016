package livrodelivraria;

public class TesteLivro {

    public static void main(String[] args) {
        ClasseLivro livro1 = new ClasseLivro();
        
        livro1.setAutor("Eric krypke");
        livro1.setMarca("Gryphus");
        livro1.setTitulo("Supernatural");
        livro1.setDimensoes("21x14x1.50");
        livro1.setNumeroPaginas(224);
        livro1.setIdioma("Portugues");
        livro1.setAcabamento("Capa dura");
        livro1.setAnoEdicao(2016);
        livro1.setCategoria("Ficçao");
        
        livro1.status();
    }
    
}
