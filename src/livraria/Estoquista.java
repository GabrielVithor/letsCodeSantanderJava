package livraria;
import livraria.produtos.Produto;
import livraria.repositorios.Estoque;

import java.util.List;
import java.util.Map;

public class Estoquista {

    private static Map<String, List<? extends Produto>> estoque = Estoque.getEstoqueGeral().getEstoque();

    private Estoquista() {};

    public  static List<? extends Produto> listarProdutosPorCategoria(Enum categoria){
        List<? extends Produto> list = estoque.get(categoria.name());
        return list;
    };

    public  static  Estoque verificarEstoque() {
        return Estoque.getEstoqueGeral();
    }

    public static Map<String,List<? extends Produto>> listarProdutos(){
        System.out.println(estoque);
        return estoque;
    };




    }
