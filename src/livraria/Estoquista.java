package livraria;

import livraria.estoque.Estoque;
import livraria.estoque.EstoqueGeral;
import livraria.produtos.Produto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estoquista{
    String nome;
    Map<String, List> estoqueGeral;
    private static EstoqueGeral singleton = null;

    public Estoquista(String nome) {
        this.nome = nome;
        this.singleton = EstoqueGeral.getInstance();
        this.estoqueGeral = singleton.getEstoqueGeral();
    }

    private Map<String, List> getEstoqueGeral() {
        return estoqueGeral;
    }

    public List listarProdutosPorCategoria(Enum categoria){
        System.out.println(estoqueGeral.get(categoria.name()));
        return estoqueGeral.get(categoria.name());
    };

    public  Map<String,List> listarProdutos(){
        System.out.println(estoqueGeral);
        return estoqueGeral;
    };

    public  Integer mostrarQuantidadePorCategoria(Enum categoria){
        Integer quantidadeCategoria =  estoqueGeral.get(categoria.name()).size();
        System.out.println(quantidadeCategoria);
        return quantidadeCategoria;
    }

    public void comprarProduto(Estoque<T> estoque, T produto) {
        estoque.remover(produto);
        this.saldo += produto.getPreco();
    }

}
