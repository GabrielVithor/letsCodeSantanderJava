package livraria;

import livraria.produtos.Livro;
import livraria.produtos.Produto;
import livraria.repositorios.Carrinho;

import java.util.List;
import java.util.Map;

public class Desconto {

    private static Double desconto = 0d;

    private Desconto() {
    }

    public static Double aplicarDesconto(Carrinho carrinho) {
        desconto15PercLivro(carrinho);
        return desconto;
    }

    ;

    public static void desconto15PercLivro(Carrinho carrinho) {
        Double total = 0d;
        List<Livro> livros = carrinho.listarProdutosPorCategoria(Produtos.Livro);
        if(livros != null){
            for (Livro livro : livros) {
                total += livro.getPreco();
            }
        }

        if (total >= 200) {
            desconto = total * 0.15;
        }
        System.out.println("Desconto "+ (total*0.15));
    }
}
