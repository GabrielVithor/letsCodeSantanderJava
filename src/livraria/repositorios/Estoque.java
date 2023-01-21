package livraria.repositorios;

import livraria.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class Estoque<T extends Produto> implements IEstoque<T> {
    List<T> estoque = new ArrayList<>();
    Almoxarifado estoqueGeral = Almoxarifado.getAlmoxarifado();

    public boolean adicionar(T produto){
        try{
            estoque.add(produto);
            estoqueGeral.adicionar(produto);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return false;
    }
    public boolean remover(T produto){
        try{
            if(containsProduto(produto)){
                estoque.remove(produto);
                estoqueGeral.remover(produto);
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return false;
    }
    public boolean ver(T produto){
        try{
            if(containsProduto(produto)){
                estoqueGeral.ver(produto);
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return false;
    }

    public boolean alterar(T produtoAtual, T produtoNovo){
        try{
            if(estoque.contains(produtoAtual)){
                estoque.set(estoque.indexOf(produtoAtual),produtoNovo);
                estoqueGeral.alterar(produtoAtual,produtoNovo);
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public boolean containsProduto(T produto) {
        return estoque.contains(produto);
    }
}
