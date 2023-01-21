package livraria;

import livraria.produtos.Produto;

public interface Desconto <T extends Produto>{
    Double gerarDesconto(T produto);
}
