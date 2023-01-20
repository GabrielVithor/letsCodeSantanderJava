package livraria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstoqueGeral implements IEstoque<Produto> {
    Map<String, List<Produto>> estoqueGeral = new HashMap<>();
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
    public void adicionar(Produto produto) {
        if(estoqueGeral.containsKey(produto.getCategoria())){
            estoqueGeral.get(produto.getCategoria()).add(produto);
        }else{
            estoqueGeral.put(produto.getCategoria(),new ArrayList<>(){{add(produto);}});
        }
    }

    @Override
    public void remover(Produto produto) {
        estoqueGeral.get(produto.getCategoria()).remove(produto);
    }

    @Override
    public void ver(Produto produto) {
        System.out.println(estoqueGeral.get(produto.getCategoria()).indexOf(produto));
    }

    @Override
    public void alterar(Produto produtoAtual, Produto produtoNovo) {
        List<Produto> produtos = estoqueGeral.get(produtoAtual.getCategoria());
        produtos.set(produtos.indexOf(produtoAtual),produtoNovo);
        estoqueGeral.put(produtoAtual.getCategoria(),produtos);
    }

    public Map<String, List<Produto>> getEstoqueGeral() {
        return estoqueGeral;
    }
}