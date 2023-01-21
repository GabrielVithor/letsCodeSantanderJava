package livraria.repositorios;

import livraria.produtos.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Almoxarifado<T extends Produto> implements IEstoque<T> {
    Map<String, List<T>> estoqueGeral = new HashMap<>();
    private static Almoxarifado singleton = null;

    private Almoxarifado() {
    }

    public static Almoxarifado getAlmoxarifado() {
        if (singleton == null) {
            singleton = new Almoxarifado();
        }
        return singleton;
    }
    @Override
    public boolean adicionar(T produto) {
        try {
            if (estoqueGeral.containsKey(produto.getCategoria())) {
                estoqueGeral.get(produto.getCategoria()).add(produto);
            } else {
                estoqueGeral.put(produto.getCategoria(), new ArrayList<>() {{
                    add(produto);
                }});
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public boolean remover(T produto) {
        try {

            estoqueGeral.get(produto.getCategoria()).remove(produto);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public boolean ver(T produto) {
        try {
            if(containsProduto(produto)){
                System.out.println(getProduto(produto));
            }else {
                System.out.println("Produto não encontrado");
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return false;
    }
    @Override
    public boolean alterar(T produtoAtual, T produtoNovo) {
        try {
            List<T> produtos = estoqueGeral.get(produtoAtual.getCategoria());
            produtos.set(produtos.indexOf(produtoAtual), produtoNovo);
            estoqueGeral.put(produtoAtual.getCategoria(), produtos);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return false;
    }

    public Map<String, List<T>> getEstoqueGeral() {
        return estoqueGeral;
    }

    public T getProduto(T produto){
        if(containsProduto(produto)) {
            return estoqueGeral.get(produto.getCategoria()).get(estoqueGeral.get(produto.getCategoria()).indexOf(produto));
        }
        return null;
    }
    public boolean containsProduto(T produto){
        return estoqueGeral.get(produto.getCategoria()).contains(produto);
    }

    public Integer quantidadeProduto(T produto){
        Integer quantidadeProdutos = estoqueGeral.
                get(produto.getCategoria()).
                stream().filter(produtoF -> singleton.containsProduto(produtoF)).
                collect(Collectors.toList()).size();
      return quantidadeProdutos;
    };
    @Override
    public String toString() {
        return "EstoqueGeral{" +
                "estoqueGeral=" + estoqueGeral +
                '}';
    }
}