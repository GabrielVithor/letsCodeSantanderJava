package livraria.produtos;

public class Filmes extends   Produto{
    private String estudio;
    private String diretores;
    private String generos;
    private String produtores;

    @Override
    public String toString() {
        return "Filmes{" +
                super.toString()+
                "estudio='" + estudio + '\'' +
                ", diretores='" + diretores + '\'' +
                ", generos='" + generos + '\'' +
                ", produtores='" + produtores + '\'' +
                '}';
    }

    public Filmes(String nome, Double preco, String estudio, String diretores, String generos, String produtores) {
        super(nome, preco);
        this.estudio = estudio;
        this.diretores = diretores;
        this.generos = generos;
        this.produtores = produtores;


    }
}
