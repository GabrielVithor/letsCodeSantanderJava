package livraria.repositorios;

import livraria.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class Carrinho<T extends Produto> implements IEstoque<T>{
    private List<T> carrinho = new ArrayList<>();
    private Double valor = 0d;

    public double calculaValorCarrinho(){
        Double total = 0d;
        for (T produto: carrinho) {
            total+=produto.getPreco();
        }
        valor = total;
        return valor;
    }
    public List<T> getCarrinho() {
        return carrinho;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "carrinho=" + carrinho +
                ", \nvalor=" + valor +
                '}';
    }

    @Override
    public boolean adicionar(T produto) {
        this.carrinho.add(produto);
        calculaValorCarrinho();
        return false;
    }

    @Override
    public boolean remover(T produto) {
        if(containsProduto(produto)){
            this.carrinho.remove(produto);
            calculaValorCarrinho();
            return true;
        }
        return false;
    }

    @Override
    public boolean ver(T produto) {
        if(containsProduto(produto)){
            System.out.println(produto);
            return true;
        }
        return false;
    }

    @Override
    public boolean alterar(T produtoAtual, T produtoNovo) {
        if(containsProduto(produtoAtual)){
            carrinho.set(carrinho.indexOf(produtoAtual),produtoNovo);
            return true;
        }
        return false;
    }

    @Override
    public boolean containsProduto(T produto) {
        return carrinho.contains(produto);
    }
}
