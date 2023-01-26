package livraria.repositorios;

import livraria.Desconto;
import livraria.produtos.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carrinho<T extends Produto> extends EstoqueUtils<T> implements IEstoque<T> {
    Map<String, List<T>> estoque = new HashMap<>();
    private Double valor = 0d;

    public void calculaValorCarrinho(){
        Double total = 0d;
        for(List<T> list : estoque.values()){
            for(T produto : list){
                total+= produto.getPreco();
                System.out.println("SOMANDO COMPRA: "+ total);
            }
        }
        valor = total - Desconto.aplicarDesconto(this);
    }
    @Override
    public String toString() {
        return "Carrinho{" +
                "carrinho=" + estoque +
                ", \nvalor=" + valor +
                '}';
    }

    @Override
    public boolean adicionar(T produto) {
            if (containsCategoria(produto)) {
                estoque.get(produto.getCategoria()).add(produto);
                calculaValorCarrinho();
            } else {
                estoque.put(produto.getCategoria(), new ArrayList<>() {{
                    add(produto);
                    calculaValorCarrinho();
                }});
            }
        return false;
    }


    @Override
    public boolean remover(T produto) {
        if (containsCategoria(produto) && containsProduto(produto)) {
            estoque.get(produto.getCategoria()).remove(produto);
            calculaValorCarrinho();
            return true;
        }
        return false;
    }

    @Override
    public boolean ver(T produto) {
        if (containsCategoria(produto) && containsProduto(produto)) {
            System.out.println(getProduto(produto));
        } else {
            System.out.println("Produto não encontrado");
        }
        return false;
    }

    @Override
    public boolean alterar(T produtoAtual, T produtoNovo) {
        if (containsCategoria(produtoAtual) && containsProduto(produtoAtual) && (containsCategoria(produtoAtual) == containsCategoria(produtoNovo))) {
            List<T> produtos = estoque.get(produtoAtual.getCategoria());
            produtos.set(produtos.indexOf(produtoAtual), produtoNovo);
            estoque.put(produtoAtual.getCategoria(), produtos);
            calculaValorCarrinho();
            return true;
        }
        return false;
    }
    @Override
    public Map<String, List<T>> getEstoque() {
        return this.estoque;
    }

    public Double getValor() {
        return valor;
    }
}
