package livraria;
import livraria.repositorios.Almoxarifado;
import livraria.produtos.Produto;
import java.util.List;
import java.util.Map;

public class Estoquista {

    private static Almoxarifado singleton = Almoxarifado.getAlmoxarifado();
    private static Map<String, List> estoqueGeral = singleton.getEstoqueGeral();

    private Estoquista(){

    }

    public static List listarProdutosPorCategoria(Enum categoria){
        System.out.println(estoqueGeral.get(categoria.name()));
        return estoqueGeral.get(categoria.name());
    };

    public static Almoxarifado getEstoqueGeral() {
        return singleton;
    }

    public static Map<String,List> listarProdutos(){
        System.out.println(estoqueGeral);
        return estoqueGeral;
    };

    public  static Integer mostrarQuantidadePorCategoria(Enum categoria){
        Integer quantidadeCategoria =  estoqueGeral.get(categoria.name()).size();
        System.out.println(quantidadeCategoria);
        return quantidadeCategoria;
    }
    public static <T extends Produto> Integer getQuantidadeProduto(T produto){
        Integer quantidadeCategoria = singleton.quantidadeProduto(produto);
        return quantidadeCategoria;
    }


    }
