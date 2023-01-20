package livraria;

public abstract class Produto {
    private Utils utils = Utils.getInstance();
    private String nome = null;
    private Integer id = utils.getId();
    private Double preco = null;

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
}
