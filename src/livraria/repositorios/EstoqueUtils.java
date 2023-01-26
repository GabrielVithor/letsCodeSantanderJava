package livraria.repositorios;

import livraria.produtos.Produto;

import java.util.List;
import java.util.Map;

public abstract class EstoqueUtils<T extends Produto> {
    public abstract Map<String, List<T>> getEstoque();
    public T getProduto(T produto){
        if (containsProduto(produto)) {
            return produto;
        }
        return null;
    }

    public Integer quantidadeProduto(T produto){
        return (int) this.getEstoque().get(produto.getCategoria()).
                stream().filter(this::containsProduto).count();
    }
    public List<T> listarProdutosPorCategoria(Enum categoria){
        if(getEstoque().containsKey(categoria.name())){
            System.out.println(getEstoque().get(categoria.name()));
            System.out.println("TESTE"+ getEstoque().get(categoria.name()));
            return getEstoque().get(categoria.name());
        }
        return null;
    };

    public Integer mostrarQuantidadePorCategoria(Enum categoria){
        Integer quantidadeCategoria =  getEstoque().get(categoria.name()).size();
        System.out.println(quantidadeCategoria);
        return quantidadeCategoria;
    }

    public boolean containsProduto(T produto) {
        return getEstoque().get(produto.getCategoria()).contains(produto);
    }

    public boolean containsCategoria(T produto) {
        return getEstoque().containsKey(produto.getCategoria());
    };
}
