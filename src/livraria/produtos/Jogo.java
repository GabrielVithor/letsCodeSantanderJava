package livraria.produtos;

public class Jogo extends Produto{
    private String distribuidora;
    private String genero;
    private String estudio;

    @Override
    public String toString() {
        return "Jogo{" +super.toString()+
                "distribuidora='" + distribuidora + '\'' +
                ", genero='" + genero + '\'' +
                ", estudio='" + estudio + '\'' +
                '}';
    }

    public Jogo(String nome, Double preco, String distribuidora, String genero, String estudio) {
        super(nome, preco);
        this.distribuidora = distribuidora;
        this.genero = genero;
        this.estudio = estudio;


    }
}
