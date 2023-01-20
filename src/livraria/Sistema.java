package livraria;

import java.util.List;
import java.util.Map;

enum Produtos {
    Livro,
    Brinquedos,
    Filmes,
    Jogos,
    AlbunsMusica
};

public class Sistema <T extends Produto>{
    EstoqueGeral estoque = EstoqueGeral.getInstance();
    Estoque<T> estoqueCategoria = new Estoque<>();

    public List<T> listarProdutosPorCategoria(Enum categoria){
        return estoqueCategoria.getEstoque();
    };

    public Map<String,List<Produto>> listarProdutos(){
        return estoque.getEstoqueGeral();
    };

    public Integer mostrarQuantidadePorCategoria(Enum categoria){
        Integer quantidadeCategoria = estoque.getEstoqueGeral().get(categoriaToString(categoria)).size();
        System.out.println(quantidadeCategoria);
        return quantidadeCategoria;
    }

    public static String categoriaToString(Enum categoria){
        return categoria.getClass().getSimpleName();
    }
}
