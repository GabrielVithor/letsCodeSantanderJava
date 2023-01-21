package livraria.produtos;

import livraria.Utils;

public class AlbunsMusica extends Produto {
    private String banda;
    private String generos;
    private String selos;

    @Override
    public String toString() {
        return "AlbunsMusica{"+super.toString()+
                "banda='" + banda + '\'' +
                ", generos='" + generos + '\'' +
                ", selos='" + selos + '\'' +
                '}';
    }

    public AlbunsMusica(String nome, Double preco, String banda, String generos, String selos) {
        super(nome, preco);
        this.banda = banda;
        this.generos = generos;
        this.selos = selos;


    }
}
