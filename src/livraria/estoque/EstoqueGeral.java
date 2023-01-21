package livraria.estoque;

import livraria.produtos.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class EstoqueGeral<T extends Produto> implements IEstoque<T> {
    Map<String, List<T>> estoqueGeral = new HashMap<>();
    private static EstoqueGeral singleton = null;

    private EstoqueGeral() {
    }

    public static EstoqueGeral getInstance() {
        if (singleton == null) {
            singleton = new EstoqueGeral();
        }
        return singleton;
    }

    @Override
    public void adicionar(T produto) {
        if(estoqueGeral.containsKey(produto.getCategoria())){
            estoqueGeral.get(produto.getCategoria()).add(produto);
        }else{
            estoqueGeral.put(produto.getCategoria(),new ArrayList<>(){{add(produto);}});
        }
    }

    @Override
    public void remover(T produto) {
        estoqueGeral.get(produto.getCategoria()).remove(produto);
    }

    @Override
    public void ver(T produto) {
        System.out.println(estoqueGeral.get(produto.getCategoria()).indexOf(produto));
    }

    @Override
    public void alterar(T produtoAtual, T produtoNovo) {
        List<T> produtos = estoqueGeral.get(produtoAtual.getCategoria());
        produtos.set(produtos.indexOf(produtoAtual),produtoNovo);
        estoqueGeral.put(produtoAtual.getCategoria(),produtos);
    }

    public Map<String, List<T>> getEstoqueGeral() {
        return estoqueGeral;
    }

    @Override
    public String toString() {
        return "EstoqueGeral{" +
                "estoqueGeral=" + estoqueGeral +
                '}';
    }
}