package livraria.estoque;

import livraria.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class Estoque<T extends Produto> implements IEstoque<T> {
    List<T> estoque = new ArrayList<>();
    EstoqueGeral estoqueGeral = EstoqueGeral.getInstance();

    public void adicionar(T produto){
        estoque.add(produto);
        estoqueGeral.adicionar(produto);
    }
    public void remover(T produto){
        estoque.remove(produto);
        estoqueGeral.remover(produto);
    }
    public void ver(T produto){
        estoqueGeral.ver(produto);
    }

    public void alterar(T produtoAtual,T produtoNovo){
        estoque.set(estoque.indexOf(produtoAtual),produtoNovo);
        estoqueGeral.alterar(produtoAtual,produtoNovo);
    }

    public List<T> getEstoque() {
        return estoque;
    }


}
