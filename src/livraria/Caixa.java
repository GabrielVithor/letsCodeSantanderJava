package livraria;

import livraria.estoque.Estoque;
import livraria.produtos.Produto;

public class Caixa <T extends Produto>{
    private Double saldo = 0d;

    public void comprarProduto(Estoque<T> estoque, T produto) {
        estoque.remover(produto);
        this.saldo += produto.getPreco();
    }
}
