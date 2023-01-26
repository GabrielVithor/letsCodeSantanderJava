package livraria.repositorios;

import livraria.produtos.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Estoque<T extends Produto> extends EstoqueUtils<T> implements IEstoque<T>{
    Map<String, List<T>> estoque = new HashMap<>();


    private static Estoque singleton = null;

    private Estoque() {
    }

    public static Estoque getEstoqueGeral() {
        if (singleton == null) {
            singleton = new Estoque();
        }
        return singleton;
    }

    @Override
    public boolean adicionar(T produto) {
        try {
            if (containsCategoria(produto)) {
                estoque.get(produto.getCategoria()).add(produto);
            } else {
                estoque.put(produto.getCategoria(), new ArrayList<>() {{
                    add(produto);
                }});
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public boolean remover(T produto) {
        try {
            if (containsCategoria(produto) && containsProduto(produto)) {
                estoque.get(produto.getCategoria()).remove(produto);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public boolean ver(T produto) {
        try {
            if (containsCategoria(produto) && containsProduto(produto)) {
                System.out.println(getProduto(produto));
            } else {
                System.out.println("Produto não encontrado");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public boolean alterar(T produtoAtual, T produtoNovo) {
        try {
            if (containsCategoria(produtoAtual) && containsProduto(produtoAtual) && (containsCategoria(produtoAtual) == containsCategoria(produtoNovo))) {
                List<T> produtos = estoque.get(produtoAtual.getCategoria());
                produtos.set(produtos.indexOf(produtoAtual), produtoNovo);
                estoque.put(produtoAtual.getCategoria(), produtos);
                return true;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public Map<String, List<T>> getEstoque() {
        return this.estoque;
    }


    @Override
    public String toString() {
        return "EstoqueGeral{" +
                "estoqueGeral=" + estoque +
                '}';
    }
}