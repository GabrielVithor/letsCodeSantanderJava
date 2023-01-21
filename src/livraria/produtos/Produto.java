package livraria.produtos;

import livraria.Utils;

public abstract class Produto {
    private Utils utils = Utils.getInstance();
    private String nome = null;
    private Integer id;
    private Double preco = null;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.id = utils.getId();
        this.preco = preco;
    }

    private String categoria = this.getClass().getSimpleName();

    public String getNome() {
        return nome;
    }

    public Integer getId() {
        return id;
    }

    public Double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", id=" + id +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'';
    }
}
