package livraria;

public class Caixa <T extends Produto>{
    private Double saldo = 0d;

    public void comprarProduto(Estoque<T> estoque, T produto) {
        estoque.remover(produto);
        this.saldo += produto.getPreco();
    }
}
